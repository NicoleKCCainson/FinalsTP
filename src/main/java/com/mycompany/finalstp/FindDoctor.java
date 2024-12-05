package com.mycompany.finalstp;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.util.Arrays;
import javax.swing.BorderFactory;

public class FindDoctor extends javax.swing.JFrame {

    String Doctor;
    String fileLoc = "C:\\Users\\nicol\\Desktop\\Database\\Doctor";

    public FindDoctor() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Demail = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        DocNum = new javax.swing.JLabel();
        availability = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        Secname = new javax.swing.JLabel();
        Secnum = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        SecEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hmo = new javax.swing.JLabel();
        roomnum = new javax.swing.JLabel();

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1092, 702));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Find Doctors Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 33, -1, -1));

        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 710, -1, -1));

        jButton4.setText("Copy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, -1, -1));

        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 33, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("        To  Look For a Doctor's File Enter Doctor's Name:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1300, 37));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("    Secretary's Information: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1314, 37));

        Demail.setBackground(new java.awt.Color(51, 51, 51));
        Demail.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Demail.setForeground(new java.awt.Color(0, 0, 0));
        Demail.setText(" ");
        Demail.setAlignmentX(0.5F);
        jPanel1.add(Demail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 140, 34));

        lastname.setBackground(new java.awt.Color(51, 51, 51));
        lastname.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        lastname.setForeground(new java.awt.Color(0, 0, 0));
        lastname.setText(" ");
        lastname.setAlignmentX(0.5F);
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 260, 34));

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 0));
        age.setText(" ");
        age.setAlignmentX(0.5F);
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, 30));

        DocNum.setBackground(new java.awt.Color(51, 51, 51));
        DocNum.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        DocNum.setForeground(new java.awt.Color(0, 0, 0));
        DocNum.setText("  ");
        DocNum.setAlignmentX(0.5F);
        jPanel1.add(DocNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 260, 34));

        availability.setBackground(new java.awt.Color(51, 51, 51));
        availability.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        availability.setForeground(new java.awt.Color(0, 0, 0));
        availability.setText(" ");
        availability.setAlignmentX(0.5F);
        jPanel1.add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 340, 40));

        department.setBackground(new java.awt.Color(51, 51, 51));
        department.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        department.setForeground(new java.awt.Color(0, 0, 0));
        department.setText(" ");
        department.setAlignmentX(0.5F);
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 260, 40));

        firstname.setBackground(new java.awt.Color(51, 51, 51));
        firstname.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        firstname.setForeground(new java.awt.Color(0, 0, 0));
        firstname.setText(" ");
        firstname.setAlignmentX(0.5F);
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 254, 34));

        Secname.setBackground(new java.awt.Color(51, 51, 51));
        Secname.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Secname.setForeground(new java.awt.Color(0, 0, 0));
        Secname.setText(" ");
        Secname.setAlignmentX(0.5F);
        jPanel1.add(Secname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 390, 34));

        Secnum.setBackground(new java.awt.Color(51, 51, 51));
        Secnum.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Secnum.setForeground(new java.awt.Color(0, 0, 0));
        Secnum.setText(" ");
        Secnum.setAlignmentX(0.5F);
        jPanel1.add(Secnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 320, 34));

        gender.setBackground(new java.awt.Color(51, 51, 51));
        gender.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setText(" ");
        gender.setAlignmentX(0.5F);
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 30));

        jComboBox2.setEditable(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 193, 233, -1));

        jButton7.setText("Find");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1188, 193, -1, -1));

        SecEmail.setBackground(new java.awt.Color(51, 51, 51));
        SecEmail.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        SecEmail.setForeground(new java.awt.Color(0, 0, 0));
        SecEmail.setText(" ");
        SecEmail.setAlignmentX(0.5F);
        jPanel1.add(SecEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 350, 34));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Doctor's Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 171, 236, -1));

        hmo.setBackground(new java.awt.Color(51, 51, 51));
        hmo.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        hmo.setForeground(new java.awt.Color(0, 0, 0));
        hmo.setText(" ");
        hmo.setAlignmentX(0.5F);
        jPanel1.add(hmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 340, 40));

        roomnum.setBackground(new java.awt.Color(51, 51, 51));
        roomnum.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        roomnum.setForeground(new java.awt.Color(0, 0, 0));
        roomnum.setText(" ");
        roomnum.setAlignmentX(0.5F);
        jPanel1.add(roomnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 140, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 750));
        jPanel1.getAccessibleContext().setAccessibleName("copy");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //prints data
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainFrame dr = new MainFrame();
        dr.setVisible(true);
        dr.pack();
        dr.setLocationRelativeTo(null);
        dr.setResizable(false);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainFrame dr = new MainFrame();
        dr.setVisible(true);
        dr.pack();
        dr.setLocationRelativeTo(null);
        dr.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    //copy
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            File path2 = new File(fileLoc + "\\" + jComboBox2.getSelectedItem().toString() + ".txt");
            String fileName = path2.toString();

            BufferedReader b = new BufferedReader(new FileReader(fileName));
            String s;

            ArrayList<String> files = new ArrayList<>();

            while ((s = b.readLine()) != null) {
                files.add(s);
            }

            String c = files.toString();

            String name = c.split(",")[1];
            String age = c.split(",")[2];
            String department = c.split(",")[3];
            String Gender = c.split(",")[4];
            String contactNo = c.split(",")[5];
            String Room = c.split(",")[6];
            String hmos = c.split(",")[7];
            String avail = c.split(",")[8];
            String email = c.split(",")[9];
            String secName = c.split(",")[11];
            String secNum = c.split(",")[12];
            String secEmail = c.split(",")[13];

            /*
              StringSelection copier = new StringSelection( name + "\n" +age + "\n" + illness + "\n" + Sex + "\n" + Height + "\n" + Weight + "\n" + address + "\n" + CivilStatus + "\n" + Birthday + "\n" + ContactNo+ 
        "\n" + email + "\n" + rName + "\n" + rContact + "\n" + Relationship + "\n" + rEmail + "\n" + rAddress + "\n" + DocTor );
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
          cb.setContents(copier, null);  
             */        } catch (Exception e) {

        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        
            String word = jComboBox2.getEditor().getItem().toString();
        File path = new File(fileLoc);
        File[] files = path.listFiles();
        ArrayList<String> arr = new ArrayList();

        jComboBox2.removeAllItems();

        if (!word.isEmpty()) {

            for (int i = 0; i < files.length;) {
                if (files[i].isFile()) {
                    try {

                        BufferedReader buff = new BufferedReader(new FileReader(files[i]));
                        String s;
                        Arrays.sort(files);

                        while ((s = buff.readLine()) != null) {
                            if (s.trim().contains(word)) {
                                int n = 0;
                                String fileName = files[i].getName().toString().replace(".txt", "");
                                arr.add(fileName);
                                String nn = fileName.split(",")[n];

                                jComboBox2.addItem(nn);
                                n++;

                            }

                        }
                        buff.close();

                    } catch (Exception e) {

                    }
                }
                i++;

            }

        }
        

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        try {
            File path2 = new File(fileLoc + "\\" + jComboBox2.getSelectedItem().toString() + ".txt");
            String fileName = path2.toString();

            BufferedReader b = new BufferedReader(new FileReader(fileName));
            String s;

            ArrayList<String> files = new ArrayList<>();

            while ((s = b.readLine()) != null) {
                files.add(s);
            }

            String c = files.toString();

            String name = c.split(",")[1];
            String age2 = c.split(",")[2];
            String department2 = c.split(",")[3];
            String Gender = c.split(",")[4];
            String contactNo = c.split(",")[5];
            String Room = c.split(",")[6];
            String hmos = c.split(",")[7];
            String avail = c.split(",")[8];
            String email = c.split(",")[9];
            String secName = c.split(",")[11];
            String secNum = c.split(",")[12];
            String secEmail2 = c.split(",")[13];
            
            Demail.setText(email);
            Demail.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            DocNum.setText(contactNo);
            DocNum.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            Secname.setText(secName);
            DocNum.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            Secnum.setText(secNum);
            Secnum.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            age.setText(age2);
            age.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            availability.setText(avail);
            availability.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            department.setText(department2);
            department.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            firstname.setText(name);
            firstname.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            gender.setText(Gender);
            gender.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            hmo.setText(hmos);
            hmo.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            SecEmail.setText(secEmail2);
            SecEmail.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            roomnum.setText(Room);
            roomnum.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FindDoctor fp = new FindDoctor();
                fp.setVisible(true);
                fp.setResizable(false);
                fp.setLocationRelativeTo(null);

            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Demail;
    private javax.swing.JLabel DocNum;
    private javax.swing.JLabel SecEmail;
    private javax.swing.JLabel Secname;
    private javax.swing.JLabel Secnum;
    private javax.swing.JLabel age;
    private javax.swing.JLabel availability;
    private javax.swing.JLabel department;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel hmo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel roomnum;
    // End of variables declaration//GEN-END:variables
}
