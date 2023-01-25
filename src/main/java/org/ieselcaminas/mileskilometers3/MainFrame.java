/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.ieselcaminas.mileskilometers3;

import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class MainFrame extends javax.swing.JFrame {
    
    public static final double KMS_PER_MILE = 1.60934; 

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMiles = new javax.swing.JLabel();
        labelKms = new javax.swing.JLabel();
        textFieldMiles = new javax.swing.JTextField();
        textFieldKilometers = new javax.swing.JTextField();
        buttonConvertToKms = new javax.swing.JButton();
        buttonConvertToMiles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelMiles.setText("Miles");

        labelKms.setText("Kilometers");

        buttonConvertToKms.setText("Convert");
        buttonConvertToKms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertToKmsActionPerformed(evt);
            }
        });

        buttonConvertToMiles.setText("Convert");
        buttonConvertToMiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertToMilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMiles)
                    .addComponent(labelKms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldMiles, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(textFieldKilometers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonConvertToKms)
                    .addComponent(buttonConvertToMiles))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMiles)
                    .addComponent(textFieldMiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConvertToKms))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKms)
                    .addComponent(textFieldKilometers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConvertToMiles))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonConvertToKmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertToKmsActionPerformed
        // Convert miles to kilometers
        String text = textFieldMiles.getText();
        try {
            double miles = Double.parseDouble(text);
            double kms = miles * KMS_PER_MILE;
            textFieldKilometers.setText("" + kms);
        } catch(NumberFormatException ex) {
            showMessageOnlyNumbers();
            // Test
        }
            
    }//GEN-LAST:event_buttonConvertToKmsActionPerformed

    private void buttonConvertToMilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertToMilesActionPerformed
        String text = textFieldKilometers.getText();
        try {
            double kms = Double.parseDouble(text);
            double miles = kms / KMS_PER_MILE;
            textFieldMiles.setText("" + miles);
        } catch(NumberFormatException ex) {
            showMessageOnlyNumbers();
        }
    }//GEN-LAST:event_buttonConvertToMilesActionPerformed

    private void showMessageOnlyNumbers() {
        JOptionPane.showMessageDialog(null, "Only numbers");
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConvertToKms;
    private javax.swing.JButton buttonConvertToMiles;
    private javax.swing.JLabel labelKms;
    private javax.swing.JLabel labelMiles;
    private javax.swing.JTextField textFieldKilometers;
    private javax.swing.JTextField textFieldMiles;
    // End of variables declaration//GEN-END:variables
}
