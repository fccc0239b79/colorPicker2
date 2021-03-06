package colorpicker2;

import java.awt.Color;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Greg
 */
public class user_menu extends javax.swing.JFrame {

    
    colorPicker settings = new colorPicker();
    
    private Color color;
    
    /**
     * Creates new form user_menu
     */
    public user_menu() {
        initComponents();
        
        
      //  color = settings.setBackgroundColor();
        background(settings.setBackgroundColor());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        menu_lable = new javax.swing.JLabel();
        build_button = new javax.swing.JButton();
        lable = new javax.swing.JLabel();
        setting_button = new javax.swing.JButton();
        log_off_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_lable.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        menu_lable.setText("MENU");

        build_button.setText("Build");
        build_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_buttonActionPerformed(evt);
            }
        });

        lable.setText("Previous Builds");

        setting_button.setText("Settings");
        setting_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setting_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lable)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(build_button)))
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(setting_button))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(menu_lable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(setting_button)
                .addGap(23, 23, 23)
                .addComponent(menu_lable)
                .addGap(18, 18, 18)
                .addComponent(build_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lable)
                .addGap(0, 136, Short.MAX_VALUE))
        );

        log_off_button.setText("Log OFF");
        log_off_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_off_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_off_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(log_off_button)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_off_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_off_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
               
       // LogIn logIn = new LogIn();
      //  logIn.setVisible(true);
    }//GEN-LAST:event_log_off_buttonActionPerformed

    private void build_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_build_buttonActionPerformed

    private void setting_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setting_buttonActionPerformed
        this.setVisible(false);
      // new colorPicker().setVisible(true);
      settings.setVisible(true);
    }//GEN-LAST:event_setting_buttonActionPerformed

    private void background(Color color) {
        //panel.setBackground(Color.WHITE);
        panel.setBackground(color);
    }
    
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
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton build_button;
    private javax.swing.JLabel lable;
    private javax.swing.JButton log_off_button;
    private javax.swing.JLabel menu_lable;
    private javax.swing.JPanel panel;
    private javax.swing.JButton setting_button;
    // End of variables declaration//GEN-END:variables

    
}
