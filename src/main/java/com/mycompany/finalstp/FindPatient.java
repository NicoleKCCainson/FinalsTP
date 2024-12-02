package com.mycompany.finalstp;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.util.Arrays;


public class FindPatient extends javax.swing.JFrame  {
    String Doctor;
    String fileLoc = "C:\\Users\\nicol\\Desktop\\Database\\Patient";
    public FindPatient() {

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
        Name = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        Name6 = new javax.swing.JLabel();
        Name7 = new javax.swing.JLabel();
        Name8 = new javax.swing.JLabel();
        Name9 = new javax.swing.JLabel();
        Name10 = new javax.swing.JLabel();
        Name11 = new javax.swing.JLabel();
        Name12 = new javax.swing.JLabel();
        Name13 = new javax.swing.JLabel();
        Name14 = new javax.swing.JLabel();
        Name15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        Name16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Find Patient Information");

        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Copy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("        To  Look For a Patient's File Enter Patient's Name:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("    Emergency Contact Information: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel6.setOpaque(true);

        Name.setBackground(new java.awt.Color(51, 51, 51));
        Name.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.setText(" Illness:");
        Name.setAlignmentX(0.5F);
        Name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name1.setBackground(new java.awt.Color(51, 51, 51));
        Name1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name1.setForeground(new java.awt.Color(0, 0, 0));
        Name1.setText("  Address: ");
        Name1.setAlignmentX(0.5F);
        Name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name2.setBackground(new java.awt.Color(51, 51, 51));
        Name2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name2.setForeground(new java.awt.Color(0, 0, 0));
        Name2.setText("  Age: ");
        Name2.setAlignmentX(0.5F);
        Name2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name3.setBackground(new java.awt.Color(51, 51, 51));
        Name3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name3.setForeground(new java.awt.Color(0, 0, 0));
        Name3.setText("  Sex: ");
        Name3.setAlignmentX(0.5F);
        Name3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name4.setBackground(new java.awt.Color(51, 51, 51));
        Name4.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name4.setForeground(new java.awt.Color(0, 0, 0));
        Name4.setText("  Height:");
        Name4.setAlignmentX(0.5F);
        Name4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name5.setBackground(new java.awt.Color(51, 51, 51));
        Name5.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name5.setForeground(new java.awt.Color(0, 0, 0));
        Name5.setText("  Address:");
        Name5.setAlignmentX(0.5F);
        Name5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name6.setBackground(new java.awt.Color(51, 51, 51));
        Name6.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name6.setForeground(new java.awt.Color(0, 0, 0));
        Name6.setText("  Weight:");
        Name6.setAlignmentX(0.5F);
        Name6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name7.setBackground(new java.awt.Color(51, 51, 51));
        Name7.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name7.setForeground(new java.awt.Color(0, 0, 0));
        Name7.setText("  Civil Status: ");
        Name7.setAlignmentX(0.5F);
        Name7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name8.setBackground(new java.awt.Color(51, 51, 51));
        Name8.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name8.setForeground(new java.awt.Color(0, 0, 0));
        Name8.setText(" Birthday: ");
        Name8.setAlignmentX(0.5F);
        Name8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name9.setBackground(new java.awt.Color(51, 51, 51));
        Name9.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name9.setForeground(new java.awt.Color(0, 0, 0));
        Name9.setText("  Contact Number:");
        Name9.setAlignmentX(0.5F);
        Name9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name10.setBackground(new java.awt.Color(51, 51, 51));
        Name10.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name10.setForeground(new java.awt.Color(0, 0, 0));
        Name10.setText("  Email:");
        Name10.setAlignmentX(0.5F);
        Name10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name11.setBackground(new java.awt.Color(51, 51, 51));
        Name11.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name11.setForeground(new java.awt.Color(0, 0, 0));
        Name11.setText("  Doctor:");
        Name11.setAlignmentX(0.5F);
        Name11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name12.setBackground(new java.awt.Color(51, 51, 51));
        Name12.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name12.setForeground(new java.awt.Color(0, 0, 0));
        Name12.setText(" Name:");
        Name12.setAlignmentX(0.5F);
        Name12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name13.setBackground(new java.awt.Color(51, 51, 51));
        Name13.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name13.setForeground(new java.awt.Color(0, 0, 0));
        Name13.setText("  Name: ");
        Name13.setAlignmentX(0.5F);
        Name13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name14.setBackground(new java.awt.Color(51, 51, 51));
        Name14.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name14.setForeground(new java.awt.Color(0, 0, 0));
        Name14.setText("  Contact Number: ");
        Name14.setAlignmentX(0.5F);
        Name14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        Name15.setBackground(new java.awt.Color(51, 51, 51));
        Name15.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name15.setForeground(new java.awt.Color(0, 0, 0));
        Name15.setText("  Relationship to Patient: ");
        Name15.setAlignmentX(0.5F);
        Name15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        jComboBox2.setEditable(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton7.setText("Find");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Name16.setBackground(new java.awt.Color(51, 51, 51));
        Name16.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name16.setForeground(new java.awt.Color(0, 0, 0));
        Name16.setText("Email: ");
        Name16.setAlignmentX(0.5F);
        Name16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Patient Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jButton5)
                                    .addGap(384, 384, 384)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1048, 1048, 1048)
                                                .addComponent(jButton4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Name13, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Name14, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(140, 140, 140)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(Name15, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(83, 83, 83)
                                                        .addComponent(Name16, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Name12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Name10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Name11, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(Name9, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

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

       /*  try{
              String LFfileName = jTextField1.getText();
            File path = new File(fileLoc+"\\" + LFfileName +".txt");

                BufferedReader b = new BufferedReader(new FileReader(path));
                String s;
                ArrayList<String> content = new ArrayList<String>();

                while((s=b.readLine())!=null){
                    content.add(s);
                }
                String cont = content.toString();
                String txtDisName= cont.split(",")[0];

                txtDisName = txtDisName.replace("[","");
                String txtDisAge= cont.split(",")[1];

                String txtDisIllness= cont.split(",")[2];
                txtDisIllness = txtDisIllness.replace("]", "");
                
                String data = txtDisName + "\n" +txtDisAge; 
                
        StringSelection copier = new StringSelection(data);
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
          cb.setContents(copier, null);  
            }catch(Exception c){

            }*/
      
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
      String word = jComboBox2.getEditor().getItem().toString();
      File path = new File(fileLoc);
      File [] files = path.listFiles();
      ArrayList<String> arr = new ArrayList();
      
      jComboBox2.removeAllItems();
      
      if(!word.isEmpty()){
      
      for(int i = 0; i < files.length;){
      if(files[i].isFile()){
          try{
          
                BufferedReader buff = new BufferedReader(new FileReader(files[i]));
                String s;
                Arrays.sort(files);
                
                while((s=buff.readLine()) != null){
                        if(s.trim().contains(word)){
                            int n = 0;
                            String fileName = files[i].getName().toString().replace(".txt", "");
                            arr.add(fileName);
                            String nn = fileName.split(",")[n];
                           
                            jComboBox2.addItem(nn);
                             n++;
                             
                                  }
                        
                                }
                             buff.close();
          
                        }catch(Exception e){
                                        
                                        
                        }
                    } i++;
          
          
            }
      
        }
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
        try{
        File path2 = new File(fileLoc + "\\" + jComboBox2.getSelectedItem().toString() + ".txt");
        String fileName = path2.toString();
        
        BufferedReader b = new BufferedReader(new FileReader(fileName));
        String s;
        
        ArrayList<String> files = new ArrayList<>();

        while((s=b.readLine())!=null){
        files.add(s);
        }
        
        String c = files.toString();   

       String name = c.split(",")[1];
       String age = c.split(",")[2];
       String illness = c.split(",")[3];
       String Sex = c.split(",")[4];
       String Height = c.split(",")[5];
       String Weight = c.split(",")[6];
       String address = c.split(",")[7];
       String CivilStatus = c.split(",")[8];
       String Birthday = c.split(",")[9];
       String ContactNo = c.split(",")[10];
       String email = c.split(",")[11];
       
       String rName = c.split(",")[13];
       String rContact = c.split(",")[14];
       String Relationship = c.split(",")[15];
       String rAddress = c.split(",")[16];
       String DocTor = c.split(",")[17];
       String rEmail = c.split(",")[18].replace("]", "");
       
            Name12.setText(name);
            Name2.setText(age);
            Name.setText(illness);
            Name3.setText(Sex);
            Name4.setText(Height);
            Name6.setText(Weight);
            Name5.setText(address);
            Name7.setText(CivilStatus);
            Name8.setText(Birthday);
            Name9.setText(ContactNo);
            Name10.setText(email);
            Name13.setText(rName);
            Name14.setText(rContact);
            Name15.setText(Relationship);
            Name1.setText(rAddress);
           Name11.setText(DocTor);
           Name16.setText(rEmail);
            
            
        }catch(Exception e){
        
        }
        
        
        
        
        
    }//GEN-LAST:event_jComboBox2ActionPerformed
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
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name10;
    private javax.swing.JLabel Name11;
    private javax.swing.JLabel Name12;
    private javax.swing.JLabel Name13;
    private javax.swing.JLabel Name14;
    private javax.swing.JLabel Name15;
    private javax.swing.JLabel Name16;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Name7;
    private javax.swing.JLabel Name8;
    private javax.swing.JLabel Name9;
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
    // End of variables declaration//GEN-END:variables
}
