/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package squid_game;

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
    
    String footsteps = "/squid_game/image/foot.png";
    String cracks = "/squid_game/image/crack.png";


    
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
        
        
    
        
                // set image
        displayImage(footsteps,jLabel_PlayerStart);
        
          // add jlabels to the labels table
        labels = new JLabel[][]{{jLabel_1_1,jLabel_1_2},{jLabel_2_1,jLabel_2_2},
                                {jLabel_3_1,jLabel_3_2},{jLabel_4_1,jLabel_4_2},
                                {jLabel_5_1,jLabel_5_2}};
        
        
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
                            
                        }
                        counter++;
                        
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
                        }
                        
                        counter++;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel_Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_1_1;
    private javax.swing.JLabel jLabel_1_2;
    private javax.swing.JLabel jLabel_2_1;
    private javax.swing.JLabel jLabel_2_2;
    private javax.swing.JLabel jLabel_3_1;
    private javax.swing.JLabel jLabel_3_2;
    private javax.swing.JLabel jLabel_4_1;
    private javax.swing.JLabel jLabel_4_2;
    private javax.swing.JLabel jLabel_5_1;
    private javax.swing.JLabel jLabel_5_2;
    private javax.swing.JLabel jLabel_PlayerFinal;
    private javax.swing.JLabel jLabel_PlayerStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Final;
    private javax.swing.JPanel jPanel_Start;
    // End of variables declaration//GEN-END:variables
}
