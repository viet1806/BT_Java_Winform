/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Toanne
 */
public class frmCollectMoney extends javax.swing.JFrame {

    /**
     * Creates new form frmCollectMoney
     */
    public frmCollectMoney() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChisodau = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChisocuoi = new javax.swing.JTextPane();
        btnTinhTienDien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTienDien = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSothang = new javax.swing.JTextPane();
        btnTinhTienInternet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTienInternet = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình thu tiền điện - Internet");

        jLabel1.setText("Chỉ số đầu");

        jLabel2.setText("Chỉ số cuối");

        jScrollPane1.setViewportView(txtChisodau);

        jScrollPane2.setViewportView(txtChisocuoi);

        btnTinhTienDien.setText("Tính tiền điện");
        btnTinhTienDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienDienActionPerformed(evt);
            }
        });

        jLabel3.setText("Thành tiền");

        jScrollPane3.setViewportView(txtTienDien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTinhTienDien, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnTinhTienDien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        jTabbedPane1.addTab("Tính tiền điện", jPanel1);

        jLabel4.setText("Số tháng");

        jScrollPane4.setViewportView(txtSothang);

        btnTinhTienInternet.setText("Tính tiền internet");
        btnTinhTienInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienInternetActionPerformed(evt);
            }
        });

        jLabel5.setText("Thành tiền");

        jScrollPane5.setViewportView(txtTienInternet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTinhTienInternet, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(btnTinhTienInternet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        jTabbedPane1.addTab("Tính tiền internet", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhTienDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienDienActionPerformed
        // TODO add your handling code here:
        String strcsd=this.txtChisodau.getText();
        String strcsc=this.txtChisocuoi.getText();
        
        int chisodau=(int) Double.parseDouble(strcsd);
        int chisocuoi=(int) Double.parseDouble(strcsc);
        if (strcsd==null || strcsd.equals("") || strcsc==null || strcsc.equals("")){
            JOptionPane.showMessageDialog(this, "Chưa nhập đủ");
            return ;
        }
        else if (dungchung.tienich.isNumeric(strcsd)==false){
            JOptionPane.showMessageDialog(this, "Chỉ số đầu phải nhập số");
            return;
        }
        else if (dungchung.tienich.isNumeric(strcsc)==false){
            JOptionPane.showMessageDialog(this, "Chỉ số cuối phải nhập số");
            return;
        }
        else {
            CollectMoneyElectric cclMoneyE = new CollectMoneyElectric(chisodau,chisocuoi);
            this.txtTienDien.setText(String.valueOf(cclMoneyE.calculateMoney()));
        }
    }//GEN-LAST:event_btnTinhTienDienActionPerformed

    private void btnTinhTienInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienInternetActionPerformed
        // TODO add your handling code here:
        String strsothang=this.txtSothang.getText();
        int sothang=(int) Double.parseDouble(strsothang);
        if (strsothang==null || strsothang.equals("")){
            JOptionPane.showMessageDialog(this, "Chưa nhập");
            return ;
        }
        else if (dungchung.tienich.isNumeric(strsothang)==false){
            JOptionPane.showMessageDialog(this, "Số tháng phải nhập số");
            return;
        }
        else if (sothang<0){
            JOptionPane.showMessageDialog(this, "Số tháng không hợp lệ");
            return;
        }
        else {
            CollectMoneyInternet cclMoneyI = new CollectMoneyInternet(sothang);
            this.txtTienInternet.setText(String.valueOf(cclMoneyI.calculateMoney()));
        }
    }//GEN-LAST:event_btnTinhTienInternetActionPerformed

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
            java.util.logging.Logger.getLogger(frmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCollectMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinhTienDien;
    private javax.swing.JButton btnTinhTienInternet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane txtChisocuoi;
    private javax.swing.JTextPane txtChisodau;
    private javax.swing.JTextPane txtSothang;
    private javax.swing.JTextPane txtTienDien;
    private javax.swing.JTextPane txtTienInternet;
    // End of variables declaration//GEN-END:variables
}