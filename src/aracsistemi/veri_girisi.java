package aracsistemi;

public class veri_girisi extends javax.swing.JFrame {

    
    public veri_girisi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        otomobil = new javax.swing.JButton();
        bisiklet = new javax.swing.JButton();
        gemi = new javax.swing.JButton();
        ucak = new javax.swing.JButton();
        ucan_gemi = new javax.swing.JButton();
        bir_onceki = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Veri girişinde bulunacağınız aracı seçiniz ");

        otomobil.setText("Otomobil");
        otomobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otomobilActionPerformed(evt);
            }
        });

        bisiklet.setText("Bisiklet");
        bisiklet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bisikletActionPerformed(evt);
            }
        });

        gemi.setText("Gemi");
        gemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemiActionPerformed(evt);
            }
        });

        ucak.setText("Uçak");
        ucak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucakActionPerformed(evt);
            }
        });

        ucan_gemi.setText("Uçan Gemi");
        ucan_gemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucan_gemiActionPerformed(evt);
            }
        });

        bir_onceki.setText("Bir önceki menüye dön");
        bir_onceki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bir_oncekiActionPerformed(evt);
            }
        });

        cikis.setText("Çıkış");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ucan_gemi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ucak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gemi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bisiklet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otomobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bir_onceki)
                .addGap(33, 33, 33)
                .addComponent(cikis, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otomobil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bisiklet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gemi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ucak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ucan_gemi)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bir_onceki)
                    .addComponent(cikis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otomobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otomobilActionPerformed
        this.setVisible(false);
        oto oto1 = new oto();
        oto1.setTitle("OTOMOBİL");
        oto1.setResizable(false);
        oto1.setLocation(600,400);
        oto1.setVisible(true);
    }//GEN-LAST:event_otomobilActionPerformed

    private void bisikletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bisikletActionPerformed
        this.setVisible(false);
        Bisiklet1 bisiklet = new Bisiklet1();
        bisiklet.setTitle("BİSİKLET");
        bisiklet.setResizable(false);
        bisiklet.setLocation(600,400);
        bisiklet.setVisible(true);
    }//GEN-LAST:event_bisikletActionPerformed

    private void gemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemiActionPerformed
        this.setVisible(false);
        gemi1 gemi = new gemi1();
        gemi.setTitle("GEMİ");
        gemi.setResizable(false);
        gemi.setLocation(600,400);
        gemi.setVisible(true);
    }//GEN-LAST:event_gemiActionPerformed

    private void ucakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucakActionPerformed
        this.setVisible(false);
        ucak1 ucak = new ucak1();
        ucak.setTitle("UÇAK");
        ucak.setResizable(false);
        ucak.setLocation(600,400);
        ucak.setVisible(true);
    }//GEN-LAST:event_ucakActionPerformed

    private void ucan_gemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucan_gemiActionPerformed
        this.setVisible(false);
        ucan_gemi ucangemi = new ucan_gemi();
        ucangemi.setTitle("UÇAN GEMİ");
        ucangemi.setResizable(false);
        ucangemi.setLocation(600,400);
        ucangemi.setVisible(true);
    }//GEN-LAST:event_ucan_gemiActionPerformed

    private void bir_oncekiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_oncekiActionPerformed
        this.setVisible(false);
        Frame1 frame = new Frame1();
        frame.setTitle("ARAÇ SİSTEMİ");
        frame.setResizable(false);
        frame.setLocation(600, 400);
        frame.setVisible(true);
    }//GEN-LAST:event_bir_oncekiActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cikisActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(veri_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(veri_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(veri_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(veri_girisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new veri_girisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bir_onceki;
    private javax.swing.JButton bisiklet;
    private javax.swing.JButton cikis;
    private javax.swing.JButton gemi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton otomobil;
    private javax.swing.JButton ucak;
    private javax.swing.JButton ucan_gemi;
    // End of variables declaration//GEN-END:variables

}
