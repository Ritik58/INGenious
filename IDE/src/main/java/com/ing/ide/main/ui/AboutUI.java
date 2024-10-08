
package com.ing.ide.main.ui;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 *
 */
public class AboutUI extends javax.swing.JDialog {

    private static AboutUI abtUI;

    public AboutUI() {
        super(new JFrame());
        initComponents();
        detailsPane.setText(About.getDetailsAsHTML());
        setSize(500, 600);
        setImage();
    }

    private void setImage() {
        try {
            BufferedImage img = ImageIO.read(getClass().getResource("/ui/resources/splash.png"));
            Image dimg = img.getScaledInstance(500, img.getHeight() - 50, Image.SCALE_SMOOTH);
            iconLabel.setIcon(new javax.swing.ImageIcon(dimg));
        } catch (IOException ex) {
            Logger.getLogger(AboutUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showUI() {
        if (abtUI == null) {
            abtUI = new AboutUI();
        }
        abtUI.setLocationRelativeTo(null);
        abtUI.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsPane = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/resources/favicon.png"))); // NOI18N
        jPanel1.add(iconLabel, java.awt.BorderLayout.CENTER);
        jPanel1.add(filler1, java.awt.BorderLayout.PAGE_END);
        jPanel1.add(filler2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setMaximumSize(new java.awt.Dimension(2147483647, 113));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jTextPane1.setEditable(false);
        jTextPane1.setContentType("text/html"); // NOI18N
        jTextPane1.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jTextPane1.setText("<html> <body> INGenious is a test automation platform that provides a unified interface for all the \"day-to-day\" test automation activities such as test design, test development, test execution, reporting and maintenance <p>Visit <a href=\"https://ing-bank.github.io/ingenious-doc/\">INGenious Documentation</a>&nbsp;for more details</p> </body> </html>");
        jScrollPane3.setViewportView(jTextPane1);

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        detailsPane.setEditable(false);
        detailsPane.setContentType("text/html"); // NOI18N
        detailsPane.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(detailsPane);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane detailsPane;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
