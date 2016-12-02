/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scott Robinson, lsrobins@uab.edu
 */
public class ShotLoggerMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form ShotLoggerMainWindow
     */
    public ShotLoggerMainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        westPanel = new javax.swing.JPanel();
        teamOneScrollPane = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        eastPanel = new javax.swing.JPanel();
        teamTwoScrollPane = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        southPanel = new javax.swing.JPanel();
        leftFreeThrowButton = new javax.swing.JButton();
        viewStatsButton = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        saveGameButton = new javax.swing.JButton();
        loadGameButton = new javax.swing.JButton();
        rightFreeThrowButton = new javax.swing.JButton();
        northPanel = new javax.swing.JPanel();
        substitutionButton = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        courtLabel = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Team 1 Recent Shots");

        javax.swing.GroupLayout westPanelLayout = new javax.swing.GroupLayout(westPanel);
        westPanel.setLayout(westPanelLayout);
        westPanelLayout.setHorizontalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(westPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamOneScrollPane)
                .addContainerGap())
        );
        westPanelLayout.setVerticalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(westPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamOneScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(westPanel, java.awt.BorderLayout.LINE_START);

        jLabel1.setText("Team 2 Recent Shots");

        javax.swing.GroupLayout eastPanelLayout = new javax.swing.GroupLayout(eastPanel);
        eastPanel.setLayout(eastPanelLayout);
        eastPanelLayout.setHorizontalGroup(
            eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teamTwoScrollPane)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eastPanelLayout.setVerticalGroup(
            eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eastPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamTwoScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(eastPanel, java.awt.BorderLayout.EAST);

        leftFreeThrowButton.setText("Left Court Free Throw");
        leftFreeThrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftFreeThrowButtonActionPerformed(evt);
            }
        });

        viewStatsButton.setText("View Game Stats");

        newGameButton.setText("New Game");

        saveGameButton.setText("Save Game");

        loadGameButton.setText("Load Game");

        rightFreeThrowButton.setText("Right Court Free Throw");
        rightFreeThrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightFreeThrowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout southPanelLayout = new javax.swing.GroupLayout(southPanel);
        southPanel.setLayout(southPanelLayout);
        southPanelLayout.setHorizontalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftFreeThrowButton)
                .addGap(144, 144, 144)
                .addComponent(viewStatsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loadGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(rightFreeThrowButton)
                .addContainerGap())
        );
        southPanelLayout.setVerticalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(southPanelLayout.createSequentialGroup()
                        .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leftFreeThrowButton)
                            .addComponent(rightFreeThrowButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(southPanelLayout.createSequentialGroup()
                        .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(viewStatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saveGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        getContentPane().add(southPanel, java.awt.BorderLayout.SOUTH);

        substitutionButton.setText("Substitution");

        javax.swing.GroupLayout northPanelLayout = new javax.swing.GroupLayout(northPanel);
        northPanel.setLayout(northPanelLayout);
        northPanelLayout.setHorizontalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(substitutionButton)
                .addContainerGap(1499, Short.MAX_VALUE))
        );
        northPanelLayout.setVerticalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, northPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(substitutionButton)
                .addContainerGap())
        );

        getContentPane().add(northPanel, java.awt.BorderLayout.NORTH);

        centerPanel.setLayout(new java.awt.BorderLayout());

        courtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courtLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\lsrob\\Documents\\NetBeansProjects\\BBSL\\src\\resources\\court.png")); // NOI18N
        courtLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        courtLabel.setIconTextGap(0);
        centerPanel.add(courtLabel, java.awt.BorderLayout.CENTER);

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        mainMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        mainMenuBar.add(jMenu2);

        setJMenuBar(mainMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftFreeThrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftFreeThrowButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftFreeThrowButtonActionPerformed

    private void rightFreeThrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightFreeThrowButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightFreeThrowButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShotLoggerMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShotLoggerMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShotLoggerMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShotLoggerMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShotLoggerMainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel courtLabel;
    private javax.swing.JPanel eastPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton leftFreeThrowButton;
    private javax.swing.JButton loadGameButton;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JButton newGameButton;
    private javax.swing.JPanel northPanel;
    private javax.swing.JButton rightFreeThrowButton;
    private javax.swing.JButton saveGameButton;
    private javax.swing.JPanel southPanel;
    private javax.swing.JButton substitutionButton;
    private javax.swing.JScrollPane teamOneScrollPane;
    private javax.swing.JScrollPane teamTwoScrollPane;
    private javax.swing.JButton viewStatsButton;
    private javax.swing.JPanel westPanel;
    // End of variables declaration//GEN-END:variables
}