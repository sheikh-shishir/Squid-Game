
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    
    private void gameScore()
    {
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame ="X";
        }
    }
    
    
    private void WinningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        //Player X Coding
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.orange);
            txtbtn2.setBackground(Color.orange);
            txtbtn3.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn4.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn7.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.orange);
            txtbtn4.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn2.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player O Died!\nPlayer X Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        //Player O Coding
        if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.orange);
            txtbtn2.setBackground(Color.orange);
            txtbtn3.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn4.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn7.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.orange);
            txtbtn4.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn2.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X Died!\nPlayer O Can proceed to Next Level", "Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
            Game game = new Game();
            game.setVisible(true);
            dispose();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
