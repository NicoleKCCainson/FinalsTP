/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalstp;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class ChangePass extends javax.swing.JFrame {

    /**
     * Creates new form ChangePass
     */
    String pass;
    public ChangePass() {
        initComponents();
     showNewPass.setVisible(false);
     showConfirmPass.setVisible(false);
     error.setVisible(false);
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
        jButton2 = new javax.swing.JButton();
        cpPatientName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        togBut1 = new javax.swing.JToggleButton();
        togBut2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        showConfirmPass = new javax.swing.JLabel();
        showNewPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cpPatientName.setForeground(new java.awt.Color(0, 0, 0));
        cpPatientName.setText("Patient Name");
        jPanel1.add(cpPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("                                   You are editing password for:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 470, 40));

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, -1));

        togBut1.setBackground(new java.awt.Color(153, 204, 255));
        togBut1.setForeground(new java.awt.Color(0, 0, 0));
        togBut1.setText("👁️");
        togBut1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                togBut1StateChanged(evt);
            }
        });
        togBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togBut1ActionPerformed(evt);
            }
        });
        jPanel1.add(togBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 26));

        togBut2.setBackground(new java.awt.Color(153, 204, 255));
        togBut2.setForeground(new java.awt.Color(0, 0, 0));
        togBut2.setText("👁️");
        togBut2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                togBut2StateChanged(evt);
            }
        });
        togBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togBut2ActionPerformed(evt);
            }
        });
        jPanel1.add(togBut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 26));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        error.setForeground(new java.awt.Color(0, 0, 0));
        error.setText("Error Message");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        error1.setForeground(new java.awt.Color(0, 0, 0));
        error1.setText("New Password: ");
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 126, 90, 30));

        error2.setForeground(new java.awt.Color(0, 0, 0));
        error2.setText("Confirm Password: ");
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 200, 130, 30));

        showConfirmPass.setForeground(new java.awt.Color(0, 0, 0));
        showConfirmPass.setText("ShowConfirmPass");
        jPanel1.add(showConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 30));

        showNewPass.setForeground(new java.awt.Color(0, 0, 0));
        showNewPass.setText("ShowNewPass");
        jPanel1.add(showNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void togBut1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_togBut1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_togBut1StateChanged

    private void togBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togBut1ActionPerformed
        // TODO add your handling code here:
 String pass = Arrays.toString(jPasswordField1.getPassword());
        if (togBut1.isSelected()) {
             showNewPass.setVisible(true);
            showNewPass.setText(pass.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""));
          
        }
       else{
            showNewPass.setText("");
        }
    }//GEN-LAST:event_togBut1ActionPerformed

    private void togBut2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_togBut2StateChanged
        // TODO add your handling code here
        String pass = Arrays.toString(jPasswordField2.getPassword());
        if (togBut2.isSelected()) {
           showConfirmPass.setVisible(true);
            showConfirmPass.setText(pass.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""));
        }
       else{
            showConfirmPass.setText("");
        }
    }//GEN-LAST:event_togBut2StateChanged

    private void togBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togBut2ActionPerformed
        // TODO add your handling code here:

        if (togBut2.isSelected()) {
            String pass = Arrays.toString(jPasswordField2.getPassword());
          
            showConfirmPass.setText(pass.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""));
        }
        if (!togBut1.isSelected()) {
            showConfirmPass.setText("");
        }
    }//GEN-LAST:event_togBut2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        String p1A = Arrays.toString(jPasswordField1.getPassword());
       String p1= p1A.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
       
       String p2A = Arrays.toString(jPasswordField2.getPassword());
       String p2 = p2A.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
       if(!p1.isBlank()&&!p2.isBlank()){
        
        if(p1.matches(p2)){
          
        try {
        
            
             File path = new File("C:\\Users\\nicol\\Desktop\\Database\\Patient" + "\\" +cpPatientName.getText().toString() + ".txt");
            String fileName = path.toString();
            
            BufferedReader b = new BufferedReader(new FileReader(fileName));
            String s;

            ArrayList<String> files = new ArrayList<>();

            while ((s = b.readLine()) != null) {
                files.add(s.replace(",", "|").replace("[", ""));
            }
            System.out.println(s);
            b.close();
            String c = files.toString();
             
            FileWriter writer = new FileWriter(path); 
             for(int i = 0; i < 22;){
            writer.write(c.split(",")[i]+"\n");
                System.out.println(c.split(",")[i]);
            i++;
            }
    
            writer.write("Password:"+p2);
            
            writer.close();
            
            sub sub = new sub();
            sub.setVisible(true);
            sub.setResizable(false);
            sub.setLocationRelativeTo(null);
            this.dispose();

        } catch (Exception e) {

        }
         
           
       }else{
            error.setForeground(Color.red);
            error.setVisible(true);
       }
       }else{
       
       
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:
        
         error.setVisible(false);
        String passField1 = Arrays.toString(jPasswordField1.getPassword());
        
            if(togBut1.isSelected()){
                showNewPass.setVisible(true);
                showNewPass.setText(passField1.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""));
            } else{
            
            showNewPass.setText("");
            }
            
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                setPass(passField1.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""));
                jPasswordField2.requestFocus();
            }
        
        
        
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
        // TODO add your handling code here:
          String passField2 = Arrays.toString(jPasswordField2.getPassword());
        
            if(togBut2.isSelected()){
                showConfirmPass.setVisible(true);
                showConfirmPass.setText(passField2.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""));
            } else{
            
                showConfirmPass.setText("");
            }
            
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                
                if(!getPass().matches(passField2.toString().replace(",", "").replace("]", "").replace("[", "").replace(" ", ""))){
                    error.setVisible(true);
                }
                
            }
        
    }//GEN-LAST:event_jPasswordField2KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
public void setPass(String pass){
    this.pass = pass;
}

public String getPass(){
    return pass;
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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cpPatientName;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel showConfirmPass;
    private javax.swing.JLabel showNewPass;
    private javax.swing.JToggleButton togBut1;
    private javax.swing.JToggleButton togBut2;
    // End of variables declaration//GEN-END:variables
}