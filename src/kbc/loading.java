/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kbc;

import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author Sanidhya Singh
 */
public class loading extends javax.swing.JFrame {

    /**
     * Creates new form loading
     */
    public loading() {
        initComponents();
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Image/lo.jpg"));
        Image show = icon.getImage();
        Image showscl = show.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon sclit = new ImageIcon(showscl);
        img.setIcon(sclit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        bar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        progress = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 102, 255));
        kGradientPanel1.setkGradientFocus(-500);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 204));
        kGradientPanel1.setLayout(null);

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setForeground(new java.awt.Color(255, 255, 51));
        kGradientPanel1.add(bar);
        bar.setBounds(30, 444, 720, 10);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loading......");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(30, 420, 70, 16);

        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setText("0%");
        kGradientPanel1.add(progress);
        progress.setBounds(720, 420, 30, 16);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lo.jpg"))); // NOI18N
        kGradientPanel1.add(img);
        img.setBounds(240, 30, 310, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(777, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*InputStream music;
        try{
        music=new FileInputStream(new File("src\\image\\kb.wav"));
        AudioStream ad=new AudioStream(music);
        AudioPlayer.player.start(ad);
        } catch(Exception e){
        }*/
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        loading sc=new loading();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
            }
        });
        try{
           for(int i=0;i<=100;i++){
           Thread.sleep(100);
           sc.bar.getValue();
           sc.progress.setText(Integer.toString(i)+"%");
           }
        } catch(Exception e) {
        }
        Home h=new Home();
        h.show();
        sc.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel progress;
    // End of variables declaration//GEN-END:variables

}