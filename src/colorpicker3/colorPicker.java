package colorpicker3;


import java.awt.Color;

/**
 *
 * @author Pawel
 */
public class colorPicker extends javax.swing.JFrame {
    
    
    
   private boolean flag = true;
   
   private Color color;
   
   protected Color rgbRED;
   protected Color rgbBLUE;
   protected Color rgbGREEN;
   protected Color rgbWHITE;
   protected Color rgbYELLOW;
   protected Color rgbGREY;
   protected Color rgbORANGE;
   protected Color rgbBLACK;
   
  
   
    
    /**
     * Creates new form colorPicker
     */
    public colorPicker() {
       
        
        initComponents();
        
   // color = Color.WHITE;
        
                 System.out.println(color);

     // panel.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        pickColorBtn = new javax.swing.JButton();
        colorPanel = new javax.swing.JPanel();
        red = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        green = new javax.swing.JButton();
        white = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        grey = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        black = new javax.swing.JButton();
        language = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();
        acceptBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(878, 490));
        setMinimumSize(new java.awt.Dimension(878, 490));

        panel.setMaximumSize(new java.awt.Dimension(878, 501));
        panel.setMinimumSize(new java.awt.Dimension(878, 501));

        pickColorBtn.setText("Pick color...");
        pickColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickColorBtnActionPerformed(evt);
            }
        });

        colorPanel.setVisible(false);

        red.setBackground(new java.awt.Color(255, 153, 153));
        red.setMaximumSize(new java.awt.Dimension(70, 70));
        red.setMinimumSize(new java.awt.Dimension(70, 70));
        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });

        blue.setBackground(new java.awt.Color(204, 204, 255));
        blue.setMaximumSize(new java.awt.Dimension(70, 70));
        blue.setMinimumSize(new java.awt.Dimension(70, 70));
        blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueActionPerformed(evt);
            }
        });

        green.setBackground(new java.awt.Color(153, 255, 153));
        green.setMaximumSize(new java.awt.Dimension(70, 70));
        green.setMinimumSize(new java.awt.Dimension(70, 70));
        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });

        white.setBackground(new java.awt.Color(255, 255, 255));
        white.setMaximumSize(new java.awt.Dimension(70, 70));
        white.setMinimumSize(new java.awt.Dimension(70, 70));
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });

        yellow.setBackground(new java.awt.Color(255, 255, 204));
        yellow.setMaximumSize(new java.awt.Dimension(70, 70));
        yellow.setMinimumSize(new java.awt.Dimension(70, 70));
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });

        grey.setBackground(new java.awt.Color(204, 204, 204));
        grey.setMaximumSize(new java.awt.Dimension(70, 70));
        grey.setMinimumSize(new java.awt.Dimension(70, 70));
        grey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyActionPerformed(evt);
            }
        });

        orange.setBackground(new java.awt.Color(255, 204, 102));
        orange.setMaximumSize(new java.awt.Dimension(70, 70));
        orange.setMinimumSize(new java.awt.Dimension(70, 70));
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });

        black.setBackground(new java.awt.Color(102, 102, 102));
        black.setMaximumSize(new java.awt.Dimension(70, 70));
        black.setMinimumSize(new java.awt.Dimension(70, 70));
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        //colorPanel.setBackground(Color.WHITE);

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grey, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grey, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(black, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        /**
        * set rgb(color) on the red;
        */
        rgbRED = new java.awt.Color(255, 153, 153);
        /**
        * set rgb(color) on the blue;
        */
        rgbBLUE = new java.awt.Color(204, 204, 255);
        /**
        * set rgb(color) on the green;
        */
        rgbGREEN = new java.awt.Color(153, 255, 153);
        /**
        * set rgb(color) on the white;
        */
        rgbWHITE = new java.awt.Color(255, 255, 255);
        /**
        * set rgb(color) on the yellow;
        */
        rgbYELLOW = new java.awt.Color(255, 255, 204);
        /**
        * set rgb(color) on the grey;
        */
        rgbGREY = new java.awt.Color(204, 204, 204);
        /**
        * set rgb(color) on the orange;
        */
        rgbORANGE = new java.awt.Color(255, 204, 102);
        /**
        * set rgb(color) on the black;
        */
        rgbBLACK = new java.awt.Color(102, 102, 102);

        language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select language...", "English", "Polski" }));
        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Settings");

        back.setText("< BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        acceptBtn.setText("ACCEPT");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pickColorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(language, 0, 135, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acceptBtn))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back)
                    .addComponent(acceptBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickColorBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        setBackground(rgbBLACK);
        
    }//GEN-LAST:event_blackActionPerformed

    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
        setBackground(rgbORANGE);
    }//GEN-LAST:event_orangeActionPerformed

    private void greyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyActionPerformed
        setBackground(rgbGREY);
    }//GEN-LAST:event_greyActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        setBackground(rgbYELLOW);
    }//GEN-LAST:event_yellowActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        setBackground(rgbWHITE);
    }//GEN-LAST:event_whiteActionPerformed

    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        setBackground(rgbGREEN);
    }//GEN-LAST:event_greenActionPerformed

    private void blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueActionPerformed
        setBackground(rgbBLUE);
    }//GEN-LAST:event_blueActionPerformed

    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        setBackground(rgbRED);
       color = rgbRED;
    }//GEN-LAST:event_redActionPerformed

    private void pickColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickColorBtnActionPerformed

        if(flag) {
            colorPanel.setVisible(true);
            flag = !flag;
        }
        else {
            colorPanel.setVisible(false);
            flag = !flag;
        }
    }//GEN-LAST:event_pickColorBtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
  
    }//GEN-LAST:event_backActionPerformed

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

    /**
     * accept btn saves settings: background colour and language
     * @param evt 
     */
    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptBtnActionPerformed

    /**
     * method sets background colour;
     * @param color - rgb set by a red btn
     */
    public void setBackground(Color rgb) {
       // System.out.println(rgb);
        if(!flag) {
            panel.setBackground(rgb);
            colorPanel.setBackground(rgb);
        } else {
              flag = !flag;         
        }
    }
    
    public Color getRGB() {
        System.out.println(color);
        return color;
    }

     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(colorPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colorPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colorPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colorPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colorPicker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton back;
    private javax.swing.JButton black;
    private javax.swing.JButton blue;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JButton green;
    private javax.swing.JButton grey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> language;
    private javax.swing.JButton orange;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pickColorBtn;
    private javax.swing.JButton red;
    private javax.swing.JButton white;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables
}
