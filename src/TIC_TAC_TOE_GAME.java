
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(204, 204, 204));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtexit.setForeground(new java.awt.Color(255, 0, 51));
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(204, 204, 204));
        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtreset.setForeground(new java.awt.Color(0, 153, 255));
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        playerx.setBackground(new java.awt.Color(204, 0, 0));
        playerx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerx.setText("Player X:");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playero.setText("Player O:");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerooo.setForeground(new java.awt.Color(51, 153, 0));
        playerooo.setText("0");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(51, 153, 0));
        playerxxx.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("RESULT BOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerx)
                    .addComponent(playero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerooo)
                    .addComponent(playerxxx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(playerxxx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(playerooo))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtbtn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtbtn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtbtn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

