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

public class FindPatient extends javax.swing.JFrame {

    String Doctor;
    String PatientF;
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
        concern = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        Name6 = new javax.swing.JLabel();
        Name8 = new javax.swing.JLabel();
        Name9 = new javax.swing.JLabel();
        bloodtype = new javax.swing.JLabel();
        Name11 = new javax.swing.JLabel();
        nameFull = new javax.swing.JLabel();
        Name13 = new javax.swing.JLabel();
        Name14 = new javax.swing.JLabel();
        Name15 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        Name16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Name18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        illness1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

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

        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 680, -1, -1));

        jButton4.setText("Copy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 630, -1, -1));

        jButton5.setText("back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("        To  Look For a Patient's File Enter Patient's Name:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1258, 37));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("    Emergency Contact Information: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 480, 1310, 37));

        concern.setBackground(new java.awt.Color(51, 51, 51));
        concern.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        concern.setForeground(new java.awt.Color(0, 0, 0));
        concern.setText(" ");
        concern.setAlignmentX(0.5F);
        jPanel1.add(concern, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 254, 47));

        Name1.setBackground(new java.awt.Color(51, 51, 51));
        Name1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name1.setForeground(new java.awt.Color(0, 0, 0));
        Name1.setText(" ");
        Name1.setAlignmentX(0.5F);
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 617, 34));

        Age.setBackground(new java.awt.Color(51, 51, 51));
        Age.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Age.setForeground(new java.awt.Color(0, 0, 0));
        Age.setText(" ");
        Age.setAlignmentX(0.5F);
        jPanel1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 254, 34));

        Name3.setBackground(new java.awt.Color(51, 51, 51));
        Name3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name3.setForeground(new java.awt.Color(0, 0, 0));
        Name3.setText(" ");
        Name3.setAlignmentX(0.5F);
        jPanel1.add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 254, 34));

        Name4.setBackground(new java.awt.Color(51, 51, 51));
        Name4.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name4.setForeground(new java.awt.Color(0, 0, 0));
        Name4.setText(" ");
        Name4.setAlignmentX(0.5F);
        jPanel1.add(Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 254, 34));

        Name5.setBackground(new java.awt.Color(51, 51, 51));
        Name5.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name5.setForeground(new java.awt.Color(0, 0, 0));
        Name5.setText(" ");
        Name5.setAlignmentX(0.5F);
        jPanel1.add(Name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 860, 34));

        Name6.setBackground(new java.awt.Color(51, 51, 51));
        Name6.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name6.setForeground(new java.awt.Color(0, 0, 0));
        Name6.setText(" ");
        Name6.setAlignmentX(0.5F);
        jPanel1.add(Name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 254, 33));

        Name8.setBackground(new java.awt.Color(51, 51, 51));
        Name8.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name8.setForeground(new java.awt.Color(0, 0, 0));
        Name8.setText(" ");
        Name8.setAlignmentX(0.5F);
        jPanel1.add(Name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 254, 34));

        Name9.setBackground(new java.awt.Color(51, 51, 51));
        Name9.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name9.setForeground(new java.awt.Color(0, 0, 0));
        Name9.setText(" ");
        Name9.setAlignmentX(0.5F);
        jPanel1.add(Name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 254, 34));

        bloodtype.setBackground(new java.awt.Color(51, 51, 51));
        bloodtype.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        bloodtype.setForeground(new java.awt.Color(0, 0, 0));
        bloodtype.setText(" ");
        bloodtype.setAlignmentX(0.5F);
        jPanel1.add(bloodtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 254, 34));

        Name11.setBackground(new java.awt.Color(51, 51, 51));
        Name11.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name11.setForeground(new java.awt.Color(0, 0, 0));
        Name11.setText(" ");
        Name11.setAlignmentX(0.5F);
        jPanel1.add(Name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 254, 34));

        nameFull.setBackground(new java.awt.Color(51, 51, 51));
        nameFull.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        nameFull.setForeground(new java.awt.Color(0, 0, 0));
        nameFull.setAlignmentX(0.5F);
        jPanel1.add(nameFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 158, 254, 34));

        Name13.setBackground(new java.awt.Color(51, 51, 51));
        Name13.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name13.setForeground(new java.awt.Color(0, 0, 0));
        Name13.setText(" ");
        Name13.setAlignmentX(0.5F);
        jPanel1.add(Name13, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 568, 254, 34));

        Name14.setBackground(new java.awt.Color(51, 51, 51));
        Name14.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name14.setForeground(new java.awt.Color(0, 0, 0));
        Name14.setText(" ");
        Name14.setAlignmentX(0.5F);
        jPanel1.add(Name14, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 647, 305, 34));

        Name15.setBackground(new java.awt.Color(51, 51, 51));
        Name15.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name15.setForeground(new java.awt.Color(0, 0, 0));
        Name15.setText(" ");
        Name15.setAlignmentX(0.5F);
        jPanel1.add(Name15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 254, 34));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
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

        Name16.setBackground(new java.awt.Color(51, 51, 51));
        Name16.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name16.setForeground(new java.awt.Color(0, 0, 0));
        Name16.setText(" ");
        Name16.setAlignmentX(0.5F);
        jPanel1.add(Name16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, 290, 34));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Patient Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 171, 236, -1));

        Name18.setBackground(new java.awt.Color(51, 51, 51));
        Name18.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name18.setForeground(new java.awt.Color(0, 0, 0));
        Name18.setText(" ");
        Name18.setAlignmentX(0.5F);
        jPanel1.add(Name18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 254, 34));

        jButton3.setText("Edit Patient Information");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 280, 30));

        jButton6.setText("View Patient Records");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 280, 30));

        jButton8.setText("Add New Record");
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
        jPanel1.add(illness1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 254, 47));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

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
            String illness = c.split(",")[3];
            String Sex = c.split(",")[4];
            String Height = c.split(",")[5];
            String Weight = c.split(",")[6];
            String address = c.split(",")[7];
            String CivilStatus = c.split(",")[8];
            String Birthday = c.split(",")[9];
            String ContactNo = c.split(",")[10];
            String email = c.split(",")[11];

            String rName = c.split(",")[14];
            String rContact = c.split(",")[15];
            String Relationship = c.split(",")[16];
            String rEmail = c.split(",")[17].replace("]", "");
            String rAddress = c.split(",")[18];
            String DocTor = c.split(",")[19].replace("]", "");

            StringSelection copier = new StringSelection(name + "\n" + age + "\n" + illness + "\n" + Sex + "\n" + Height + "\n" + Weight + "\n" + address + "\n" + CivilStatus + "\n" + Birthday + "\n" + ContactNo
                    + "\n" + email + "\n" + rName + "\n" + rContact + "\n" + Relationship + "\n" + rEmail + "\n" + rAddress + "\n" + DocTor);
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            cb.setContents(copier, null);
        } catch (Exception e) {

        }

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

        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        mf.setResizable(false);
        this.dispose();

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
            String age = c.split(",")[2];
            String illnesss = c.split(",")[3];
            String Sex = c.split(",")[4];
            String Height = c.split(",")[5];
            String Weight = c.split(",")[6];
            String address = c.split(",")[7];
            String CivilStatus = c.split(",")[8];
            String Birthday = c.split(",")[9];
            String ContactNo = c.split(",")[10];
            String email = c.split(",")[11];

            String rName = c.split(",")[14];
            String rContact = c.split(",")[15];
            String Relationship = c.split(",")[16];
            String rEmail = c.split(",")[17].replace("]", "");
            String rAddress = c.split(",")[18];
            String DocTor = c.split(",")[19];

            nameFull.setText(name);
            nameFull.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Age.setText(age);
            Age.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            illness1.setText(illnesss);
            illness1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name3.setText(Sex);
            Name3.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name4.setText(Height);
            Name4.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name6.setText(Weight);
            Name6.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name5.setText(address);
            Name5.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            //  Name7.setText(CivilStatus);
            Name8.setText(Birthday);
            Name8.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name9.setText(ContactNo);
            Name9.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            nameFull.setText(email);
            nameFull.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name13.setText(rName);
            Name13.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name14.setText(rContact);
            Name14.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            nameFull.setText(Relationship);
            nameFull.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name1.setText(rAddress);
            Name1.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

            Name11.setText(DocTor);
            Name11.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
            bloodtype.setText(email);

            Name16.setText(rEmail);
            Name16.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));
            
            //   Name7.setText("\nA \nB");
            concern.setText("aaa");
            concern.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"), 2));

        } catch (Exception e) {

        }


    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        PatientFile pf = new PatientFile();
        pf.setVisible(true);
        pf.setResizable(false);
        String n = jComboBox2.getEditor().getItem().toString();
        pf.jLabel1.setText(n);
        setPatientF(jComboBox2.getSelectedItem().toString());

        // this.dispose();
    }

    public void setPatientF(String PatientF) {
        this.PatientF = PatientF;

    }

    public String getPatientF() {
        return PatientF;


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
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
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name11;
    private javax.swing.JLabel Name13;
    private javax.swing.JLabel Name14;
    private javax.swing.JLabel Name15;
    private javax.swing.JLabel Name16;
    private javax.swing.JLabel Name18;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Name8;
    private javax.swing.JLabel Name9;
    private javax.swing.JLabel bloodtype;
    private javax.swing.JLabel concern;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel nameFull;
    // End of variables declaration//GEN-END:variables
}
