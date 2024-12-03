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
        Name = new javax.swing.JLabel();
        Name1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        Name6 = new javax.swing.JLabel();
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
        Name18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 33, -1, -1));

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 478, 1314, 37));

        Name.setBackground(new java.awt.Color(51, 51, 51));
        Name.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.setText(" Illness:");
        Name.setAlignmentX(0.5F);
        Name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 254, 47));

        Name1.setBackground(new java.awt.Color(51, 51, 51));
        Name1.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name1.setForeground(new java.awt.Color(0, 0, 0));
        Name1.setText("  Address: ");
        Name1.setAlignmentX(0.5F);
        Name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 617, 34));

        Name2.setBackground(new java.awt.Color(51, 51, 51));
        Name2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name2.setForeground(new java.awt.Color(0, 0, 0));
        Name2.setText("  Age: ");
        Name2.setAlignmentX(0.5F);
        Name2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 254, 34));

        Name3.setBackground(new java.awt.Color(51, 51, 51));
        Name3.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name3.setForeground(new java.awt.Color(0, 0, 0));
        Name3.setText("  Sex: ");
        Name3.setAlignmentX(0.5F);
        Name3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 254, 34));

        Name4.setBackground(new java.awt.Color(51, 51, 51));
        Name4.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name4.setForeground(new java.awt.Color(0, 0, 0));
        Name4.setText("  Height:");
        Name4.setAlignmentX(0.5F);
        Name4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 254, 34));

        Name5.setBackground(new java.awt.Color(51, 51, 51));
        Name5.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name5.setForeground(new java.awt.Color(0, 0, 0));
        Name5.setText("  Address:");
        Name5.setAlignmentX(0.5F);
        Name5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 860, 34));

        Name6.setBackground(new java.awt.Color(51, 51, 51));
        Name6.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name6.setForeground(new java.awt.Color(0, 0, 0));
        Name6.setText("  Weight:");
        Name6.setAlignmentX(0.5F);
        Name6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 254, 33));

        Name8.setBackground(new java.awt.Color(51, 51, 51));
        Name8.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name8.setForeground(new java.awt.Color(0, 0, 0));
        Name8.setText(" Birthday: ");
        Name8.setAlignmentX(0.5F);
        Name8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 254, 34));

        Name9.setBackground(new java.awt.Color(51, 51, 51));
        Name9.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name9.setForeground(new java.awt.Color(0, 0, 0));
        Name9.setText("  Contact Number:");
        Name9.setAlignmentX(0.5F);
        Name9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 254, 34));

        Name10.setBackground(new java.awt.Color(51, 51, 51));
        Name10.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name10.setForeground(new java.awt.Color(0, 0, 0));
        Name10.setText("  Email:");
        Name10.setAlignmentX(0.5F);
        Name10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 254, 34));

        Name11.setBackground(new java.awt.Color(51, 51, 51));
        Name11.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name11.setForeground(new java.awt.Color(0, 0, 0));
        Name11.setText("  Doctor:");
        Name11.setAlignmentX(0.5F);
        Name11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 254, 34));

        Name12.setBackground(new java.awt.Color(51, 51, 51));
        Name12.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name12.setForeground(new java.awt.Color(0, 0, 0));
        Name12.setText(" Name:");
        Name12.setAlignmentX(0.5F);
        Name12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 158, 254, 34));

        Name13.setBackground(new java.awt.Color(51, 51, 51));
        Name13.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name13.setForeground(new java.awt.Color(0, 0, 0));
        Name13.setText("  Name: ");
        Name13.setAlignmentX(0.5F);
        Name13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name13, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 568, 254, 34));

        Name14.setBackground(new java.awt.Color(51, 51, 51));
        Name14.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name14.setForeground(new java.awt.Color(0, 0, 0));
        Name14.setText("  Contact Number: ");
        Name14.setAlignmentX(0.5F);
        Name14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name14, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 647, 305, 34));

        Name15.setBackground(new java.awt.Color(51, 51, 51));
        Name15.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name15.setForeground(new java.awt.Color(0, 0, 0));
        Name15.setText("  Relation: ");
        Name15.setAlignmentX(0.5F);
        Name15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
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
        Name16.setText("Email: ");
        Name16.setAlignmentX(0.5F);
        Name16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 290, 34));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Patient Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 171, 236, -1));

        Name18.setBackground(new java.awt.Color(51, 51, 51));
        Name18.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Name18.setForeground(new java.awt.Color(0, 0, 0));
        Name18.setText("  Civil Status: ");
        Name18.setAlignmentX(0.5F);
        Name18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(165, 165, 165), 2, true));
        jPanel1.add(Name18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 254, 34));

        jTextPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(165, 165, 165), 2));
        jTextPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane1.setText(" Allergies: ");
        jTextPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPane1.setEnabled(false);
        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 260, 80));

        jButton3.setText("Add Patient File");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 280, 30));

        jButton6.setText("View Patient Files");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 280, 30));

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
       
       String rName = c.split(",")[14];
       String rContact = c.split(",")[15];
       String Relationship = c.split(",")[16];
       String rEmail = c.split(",")[17].replace("]", ""); 
        String rAddress = c.split(",")[18];
       String DocTor = c.split(",")[19].replace("]", "");
    
              StringSelection copier = new StringSelection( name + "\n" +age + "\n" + illness + "\n" + Sex + "\n" + Height + "\n" + Weight + "\n" + address + "\n" + CivilStatus + "\n" + Birthday + "\n" + ContactNo+ 
        "\n" + email + "\n" + rName + "\n" + rContact + "\n" + Relationship + "\n" + rEmail + "\n" + rAddress + "\n" + DocTor );
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
          cb.setContents(copier, null);  
        }catch(Exception e){
        
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
       
       String rName = c.split(",")[14];
       String rContact = c.split(",")[15];
       String Relationship = c.split(",")[16];
       String rEmail = c.split(",")[17].replace("]", ""); 
        String rAddress = c.split(",")[18];
       String DocTor = c.split(",")[19];
     
       
            Name12.setText(name);
            Name2.setText(age);
            Name.setText(illness);
            Name3.setText(Sex);
            Name4.setText(Height);
            Name6.setText(Weight);
            Name5.setText(address);
          //  Name7.setText(CivilStatus);
            Name8.setText(Birthday);
            Name9.setText(ContactNo);
            Name10.setText(email);
            Name13.setText(rName);
            Name14.setText(rContact);
            Name15.setText(Relationship);
            Name1.setText(rAddress);
           Name11.setText(DocTor);
           Name16.setText(rEmail);
        //   Name7.setText("\nA \nB");
           jTextPane1.setText("aaa");
            
            
        }catch(Exception e){
        
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
       public void setPatientF(String PatientF){
        this.PatientF = PatientF;
    
    }
    public String getPatientF(){
        return PatientF;
    
    
    }//GEN-LAST:event_jButton6ActionPerformed
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
    private javax.swing.JLabel Name18;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Name6;
    private javax.swing.JLabel Name8;
    private javax.swing.JLabel Name9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
