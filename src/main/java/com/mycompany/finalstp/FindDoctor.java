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

public class FindDoctor extends javax.swing.JFrame implements find {

    String Doctor;
    String fileLoc = "C:\\Users\\nicol\\Desktop\\Database\\Doctor";

    public FindDoctor() {

        initComponents();
allDoc();
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
        jComboBox7 = new javax.swing.JComboBox<>();

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(68, 114, 196));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Done");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 60, 30));

        jButton4.setBackground(new java.awt.Color(68, 114, 196));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Copy");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, 60, 30));

        jButton5.setBackground(new java.awt.Color(68, 114, 196));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 33, 50, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("        To  Look For a Doctor's File Enter Doctor's Name:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1090, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("    Secretary's Information: ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1090, 30));

        Demail.setBackground(new java.awt.Color(51, 51, 51));
        Demail.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Demail.setForeground(new java.awt.Color(0, 0, 0));
        Demail.setText(" ");
        Demail.setAlignmentX(0.5F);
        jPanel1.add(Demail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 310, 30));

        age.setBackground(new java.awt.Color(51, 51, 51));
        age.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 0));
        age.setText(" ");
        age.setAlignmentX(0.5F);
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 70, 30));

        DocNum.setBackground(new java.awt.Color(51, 51, 51));
        DocNum.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        DocNum.setForeground(new java.awt.Color(0, 0, 0));
        DocNum.setText("  ");
        DocNum.setAlignmentX(0.5F);
        jPanel1.add(DocNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 170, 30));

        availability.setBackground(new java.awt.Color(51, 51, 51));
        availability.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        availability.setForeground(new java.awt.Color(0, 0, 0));
        availability.setText(" ");
        availability.setAlignmentX(0.5F);
        jPanel1.add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 400, 30));

        department.setBackground(new java.awt.Color(51, 51, 51));
        department.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        department.setForeground(new java.awt.Color(0, 0, 0));
        department.setText(" ");
        department.setAlignmentX(0.5F);
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 300, 30));

        firstname.setBackground(new java.awt.Color(51, 51, 51));
        firstname.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        firstname.setForeground(new java.awt.Color(0, 0, 0));
        firstname.setText(" ");
        firstname.setAlignmentX(0.5F);
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 290, 34));

        Secname.setBackground(new java.awt.Color(51, 51, 51));
        Secname.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Secname.setForeground(new java.awt.Color(0, 0, 0));
        Secname.setText(" ");
        Secname.setAlignmentX(0.5F);
        jPanel1.add(Secname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 310, 30));

        Secnum.setBackground(new java.awt.Color(51, 51, 51));
        Secnum.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        Secnum.setForeground(new java.awt.Color(0, 0, 0));
        Secnum.setText(" ");
        Secnum.setAlignmentX(0.5F);
        jPanel1.add(Secnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 260, 30));

        gender.setBackground(new java.awt.Color(51, 51, 51));
        gender.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setText(" ");
        gender.setAlignmentX(0.5F);
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, 30));

        jComboBox2.setBackground(new java.awt.Color(165, 165, 165));
        jComboBox2.setEditable(true);
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO DOCTOR SELECTED" }));
        jComboBox2.setBorder(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 230, 20));

        jButton7.setBackground(new java.awt.Color(68, 114, 196));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Find");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 40, -1));

        SecEmail.setBackground(new java.awt.Color(51, 51, 51));
        SecEmail.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        SecEmail.setForeground(new java.awt.Color(0, 0, 0));
        SecEmail.setText(" ");
        SecEmail.setAlignmentX(0.5F);
        jPanel1.add(SecEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 350, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Doctor's Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 230, -1));

        hmo.setBackground(new java.awt.Color(51, 51, 51));
        hmo.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        hmo.setForeground(new java.awt.Color(0, 0, 0));
        hmo.setText(" ");
        hmo.setAlignmentX(0.5F);
        jPanel1.add(hmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 400, 30));

        roomnum.setBackground(new java.awt.Color(51, 51, 51));
        roomnum.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        roomnum.setForeground(new java.awt.Color(0, 0, 0));
        roomnum.setText(" ");
        roomnum.setAlignmentX(0.5F);
        jPanel1.add(roomnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 80, 30));

        jComboBox7.setBackground(new java.awt.Color(165, 165, 165));
        jComboBox7.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO DEPARTMENT SELECTED", "GENERAL MEDICINE", "CARDIOLOGY", "NEUROLOGY", "PEDIATRICS", "ORTHOPEDICS", "DERMATOLOGY", "GYNECOLOGY", "UROLOGY", "NEPHROLOGY", "PULMONOLOGY", "ENDOCRINOLOGY", "PSYCHIATRY", "GASTROENTEROLOGY", "HEMATOLOGY", "ONCOLOGY", "RADIOLOGY", "ANESTHESIOLOGY", "OPHTHALMOLOGY", "OTOLARYNGOLOGY (ENT)", "DENTISTRY", "RHEUMATOLOGY", "GERIATRICS", "EMERGENCY MEDICINE", "PATHOLOGY", "PLASTIC SURGERY", "GENERAL SURGERY", "NEUROSURGERY", "OBSTETRICS", "SPORTS MEDICINE", "PALLIATIVE CARE" }));
        jComboBox7.setBorder(null);
        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 230, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));
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


   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        copy();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        MainFrame fd = new MainFrame();
        fd.setVisible(true);
        fd.setResizable(false);
        fd.setLocationRelativeTo(null);
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

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        //Department Chosen

  
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged
        // TODO add your handling code here:
        dep();
       
    }//GEN-LAST:event_jComboBox7ItemStateChanged
    
      public void dep() {

        File path = new File(fileLoc);
        File[] files = path.listFiles();
        ArrayList<String> fileArray = new ArrayList<>();
        jComboBox2.removeAllItems();
        for (int i = 0; i < files.length;) {

            if (files[i].isFile()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(files[i]));
                    String s;
                    Arrays.sort(files);

                    while ((s = br.readLine()) != null) {
                        if (s.trim().contains(jComboBox7.getSelectedItem().toString())) {
                            int num = 0;
                            String n = files[i].getName().toString().replace("-", " ");
                            fileArray.add(n);
                            String aa = n.split(",")[num].replace(".txt", "");
                            jComboBox2.addItem(aa);
                            num++;
                            System.out.println(n);
                        }

                    }
                    br.close();

                } catch (Exception e) {

                }
            }
            i++;
        }
      }
     public void allDoc(){
    
            File path = new File(fileLoc);
        File[] files = path.listFiles();
        ArrayList<String> fileArray = new ArrayList<>();

        for (int i = 0; i < files.length;) {

            if (files[i].isFile()) {
                try {
                   
                    Arrays.sort(files);
                            int num = 0;
                            String n = files[i].getName().toString();
                            fileArray.add(n);
                            String aa = n.split(",")[num].replace(".txt", "");
                            jComboBox2.addItem(aa);
                            num++;
                            System.out.println(n);

                } catch (Exception e) {

                }
            }
            i++;
        }
        
    }
   public void find(){
        
            String word = jComboBox2.getEditor().getItem().toString().toUpperCase();
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

                                jComboBox2.addItem(nn.replace("-", " "));
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
    public void itemSelect(){
      try {
            File path2 = new File(fileLoc + "\\" + jComboBox2.getSelectedItem().toString() + ".txt");
            String fileName = path2.toString();

            BufferedReader b = new BufferedReader(new FileReader(fileName));
            String s;

            ArrayList<String> files = new ArrayList<>();

            while ((s = b.readLine()) != null) {
                files.add(s.replace(",", " "));
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
            String secEmail2 = c.split(",")[13].replace("]","");
            
            Demail.setText(email);
            Demail.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            DocNum.setText(contactNo);
            DocNum.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
            Secname.setText(secName);
            Secname.setBorder(BorderFactory.createLineBorder(Color.decode("#4472C4"),2));
            
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
    }
    public void copy(){
             try {
            File path2 = new File(fileLoc + "\\" + jComboBox2.getSelectedItem().toString() + ".txt");
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

            
              StringSelection copier = new StringSelection( name + "\n" +age + "\n" + department + "\n" + Gender + "\n" + contactNo + "\n" + Room + "\n" + hmos.replace("|", ",") + "\n" + avail.replace("|", ",") +"\n"+email+ "\n" + secName + "\n" + secNum+ 
        "\n" + secEmail.replace("]", "")  );
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
          cb.setContents(copier, null);  
            } catch (Exception e) {

        }
    
    }
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
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel roomnum;
    // End of variables declaration//GEN-END:variables
}
