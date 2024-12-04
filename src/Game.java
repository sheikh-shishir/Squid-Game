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