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

public class FindPatient extends javax.swing.JFrame implements find{

    String Doctor;
    String PatientF;
    String fileLoc = "C:\\Users\\nicol\\Desktop\\Database\\Patient";

    public FindPatient() {
        initComponents();
        jButton3.setEnabled(false);
        jButton8.setEnabled(false);
        jButton6.setEnabled(false);
        jLabel3.setVisible(false);

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
        Allergies1 = new javax.swing.JLabel();
        rAddress1 = new javax.swing.JLabel();
        Age1 = new javax.swing.JLabel();
        Sex1 = new javax.swing.JLabel();
        Height1 = new javax.swing.JLabel();
        Address1 = new javax.swing.JLabel();
        Weight1 = new javax.swing.JLabel();
        CivilStatus1 = new javax.swing.JLabel();
        Birthday1 = new javax.swing.JLabel();
        ContactNum1 = new javax.swing.JLabel();
        PatientIS = new javax.swing.JLabel();
        nameFull1 = new javax.swing.JLabel();
        rName1 = new javax.swing.JLabel();
        rContactNum1 = new javax.swing.JLabel();
        rEmail1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BloodType = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        illness1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel3 = new javax.swing.JLabel();
        rRelation1 = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Doctor1 = new javax.swing.JLabel();

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
        jLabel1.setText("Find Patient Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 33, -1, -1));

        jButton2.setBackground(new java.awt.Color(68, 114, 196));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Done");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 640, 60, 30));

        jButton4.setBackground(new java.awt.Color(68, 114, 196));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Copy");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 60, 30));

        jButton5.setBackground(new java.awt.Color(68, 114, 196));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("        To  Look For a Patient's File Enter Patient's Name:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1310, 37));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("    Emergency Contact Information: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 1320, 37));

        Allergies1.setBackground(new java.awt.Color(51, 51, 51));
        Allergies1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Allergies1.setForeground(new java.awt.Color(0, 0, 0));
        Allergies1.setText(" ");
        Allergies1.setAlignmentX(0.5F);
        jPanel1.add(Allergies1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 254, 47));

        rAddress1.setBackground(new java.awt.Color(51, 51, 51));
        rAddress1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        rAddress1.setForeground(new java.awt.Color(0, 0, 0));
        rAddress1.setText(" ");
        rAddress1.setAlignmentX(0.5F);
        jPanel1.add(rAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 630, 34));

        Age1.setBackground(new java.awt.Color(51, 51, 51));
        Age1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Age1.setForeground(new java.awt.Color(0, 0, 0));
        Age1.setText(" ");
        Age1.setAlignmentX(0.5F);
        jPanel1.add(Age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 254, 34));

        Sex1.setBackground(new java.awt.Color(51, 51, 51));
        Sex1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Sex1.setForeground(new java.awt.Color(0, 0, 0));
        Sex1.setText(" ");
        Sex1.setAlignmentX(0.5F);
        jPanel1.add(Sex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 254, 34));

        Height1.setBackground(new java.awt.Color(51, 51, 51));
        Height1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Height1.setForeground(new java.awt.Color(0, 0, 0));
        Height1.setText(" ");
        Height1.setAlignmentX(0.5F);
        jPanel1.add(Height1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 254, 34));

        Address1.setBackground(new java.awt.Color(51, 51, 51));
        Address1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Address1.setForeground(new java.awt.Color(0, 0, 0));
        Address1.setText(" ");
        Address1.setAlignmentX(0.5F);
        jPanel1.add(Address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 570, 34));

        Weight1.setBackground(new java.awt.Color(51, 51, 51));
        Weight1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Weight1.setForeground(new java.awt.Color(0, 0, 0));
        Weight1.setText(" ");
        Weight1.setAlignmentX(0.5F);
        jPanel1.add(Weight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 254, 33));

        CivilStatus1.setBackground(new java.awt.Color(51, 51, 51));
        CivilStatus1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        CivilStatus1.setForeground(new java.awt.Color(0, 0, 0));
        CivilStatus1.setText(" ");
        CivilStatus1.setAlignmentX(0.5F);
        jPanel1.add(CivilStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 254, 34));

        Birthday1.setBackground(new java.awt.Color(51, 51, 51));
        Birthday1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Birthday1.setForeground(new java.awt.Color(0, 0, 0));
        Birthday1.setText(" ");
        Birthday1.setAlignmentX(0.5F);
        jPanel1.add(Birthday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 254, 34));

        ContactNum1.setBackground(new java.awt.Color(51, 51, 51));
        ContactNum1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        ContactNum1.setForeground(new java.awt.Color(0, 0, 0));
        ContactNum1.setText(" ");
        ContactNum1.setAlignmentX(0.5F);
        jPanel1.add(ContactNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 254, 34));

        PatientIS.setBackground(new java.awt.Color(51, 51, 51));
        PatientIS.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        PatientIS.setForeground(new java.awt.Color(0, 0, 0));
        PatientIS.setText(" ");
        PatientIS.setAlignmentX(0.5F);
        jPanel1.add(PatientIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 254, 34));

        nameFull1.setBackground(new java.awt.Color(51, 51, 51));
        nameFull1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        nameFull1.setForeground(new java.awt.Color(0, 0, 0));
        nameFull1.setAlignmentX(0.5F);
        jPanel1.add(nameFull1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 254, 34));

        rName1.setBackground(new java.awt.Color(51, 51, 51));
        rName1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        rName1.setForeground(new java.awt.Color(0, 0, 0));
        rName1.setText(" ");
        rName1.setAlignmentX(0.5F);
        jPanel1.add(rName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 270, 34));

        rContactNum1.setBackground(new java.awt.Color(51, 51, 51));
        rContactNum1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        rContactNum1.setForeground(new java.awt.Color(0, 0, 0));
        rContactNum1.setText(" ");
        rContactNum1.setAlignmentX(0.5F);
        jPanel1.add(rContactNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 320, 34));

        rEmail1.setBackground(new java.awt.Color(51, 51, 51));
        rEmail1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        rEmail1.setForeground(new java.awt.Color(0, 0, 0));
        rEmail1.setText(" ");
        rEmail1.setAlignmentX(0.5F);
        jPanel1.add(rEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 270, 34));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setEditable(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 193, 233, -1));

        jButton7.setBackground(new java.awt.Color(68, 114, 196));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Find");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1188, 193, 40, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Patient Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 171, 236, -1));

        BloodType.setBackground(new java.awt.Color(51, 51, 51));
        BloodType.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        BloodType.setForeground(new java.awt.Color(0, 0, 0));
        BloodType.setText(" ");
        BloodType.setAlignmentX(0.5F);
        jPanel1.add(BloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 254, 34));

        jButton3.setBackground(new java.awt.Color(68, 114, 196));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Edit Patient Information");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 280, 30));

        jButton6.setBackground(new java.awt.Color(68, 114, 196));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("View Patient Records");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 280, 30));

        jButton8.setBackground(new java.awt.Color(68, 114, 196));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Add New Record");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 280, 30));

        illness1.setBackground(new java.awt.Color(51, 51, 51));
        illness1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        illness1.setForeground(new java.awt.Color(0, 0, 0));
        illness1.setText(" ");
        illness1.setAlignmentX(0.5F);
        jPanel1.add(illness1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 254, 47));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Please select a Patient.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 380, -1, 20));

        rRelation1.setBackground(new java.awt.Color(51, 51, 51));
        rRelation1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        rRelation1.setForeground(new java.awt.Color(0, 0, 0));
        rRelation1.setText(" ");
        rRelation1.setAlignmentX(0.5F);
        jPanel1.add(rRelation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 270, 34));

        Email1.setBackground(new java.awt.Color(51, 51, 51));
        Email1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Email1.setForeground(new java.awt.Color(0, 0, 0));
        Email1.setText(" ");
        Email1.setAlignmentX(0.5F);
        jPanel1.add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 254, 34));

        Doctor1.setBackground(new java.awt.Color(51, 51, 51));
        Doctor1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Doctor1.setForeground(new java.awt.Color(0, 0, 0));
        Doctor1.setText(" ");
        Doctor1.setAlignmentX(0.5F);
        jPanel1.add(Doctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 254, 34));

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
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainFrame dr = new MainFrame();
        dr.setVisible(true);
        dr.pack();
        dr.setLocationRelativeTo(null);
        dr.setResizable(false);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

  
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      //copy  
      copy();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.setResizable(false);
        mf.setLocationRelativeTo(null);
        
           this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
      find();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        itemSelect();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       
        Password pw = new Password();
        pw.setVisible(true);
        pw.setLocationRelativeTo(null);
        pw.setAlwaysOnTop(true);
        pw.setResizable(false);
        pw.setFrame(1);
        String n = jComboBox2.getEditor().getItem().toString();
       pw.jLabel1.setText(n);
       
        System.out.println(n);
        setPatientF(jComboBox2.getSelectedItem().toString());
      
        this.dispose();
        
        
       

    }

    public void setPatientF(String PatientF) {
        this.PatientF = PatientF;
    }

    public String getPatientF() {
        return PatientF;

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
// TODO add your handling code here:
      Password pw = new Password();
        pw.setVisible(true);
        pw.setLocationRelativeTo(null);
        pw.setAlwaysOnTop(true);
        pw.setResizable(false);
        pw.jLabel1.setText(jComboBox2.getSelectedItem().toString());
         pw.setFrame(2);
           this.dispose();
        
   
    }//GEN-LAST:event_jButton8ActionPerformed


    @Override
    public void find(){
         String word = jComboBox2.getEditor().getItem().toString().toUpperCase();
        
        if(!word.isEmpty()){ 
        jButton3.setEnabled(true);
        jButton8.setEnabled(true);
        jButton6.setEnabled(true);
        
        }else{
        jLabel3.setVisible(true);
        }
        
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
    }
    
    @Override
    public void itemSelect(){
          try {
            File path2 = new File(fileLoc + "\\" + jComboBox2.getSelectedItem().toString().toUpperCase() + ".txt");
            String fileName = path2.toString();

            BufferedReader b = new BufferedReader(new FileReader(fileName));
            String s;

            ArrayList<String> files = new ArrayList<>();

            while ((s = b.readLine()) != null) {
                files.add(s.replace(",", "|"));
            }

            String c = files.toString();

            String name = c.split(",")[1];
            String age = c.split(",")[2];
            String illnesss = c.split(",")[3];
            String Allergies = c.split(",")[4].replace("|", ",");
            String Sex = c.split(",")[5];
            String Height = c.split(",")[6];
            String BloodType1 = c.split(",")[7];
            String Weight = c.split(",")[8];
            String Address = c.split(",")[9].replace("|", ",");
            String CivilStatus = c.split(",")[10];
            String Birthday = c.split(",")[11];
            String ContactNum = c.split(",")[12];
            String Email = c.split(",")[13];
            String patientAgeState = c.split(",")[14];
       
            String rName = c.split(",")[16];
            String rContactNum= c.split(",")[17];
            String rRelation= c.split(",")[18];
            String rEmail = c.split(",")[19];
            String rAddress = c.split(",")[20].replace("|", ",");
            String Doc = c.split(",")[21].replace("]","");
            
            
            
            nameFull1.setText(name);
            nameFull1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Age1.setText(age);
            Age1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            illness1.setText(illnesss);
            illness1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
             Allergies1.setText(Allergies);
            Allergies1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Sex1.setText(Sex);
            Sex1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Height1.setText(Height);
            Height1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Weight1.setText(Weight);
            Weight1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Address1.setText(Address);
            Address1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            //  Name7.setText(CivilStatus);
            CivilStatus1.setText(CivilStatus);
            CivilStatus1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Birthday1.setText(Birthday);
            Birthday1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            rAddress1.setText(rAddress);
            rAddress1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            rName1.setText(rName);
            rName1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            rRelation1.setText(rRelation);
            rRelation1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            rAddress1.setText(rAddress);
            rAddress1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            PatientIS.setText(patientAgeState);
            PatientIS.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
            ContactNum1.setText(ContactNum);
            ContactNum1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
            rEmail1.setText(rEmail);
            rEmail1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
        
            Allergies1.setText(Allergies);
            Allergies1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            rContactNum1.setText(rContactNum);
            rContactNum1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
             Email1.setText(Email);
            Email1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
               Doctor1.setText(Doc);
            Doctor1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            BloodType.setText(BloodType1);
          BloodType.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
             Email1.setText(Email);
            Email1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
        } catch (Exception e) {

        }

    }
    
    @Override
    public void copy(){
        
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
            String illnesss = c.split(",")[3];
            String Allergies = c.split(",")[4].replace("|", ",");
            String Sex = c.split(",")[5];
            String Height = c.split(",")[6];
            String BloodType = c.split(",")[7];
            String Weight = c.split(",")[8];
            String Address = c.split(",")[9].replace("|", ",");
            String CivilStatus = c.split(",")[10];
            String Birthday = c.split(",")[11];
            String ContactNum = c.split(",")[12];
            String Email = c.split(",")[13];
            String patientAgeState = c.split(",")[14];
       
            String rName = c.split(",")[16];
            String rContactNum= c.split(",")[17];
            String rRelation= c.split(",")[18];
            String rEmail = c.split(",")[19];
            String rAddress = c.split(",")[20];
            String Doc = c.split(",")[21].replace("]","");

            StringSelection copier = new StringSelection(
                    name + "\n" + age + "\n" + illnesss + "\n" + Allergies +"\n" + Sex + "\n" + Height + "\n" +BloodType+"\n" + Weight + "\n" + Address + "\n" + CivilStatus + "\n" + Birthday + "\n" + ContactNum
                    + "\n" + Email + "\n"+ patientAgeState + "\n" + rName + "\n" + rContactNum + "\n" + rRelation + "\n" + rEmail + "\n" + rAddress + "\n" + Doc);
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            cb.setContents(copier, null);
            } catch (Exception e) {

        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
       
        Password pw = new Password();
      pw.setVisible(true);
      pw.setLocationRelativeTo(null);
      pw.setResizable(false);
        pw.jLabel1.setText(jComboBox2.getSelectedItem().toString());
       pw.setFrame(3);
          this.dispose();
        
  
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FindPatient fp = new FindPatient();
                fp.setVisible(true);
                fp.setResizable(false);
                fp.setLocationRelativeTo(null);

            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address1;
    private javax.swing.JLabel Age1;
    private javax.swing.JLabel Allergies1;
    private javax.swing.JLabel Birthday1;
    private javax.swing.JLabel BloodType;
    private javax.swing.JLabel CivilStatus1;
    private javax.swing.JLabel ContactNum1;
    private javax.swing.JLabel Doctor1;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel Height1;
    private javax.swing.JLabel PatientIS;
    private javax.swing.JLabel Sex1;
    private javax.swing.JLabel Weight1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel illness1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel nameFull1;
    private javax.swing.JLabel rAddress1;
    private javax.swing.JLabel rContactNum1;
    private javax.swing.JLabel rEmail1;
    private javax.swing.JLabel rName1;
    private javax.swing.JLabel rRelation1;
    // End of variables declaration//GEN-END:variables
}
