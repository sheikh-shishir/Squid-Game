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
   