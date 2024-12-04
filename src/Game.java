/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.util.Scanner;
 
/**
 *
 * @author macbookair
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    
    //create a black border

    Border black_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
     
//    String footsteps = "\\/image/foot.png";
//    String cracks = "\\/image/crack.png";
    
    String footsteps = "/image/foot.png";
    String cracks = "/image/crack.png";


    
        // jpanel component
    Component[] comp1;
    Component[] comp2;
    
    Random random = new Random();
    String randomImage;
    
    JLabel[][] labels;
    String[][] imagesOrder = new String[5][2];
    ArrayList<String> list = new ArrayList<>();
    
    int counter = 0;
    boolean won = true;
     
            
    public Game() {
        initComponents();
        
        // center this form
        this.setLocationRelativeTo(null);
        
            // set borders
        jPanel_Start.setBorder(black_border);
        jPanel_Final.setBorder(black_border);
        jLabel_PlayerStart.setBorder(black_border);
        jLabel_PlayerFinal.setBorder(black_border);
        
                // set image
        displayImage(footsteps,jLabel_PlayerStart);
        
          // add jlabels to the labels table
        labels = new JLabel[][]{{jLabel_1_1,jLabel_1_2},{jLabel_2_1,jLabel_2_2},
                                {jLabel_3_1,jLabel_3_2},{jLabel_4_1,jLabel_4_2},
                                {jLabel_5_1,jLabel_5_2}};
        
            // disable all labels
        for(JLabel[] lbls : labels )
        {
            lbls[0].setEnabled(false);
            lbls[1].setEnabled(false);
        }
        
        // add images to the list
        list.add(footsteps);
        list.add(cracks);
        
         // get component from jpanels
        comp1 = jPanel2.getComponents();
        comp2 = jPanel3.getComponents();
        
        
        
        
        // populate table with images in random order
        randomImages();
        
        // add actions to jlabels
        addAction();
       
        
    }
    
        // create a function to enable jlabels
    public void enableLabels(int index)
    {
        if(index <= labels.length-1 )
        {
            JLabel[] lbls = labels[index];
            lbls[0].setEnabled(true);
            lbls[1].setEnabled(true);
        }
    }
    
      // create a function to get random images
    public void randomImages()
    {
        for(int i = 0; i < labels.length; i++)
        {
            // get random images
            randomImage = list.get(random.nextInt(list.size()));
            imagesOrder[i][0] = randomImage;
            
            // get a different image
            if(randomImage.equals(footsteps))
            {
              imagesOrder[i][1] = cracks;
            }
            else
            {
                imagesOrder[i][1] = footsteps;
            }
            
            System.out.println(imagesOrder[i][1]);
            System.out.println(imagesOrder[i][0]);
            System.out.println("--------------");
        }
    }

    
    // a function to add actions to jLabels when we click
    public void addAction()
    {
        
        enableLabels(counter);
                
        for (Component comp: comp1)
        {
            if(comp instanceof JLabel)
            {
                JLabel label = (JLabel) comp;
                label.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        if(label.isEnabled())
                        {
                            
                        displayImage(imagesOrder[counter][1],label);
                        if(imagesOrder[counter][1].equals(cracks))
                        {
                            won = false;
                        }
                        
                        //disable jlabel
                        label.setEnabled(false);
                        JLabel label = (JLabel) comp2[counter];
                        label.setEnabled(false);
                        
                        if(counter == imagesOrder.length-1 && won == true)
                        {
                            displayImage(footsteps,jLabel_PlayerFinal);
                            jLabel_message.setText("You have won, 축하해요");
                        }else if(won == false)
                        {
                            jLabel_message.setText("You have lost, 다시 시도");
                        }
                            
                        counter++;
                        enableLabels(counter);
                        }
                        
                    }
                    
                    
                });
                
            }
        }
          for (Component comp: comp2)
        {
            if(comp instanceof JLabel)
            {
                JLabel label = (JLabel) comp;
                label.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        if(label.isEnabled())
                        {
                        displayImage(imagesOrder[counter][0],label);
                        
                        if(imagesOrder[counter][0].equals(cracks))
                        {
                            won = false;
                        }
                        
                        //disable jlabel
                        label.setEnabled(false);
                        JLabel label = (JLabel) comp1[counter];
                        label.setEnabled(false);
                        
                        if(counter == labels.length-1 && won == true)
                        {
                            displayImage(footsteps,jLabel_PlayerFinal);
                            jLabel_message.setText("You have won, 축하해요");
                        }else if(won == false)
                        {
                            jLabel_message.setText("You have lost, 다시 시도");
                        }
                        counter++;
                        enableLabels(counter);
                        }
                    }
                });
                
                
            }
        }
    }
    
    
    
    public void displayImage(String imgPath, JLabel label) {
        
    URL location = getClass().getResource(imgPath);
    if (location == null) {
        System.err.println("Error: Image resource not found at " + imgPath);
        return; // Exit the method to prevent a NullPointerException
    }
    
    ImageIcon imgIco = new ImageIcon(location);
    Image image = imgIco.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(image));
}

    
//    // a function to display image
//    public void displayImage(String imgPath,JLabel label)
//    {
//        
//        // get the image
//        ImageIcon imgIco = new ImageIcon(getClass().getResource(imgPath));
//        
//         // make the image fit the given jlabel
//        Image image = imgIco.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
//        
//          // set the image into the jlabel
//       label.setIcon(new ImageIcon(image));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Start = new javax.swing.JPanel();
        jLabel_PlayerStart = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_2_2 = new javax.swing.JLabel();
        jLabel_3_2 = new javax.swing.JLabel();
        jLabel_4_2 = new javax.swing.JLabel();
        jLabel_1_2 = new javax.swing.JLabel();
        jLabel_5_2 = new javax.swing.JLabel();
        jPanel_Final = new javax.swing.JPanel();
        jLabel_PlayerFinal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_2_1 = new javax.swing.JLabel();
        jLabel_3_1 = new javax.swing.JLabel();
        jLabel_4_1 = new javax.swing.JLabel();
        jLabel_1_1 = new javax.swing.JLabel();
        jLabel_5_1 = new javax.swing.JLabel();
        jButton_PlayAgain = new javax.swing.JButton();
        jLabel_message = new javax.swing.JLabel();

 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Start.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel_StartLayout = new javax.swing.GroupLayout(jPanel_Start);
        jPanel_Start.setLayout(jPanel_StartLayout);
        jPanel_StartLayout.setHorizontalGroup(
            jPanel_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_StartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_PlayerStart, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_StartLayout.setVerticalGroup(
            jPanel_StartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_StartLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel_PlayerStart, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel_2_2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_2_2.setOpaque(true);

        jLabel_3_2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_3_2.setOpaque(true);

        jLabel_4_2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_4_2.setOpaque(true);

        jLabel_1_2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_1_2.setOpaque(true);

        jLabel_5_2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_5_2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_2_2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_3_2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_4_2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_5_2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_1_2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel_Final.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel_FinalLayout = new javax.swing.GroupLayout(jPanel_Final);
        jPanel_Final.setLayout(jPanel_FinalLayout);
        jPanel_FinalLayout.setHorizontalGroup(
            jPanel_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_PlayerFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_FinalLayout.setVerticalGroup(
            jPanel_FinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FinalLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel_PlayerFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel_2_1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_2_1.setOpaque(true);

        jLabel_3_1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_3_1.setOpaque(true);

        jLabel_4_1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_4_1.setOpaque(true);

        jLabel_1_1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_1_1.setOpaque(true);

        jLabel_5_1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel_5_1.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_2_1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_3_1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_4_1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_5_1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel_1_1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton_PlayAgain.setBackground(new java.awt.Color(51, 102, 0));
        jButton_PlayAgain.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton_PlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        jButton_PlayAgain.setText("Play Again");
        jButton_PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PlayAgainActionPerformed(evt);
            }
        });
