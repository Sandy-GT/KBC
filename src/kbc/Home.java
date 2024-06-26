/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kbc;

import javax.swing.JOptionPane;

/**
 *
 * @author Sanidhya Singh
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        kButton1.setText("Play");
        kButton1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(51, 102, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(204, 102, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(242, 242, 242));
        kButton1.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        kButton1.setkStartColor(new java.awt.Color(102, 0, 204));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton1);
        kButton1.setBounds(420, 380, 170, 30);

        kButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        kButton2.setText("?");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(255, 51, 51));
        kButton2.setkEndColor(new java.awt.Color(255, 51, 51));
        kButton2.setkFillButton(false);
        kButton2.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton2.setkStartColor(new java.awt.Color(0, 204, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2);
        kButton2.setBounds(990, 410, 30, 30);

        kButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        kButton3.setText("X");
        kButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(255, 51, 51));
        kButton3.setkEndColor(new java.awt.Color(255, 51, 51));
        kButton3.setkFillButton(false);
        kButton3.setkHoverForeGround(new java.awt.Color(255, 0, 0));
        kButton3.setkStartColor(new java.awt.Color(204, 51, 0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton3);
        kButton3.setBounds(990, 10, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kbc1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 448);

        setSize(new java.awt.Dimension(1024, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Every Question is required to attempt.\n"+
        "If someone chooses incoorect option he/she will be back to home page.\n"+
        "Each question has a 10 ranking point.\n"+
        "After attempting all the question correctly.\n"+
        "Your Score will be displayed.\n"+
        "!!!!Good Luck!!!!");
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        Q1 w=new Q1();
        w.show();
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    // End of variables declaration//GEN-END:variables
}
