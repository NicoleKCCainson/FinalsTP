package com.mycompany.finalstp;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author nicol
 */
public class NewDoctor extends javax.swing.JFrame {
    //NEW DOCTOR 

    //Doctor file
    String fileLoc = "C:\\Users\\nicol\\Desktop\\Database\\Doctor";

    /**
     * Creates new form button3
     */
    public NewDoctor() {
        initComponents();
        jButton1.setEnabled(false);
        jTextField7.setEditable(false);
        jTextField11.setEditable(false);
        jTextField12.setEditable(false);
        jTextField13.setEditable(false);
        jTextField14.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
        
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        namelabel1 = new javax.swing.JLabel();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        checkbox5 = new java.awt.Checkbox();
        checkbox6 = new java.awt.Checkbox();
        checkbox7 = new java.awt.Checkbox();
        checkbox8 = new java.awt.Checkbox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        checkbox9 = new java.awt.Checkbox();
        checkbox10 = new java.awt.Checkbox();
        checkbox11 = new java.awt.Checkbox();
        checkbox12 = new java.awt.Checkbox();
        checkbox13 = new java.awt.Checkbox();
        checkbox16 = new java.awt.Checkbox();
        checkbox17 = new java.awt.Checkbox();
        checkbox18 = new java.awt.Checkbox();
        checkbox19 = new java.awt.Checkbox();
        checkbox20 = new java.awt.Checkbox();
        checkbox21 = new java.awt.Checkbox();
        checkbox22 = new java.awt.Checkbox();
        checkbox23 = new java.awt.Checkbox();
        checkbox24 = new java.awt.Checkbox();
        checkbox25 = new java.awt.Checkbox();
        jTextField16 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jTextField1.setBackground(new java.awt.Color(165, 165, 165));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 150, 190, -1));
        jTextField1.getAccessibleContext().setAccessibleName("thisName");

        namelabel1.setForeground(new java.awt.Color(0, 0, 0));
        namelabel1.setText("First Name:");
        jPanel1.add(namelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 151, 80, 20));

        checkbox2.setForeground(new java.awt.Color(8, 0, 0));
        checkbox2.setLabel("Monday");
        checkbox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox2ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        checkbox3.setForeground(new java.awt.Color(8, 0, 0));
        checkbox3.setLabel("Tuesday");
        checkbox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox3ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        checkbox4.setForeground(new java.awt.Color(8, 0, 0));
        checkbox4.setLabel("Wednesday");
        checkbox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox4ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 90, -1));

        checkbox5.setForeground(new java.awt.Color(8, 0, 0));
        checkbox5.setLabel("Thursday");
        checkbox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox5ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        checkbox6.setForeground(new java.awt.Color(8, 0, 0));
        checkbox6.setLabel("Friday");
        checkbox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox6ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        checkbox7.setForeground(new java.awt.Color(8, 0, 0));
        checkbox7.setLabel("Saturday");
        checkbox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox7ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        checkbox8.setForeground(new java.awt.Color(8, 0, 0));
        checkbox8.setLabel("Sunday");
        checkbox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox8ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Age:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 30, 20));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, -1, -1));

        jTextField4.setBackground(new java.awt.Color(165, 165, 165));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, -1));
        jTextField4.getAccessibleContext().setAccessibleName("file");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 193, 80, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("New Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("         Secretary Information");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1090, 37));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Department:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, 30));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DAYS:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 50, 40));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contact Number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("AVAILABILITY");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, 26));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("HMO Accredation/s: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 26));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 40, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("        Doctor Information");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, 1078, 37));

        jTextField3.setBackground(new java.awt.Color(165, 165, 165));
        jTextField3.setText(" ");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 150, -1));

        jTextField5.setBackground(new java.awt.Color(165, 165, 165));
        jTextField5.setText(" ");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 146, -1));

        jTextField6.setBackground(new java.awt.Color(165, 165, 165));
        jTextField6.setText(" ");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 50, 20));

        jTextField8.setBackground(new java.awt.Color(165, 165, 165));
        jTextField8.setText(" ");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, -1));

        jTextField9.setBackground(new java.awt.Color(165, 165, 165));
        jTextField9.setText(" ");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 236, -1));

        jTextField10.setBackground(new java.awt.Color(165, 165, 165));
        jTextField10.setText(" ");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 236, -1));

        jTextField7.setBackground(new java.awt.Color(165, 165, 165));
        jTextField7.setText(" ");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 150, -1));

        jTextField11.setBackground(new java.awt.Color(165, 165, 165));
        jTextField11.setText(" ");
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 150, -1));

        jTextField12.setBackground(new java.awt.Color(165, 165, 165));
        jTextField12.setText(" ");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 150, -1));

        jTextField13.setBackground(new java.awt.Color(165, 165, 165));
        jTextField13.setText(" ");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 150, -1));

        jTextField14.setBackground(new java.awt.Color(165, 165, 165));
        jTextField14.setText(" ");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 150, -1));

        jTextField15.setBackground(new java.awt.Color(165, 165, 165));
        jTextField15.setText(" ");
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 150, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Department Selected", "General Medicine", "Cardiology", "Neurology", "Pediatrics", "Orthopedics", "Dermatology", "Gynecology", "Urology", "Nephrology", "Pulmonology", "Endocrinology", "Psychiatry", "Gastroenterology", "Hematology", "Oncology", "Radiology", "Anesthesiology", "Ophthalmology", "Otolaryngology (ENT)", "Dentistry", "Rheumatology", "Geriatrics", "Emergency Medicine", "Pathology", "Plastic Surgery", "General Surgery", "Neurosurgery", "Obstetrics", "Sports Medicine", "Palliative Care" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 170, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Room no. :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 70, 26));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Contact Number:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 26));

        checkbox1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        checkbox1.setForeground(new java.awt.Color(7, 11, 26));
        checkbox1.setLabel(" Information are correct");
        checkbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 170, 30));

        checkbox9.setForeground(new java.awt.Color(8, 0, 0));
        checkbox9.setLabel("Maxicare");
        jPanel1.add(checkbox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 90, 20));

        checkbox10.setForeground(new java.awt.Color(8, 0, 0));
        checkbox10.setLabel("MediCard");
        jPanel1.add(checkbox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 90, 20));

        checkbox11.setForeground(new java.awt.Color(8, 0, 0));
        checkbox11.setLabel("Intellicare");
        jPanel1.add(checkbox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 80, 20));

        checkbox12.setForeground(new java.awt.Color(8, 0, 0));
        checkbox12.setLabel("PhilCare");
        jPanel1.add(checkbox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 90, 20));

        checkbox13.setForeground(new java.awt.Color(8, 0, 0));
        checkbox13.setLabel("Kaiser International HealthGroup");
        jPanel1.add(checkbox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 200, 20));

        checkbox16.setForeground(new java.awt.Color(8, 0, 0));
        checkbox16.setLabel("Fortune Care");
        jPanel1.add(checkbox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 100, 20));

        checkbox17.setForeground(new java.awt.Color(8, 0, 0));
        checkbox17.setLabel("Healthway Medical");
        jPanel1.add(checkbox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 140, 20));

        checkbox18.setForeground(new java.awt.Color(8, 0, 0));
        checkbox18.setLabel("EastWest Healthcare");
        jPanel1.add(checkbox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 150, 20));

        checkbox19.setForeground(new java.awt.Color(8, 0, 0));
        checkbox19.setLabel("Avega Managed Care");
        jPanel1.add(checkbox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 160, 20));

        checkbox20.setForeground(new java.awt.Color(8, 0, 0));
        checkbox20.setLabel("Insular Health Care");
        jPanel1.add(checkbox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 160, 20));

        checkbox21.setForeground(new java.awt.Color(8, 0, 0));
        checkbox21.setLabel("Value Care (ValuCare)");
        jPanel1.add(checkbox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 160, 20));

        checkbox22.setForeground(new java.awt.Color(8, 0, 0));
        checkbox22.setLabel("Caritas Health Shield");
        jPanel1.add(checkbox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 160, 20));

        checkbox23.setForeground(new java.awt.Color(8, 0, 0));
        checkbox23.setLabel("Pacific Cross Health Care");
        jPanel1.add(checkbox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 160, 20));

        checkbox24.setForeground(new java.awt.Color(8, 0, 0));
        checkbox24.setLabel("MedAsia Philippines");
        jPanel1.add(checkbox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 160, 20));

        checkbox25.setForeground(new java.awt.Color(8, 0, 0));
        checkbox25.setLabel("Cocolife Healthcare");
        jPanel1.add(checkbox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 160, 20));

        jTextField16.setBackground(new java.awt.Color(165, 165, 165));
        jTextField16.setText(" ");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 150, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("HOURS: 00:00AM - 00-00PM");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, 20));

        jTextField17.setBackground(new java.awt.Color(165, 165, 165));
        jTextField17.setText(" ");
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 146, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Email: ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainFrame dr = new MainFrame();
        dr.setVisible(true);
        dr.pack();
        dr.setLocationRelativeTo(null);
        this.dispose();
        dr.setResizable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainFrame dr = new MainFrame();
        dr.setVisible(true);
        dr.pack();
        dr.setLocationRelativeTo(null);
        this.dispose();
        dr.setResizable(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        isSubmit();
        sub2 sub2 = new sub2();
        sub2.setVisible(true);
        sub2.setLocationRelativeTo(null);
        sub2.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void checkbox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox1ItemStateChanged
        // TODO add your handling code here:

        if (checkbox1.getState()) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }

    }//GEN-LAST:event_checkbox1ItemStateChanged

    private void checkbox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox2ItemStateChanged
        // TODO add your handling code here:
      if (checkbox2.getState()) {
            
             jTextField7.setEditable(true);
          
        } else {
             jTextField7.setEditable(false);    
        }
    }//GEN-LAST:event_checkbox2ItemStateChanged

    private void checkbox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox3ItemStateChanged
        // TODO add your handling code here:
        if (checkbox3.getState()) {
            
             jTextField11.setEditable(true);
          
        } else {
             jTextField11.setEditable(false);    
        
    }        
    }//GEN-LAST:event_checkbox3ItemStateChanged

    private void checkbox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox4ItemStateChanged
        // TODO add your handling code here:
        if (checkbox4.getState()) {
            
             jTextField12.setEditable(true);
          
        } else {
             jTextField12.setEditable(false);    
        
    }        
    }//GEN-LAST:event_checkbox4ItemStateChanged

    private void checkbox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox5ItemStateChanged
        // TODO add your handling code here:
      if (checkbox5.getState()) {
            
             jTextField13.setEditable(true);
          
        } else {
             jTextField13.setEditable(false);    
        
    }        
    }//GEN-LAST:event_checkbox5ItemStateChanged

    private void checkbox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox6ItemStateChanged
        // TODO add your handling code here:
       if (checkbox6.getState()) {
            
             jTextField14.setEditable(true);
          
        } else {
             jTextField14.setEditable(false);    
        
    }        
    }//GEN-LAST:event_checkbox6ItemStateChanged

    private void checkbox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox7ItemStateChanged
        // TODO add your handling code here:
        if (checkbox7.getState()) {
            
             jTextField15.setEditable(true);
          
        } else {
             jTextField15.setEditable(false);    
        
    }        
    }//GEN-LAST:event_checkbox7ItemStateChanged

    private void checkbox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox8ItemStateChanged
        // TODO add your handling code here:
       if (checkbox8.getState()) {
            
             jTextField16.setEditable(true);
          
        } else {
             jTextField16.setEditable(false);    
        
    }        
    }//GEN-LAST:event_checkbox8ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    public void isSubmit() {
        
         ArrayList<String> hmo = new ArrayList<>();
        
        if (checkbox9.getState()) {
            hmo.add("Maxicare");
        } else {
        }
        if (checkbox10.getState()) {
             hmo.add("MediCard");
        } else {
        }
        if (checkbox11.getState()) {
             hmo.add("Intellicare");
        } else {
        }
        if (checkbox12.getState()) {
             hmo.add("PhilCare");
        } else {
        }
        if (checkbox13.getState()) {
             hmo.add("Kaiser International HealthGroup");
        } else {
        }
        if (checkbox16.getState()) {
             hmo.add("Fortune Care");
            
        } else {
        }
        if (checkbox17.getState()) {
             hmo.add("Healthway Medical");
        } else {
        }
        if (checkbox18.getState()) {
             hmo.add("EastWest Healthcare");
        } else {
            
        }
        if (checkbox19.getState()) {
             hmo.add("Avega Managed Care");
        } else {
            
        }
        
        if (checkbox20.getState()) {
             hmo.add("Avega Managed Care");
        } else {
            
        }
        
        if (checkbox21.getState()) {
             hmo.add("Value Care (ValuCare)");
        } else {
            
        }
        
        if (checkbox22.getState()) {
             hmo.add("Caritas Health Shield");
        } else {
            
        }
        
        if (checkbox23.getState()) {
             hmo.add("Pacific Cross Health Care");
        } else {
            
        }
        
        if (checkbox24.getState()) {
             hmo.add("MedAsia Philippines");
        } else {
            
        }
        
        if (checkbox25.getState()) {
             hmo.add("Cocolife Healthcare");
        } else {
            
        }
        
        String HMOs = hmo.toString().replace("[","").replace("]","").replace(",", " ");
        
        System.out.println(HMOs);
        
        
        
        ArrayList <String> weekdays = new ArrayList<>();
        
        
        if (checkbox2.getState()) {
            
             jTextField7.setEditable(true);
            weekdays.add("Monday - "  +jTextField7.getText());
          
        } else {
        }
        
        if (checkbox3.getState()) {
            jTextField11.setEditable(true);
          weekdays.add("Tuesday - " + jTextField11.getText());
          
        } else {
        }

        
        if (checkbox4.getState()) {
            
            jTextField12.setEditable(true);
           weekdays.add("Wednesday - " + jTextField12.getText());
        } else {
        }

        
        if (checkbox5.getState()) {
            jTextField13.setEditable(true);
           weekdays.add("Thursday - "+jTextField13.getText());
        } else {
        }

        
        if (checkbox6.getState()) {
            jTextField14.setEditable(true);
           weekdays.add("Friday -  "+jTextField14.getText());
        } else {
        }

        
        if (checkbox7.getState()) {
            jTextField15.setEditable(true);
           weekdays.add("Saturday - " + jTextField15.getText());
        } else {
        }

        
        if (checkbox8.getState()) {
            jTextField16.setEditable(true);
           weekdays.add("Sunday - "+jTextField16.getText());
        } else {
        }
        
        String days = weekdays.toString().replace("[","").replace("]", "").replace(",", " ");
        System.out.println(days);
        
        
        String firstName = jTextField1.getText();
        String lastName = jTextField4.getText();
        String age = jTextField6.getText();
        String Gender = jComboBox2.getSelectedItem().toString();
        String Department = jComboBox1.getSelectedItem().toString();
        String contactNum = jTextField8.getText();
        String roomNo = jTextField3.getText();
        String HMO = HMOs;
        String avai = days; 
        String email = jTextField5.getText();
        
        String secName =jTextField10.getText();
        String secNum = jTextField9.getText();
        String secEmail = jTextField17.getText();
        
        String FileName = lastName + firstName + ".txt";
           try{
        File parentDir = new File (fileLoc);
        parentDir.mkdir();

        File file = new File (parentDir, FileName);
       file.createNewFile();
  
         FileWriter writer = new FileWriter(fileLoc +"\\" + FileName);
         writer.write("\n ---------------------Doctor Information-------------------");
        writer.write("\nName: "+firstName +" "+ lastName);
         writer.write("\nAge: " + age);
        writer.write("\nDepartment: "+ Department);
         writer.write("\nGender: "+ Gender);
         writer.write("\nContact No.: "+contactNum);
         writer.write("\nRoom: " + roomNo);
         writer.write("\nHMO/s: "+ HMO);
         writer.write("\nAvailability: "+ avai);
         writer.write("\nEmail: "+email);
         writer.write("\n ---------------------Secretary Information-------------------");
         writer.write("\nName: " +secName);
         writer.write("\nContact No,: " + secNum);
         writer.write("\nEmail: " + secEmail);
      
         writer.close();
        }catch(Exception e){
        
        }
        
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
            java.util.logging.Logger.getLogger(NewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDoctor().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox10;
    private java.awt.Checkbox checkbox11;
    private java.awt.Checkbox checkbox12;
    private java.awt.Checkbox checkbox13;
    private java.awt.Checkbox checkbox16;
    private java.awt.Checkbox checkbox17;
    private java.awt.Checkbox checkbox18;
    private java.awt.Checkbox checkbox19;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox20;
    private java.awt.Checkbox checkbox21;
    private java.awt.Checkbox checkbox22;
    private java.awt.Checkbox checkbox23;
    private java.awt.Checkbox checkbox24;
    private java.awt.Checkbox checkbox25;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private java.awt.Checkbox checkbox5;
    private java.awt.Checkbox checkbox6;
    private java.awt.Checkbox checkbox7;
    private java.awt.Checkbox checkbox8;
    private java.awt.Checkbox checkbox9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel namelabel1;
    // End of variables declaration//GEN-END:variables
}
