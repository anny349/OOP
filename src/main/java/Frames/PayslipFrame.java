/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import com.mycompany.motorphgui2.EmployeeDataUtil;
import com.mycompany.motorphgui2.Employees;
import com.mycompany.motorphgui2.FieldPopulator;
import com.mycompany.motorphgui2.Staff;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.String.format;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 *
 */
public class PayslipFrame extends javax.swing.JDialog {

    /**
     * Creates new form ViewRecordFrame
     */
    
    
    public PayslipFrame(Staff staff) {
        initComponents();
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        
         // Populate fields using FieldPopulator
        JTextField[] fields = {
            employeenumbertf, lastnametf, firstnametf, bdaytf, addresstf,
            phonenumtf, sssnumtf, phnumtf, tinnumtf, pagibigtf,
            supervisortf, basicsalarytf, ricetf, phonetf, clothingtf,
            semratetf, hourlyratetf
        };

        FieldPopulator.populateEmployeeFields(staff, fields, positioncb, statusCB);
    }

    private PayslipFrame() {
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        employeeNumberLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        SSSNumberLabel = new javax.swing.JLabel();
        philHealthNumber = new javax.swing.JLabel();
        TINNumberLabel = new javax.swing.JLabel();
        pagibigLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        supervisorLabel = new javax.swing.JLabel();
        basicSalaryLabel = new javax.swing.JLabel();
        riceSubsidyLabel = new javax.swing.JLabel();
        phoneAllowanceLabel = new javax.swing.JLabel();
        clothingAllowanceLabel = new javax.swing.JLabel();
        semiMonthlyRateLabel = new javax.swing.JLabel();
        hourlyRateLabel = new javax.swing.JLabel();
        lastnametf = new javax.swing.JTextField();
        firstnametf = new javax.swing.JTextField();
        bdaytf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        phonenumtf = new javax.swing.JTextField();
        sssnumtf = new javax.swing.JTextField();
        phnumtf = new javax.swing.JTextField();
        tinnumtf = new javax.swing.JTextField();
        pagibigtf = new javax.swing.JTextField();
        statusCB = new javax.swing.JComboBox<>();
        supervisortf = new javax.swing.JTextField();
        employeenumbertf = new javax.swing.JTextField();
        basicsalarytf = new javax.swing.JTextField();
        ricetf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        clothingtf = new javax.swing.JTextField();
        semratetf = new javax.swing.JTextField();
        hourlyratetf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        positioncb = new javax.swing.JComboBox<>();
        backgroundLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        salperiodtf = new javax.swing.JTextField();
        salearnedtf = new javax.swing.JTextField();
        riceallowtf = new javax.swing.JTextField();
        phoneallowtf = new javax.swing.JTextField();
        clothingallowtf = new javax.swing.JTextField();
        grosstf = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        nettf = new javax.swing.JTextField();
        ssstf = new javax.swing.JTextField();
        phtf = new javax.swing.JTextField();
        pgbtf = new javax.swing.JTextField();
        taxtf = new javax.swing.JTextField();
        tdeducttf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        y1cb = new javax.swing.JComboBox<>();
        m1cb = new javax.swing.JComboBox<>();
        d1cb = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        m2cb = new javax.swing.JComboBox<>();
        y2cb = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        d2cb = new javax.swing.JComboBox<>();
        showpaybtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeNumberLabel.setText("Employee Number:");
        jPanel1.add(employeeNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, -1, -1));

        lastNameLabel.setText("Last Name: ");
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 39, -1, -1));

        firstNameLabel.setText("First Name:");
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, -1, -1));

        birthdayLabel.setText("Birthday:");
        jPanel1.add(birthdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 95, -1, -1));

        addressLabel.setText("Address:");
        jPanel1.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 123, -1, -1));

        phoneNumberLabel.setText("Phone Number:");
        jPanel1.add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 151, -1, -1));

        SSSNumberLabel.setText("SSS Number:");
        jPanel1.add(SSSNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 179, -1, -1));

        philHealthNumber.setText("Philhealth Number:");
        jPanel1.add(philHealthNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 207, -1, -1));

        TINNumberLabel.setText("TIN Number:");
        jPanel1.add(TINNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 235, -1, -1));

        pagibigLabel.setText("PAGIBIG Number:");
        jPanel1.add(pagibigLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 263, -1, -1));

        statusLabel.setText("Status:");
        jPanel1.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 291, -1, -1));

        positionLabel.setText("Position:");
        jPanel1.add(positionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 319, -1, -1));

        supervisorLabel.setText("Immediate Supervisor:");
        jPanel1.add(supervisorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 347, -1, -1));

        basicSalaryLabel.setText("Basic Salary:");
        jPanel1.add(basicSalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 373, -1, -1));

        riceSubsidyLabel.setText("Rice Subsidy:");
        jPanel1.add(riceSubsidyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 401, -1, -1));

        phoneAllowanceLabel.setText("Phone Allowance:");
        jPanel1.add(phoneAllowanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 431, -1, -1));

        clothingAllowanceLabel.setText("Clothing Allowance:");
        jPanel1.add(clothingAllowanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 459, -1, -1));

        semiMonthlyRateLabel.setText("Semi-monthly Rate:");
        jPanel1.add(semiMonthlyRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 487, -1, -1));

        hourlyRateLabel.setText("Hourly Rate:");
        jPanel1.add(hourlyRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 515, -1, -1));

        lastnametf.setEditable(false);
        lastnametf.setEnabled(false);
        jPanel1.add(lastnametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 34, 387, -1));

        firstnametf.setEditable(false);
        firstnametf.setEnabled(false);
        jPanel1.add(firstnametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 62, 387, -1));

        bdaytf.setEditable(false);
        bdaytf.setEnabled(false);
        jPanel1.add(bdaytf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 90, 387, -1));

        addresstf.setEditable(false);
        addresstf.setEnabled(false);
        jPanel1.add(addresstf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 118, 387, -1));

        phonenumtf.setEditable(false);
        phonenumtf.setEnabled(false);
        jPanel1.add(phonenumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 146, 387, -1));

        sssnumtf.setEditable(false);
        sssnumtf.setEnabled(false);
        jPanel1.add(sssnumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 174, 387, -1));

        phnumtf.setEditable(false);
        phnumtf.setEnabled(false);
        jPanel1.add(phnumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 202, 387, -1));

        tinnumtf.setEditable(false);
        tinnumtf.setEnabled(false);
        jPanel1.add(tinnumtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 230, 387, -1));

        pagibigtf.setEditable(false);
        pagibigtf.setEnabled(false);
        jPanel1.add(pagibigtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 258, 387, -1));

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Probationary", "Contractual" }));
        statusCB.setToolTipText("Choose from Regular, Probationary, or Contractual.");
        statusCB.setEnabled(false);
        jPanel1.add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 286, 387, -1));

        supervisortf.setEditable(false);
        supervisortf.setEnabled(false);
        jPanel1.add(supervisortf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 342, 387, -1));

        employeenumbertf.setEditable(false);
        employeenumbertf.setEnabled(false);
        jPanel1.add(employeenumbertf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 6, 387, -1));

        basicsalarytf.setEditable(false);
        basicsalarytf.setEnabled(false);
        jPanel1.add(basicsalarytf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 370, 387, -1));

        ricetf.setEditable(false);
        ricetf.setEnabled(false);
        jPanel1.add(ricetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 398, 387, -1));

        phonetf.setEditable(false);
        phonetf.setEnabled(false);
        jPanel1.add(phonetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 426, 387, -1));

        clothingtf.setEditable(false);
        clothingtf.setEnabled(false);
        jPanel1.add(clothingtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 454, 387, -1));

        semratetf.setEditable(false);
        semratetf.setEnabled(false);
        jPanel1.add(semratetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 482, 387, -1));

        hourlyratetf.setEditable(false);
        hourlyratetf.setEnabled(false);
        jPanel1.add(hourlyratetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 510, 387, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Close");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 80, 30));

        positioncb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCOUNT RANK AND FILE", "ACCOUNT TEAM LEADER", "ACCOUNT MANAGER", "FINANCE MANAGER", "HR TEAM LEADER", "HR RANK AND FILE", "HR MANAGER", "PAYROLL RANK AND FILE", "PAYROLL TEAM LEADER", "PAYROLL MANAGER" }));
        positioncb.setToolTipText("");
        positioncb.setEnabled(false);
        jPanel1.add(positioncb, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 314, 387, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Grey White Minimalist Best Motorcycle Collection Instagram Story.jpg"))); // NOI18N
        jPanel1.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 600));

        jTabbedPane1.addTab("Employee Details", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel28.setText("Earnings");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 104, -1));
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 240, -1, -1));

        jLabel40.setText("Salary Period:");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 36, 104, -1));

        jLabel41.setText("Salary Earned:");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 64, 104, -1));

        jLabel42.setText("Rice Allowance:");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 92, 104, -1));

        jLabel43.setText("Phone Allowance:");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, 110, -1));

        jLabel44.setText("Clothing Allowance:");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 145, 120, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("Gross Salary:");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 182, 104, -1));
        jPanel6.add(salperiodtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 33, 170, -1));
        jPanel6.add(salearnedtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 61, 170, -1));
        jPanel6.add(riceallowtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 89, 170, -1));
        jPanel6.add(phoneallowtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 117, 170, -1));
        jPanel6.add(clothingallowtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 145, 170, -1));
        jPanel6.add(grosstf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 179, 170, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel30.setText("Deductions");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 252, 104, -1));

        jLabel31.setText("SSS:");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 280, 104, -1));

        jLabel33.setText("Philhealth:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 308, 104, -1));

        jLabel34.setText("PAGIBIG:");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 336, 104, -1));

        jLabel35.setText("Witholding Tax:");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 364, 104, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Total Deductions:");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 407, 104, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Net Salary:");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 457, 104, -1));
        jPanel6.add(nettf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 457, 170, -1));
        jPanel6.add(ssstf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 274, 170, -1));
        jPanel6.add(phtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 302, 170, -1));
        jPanel6.add(pgbtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 333, 170, -1));
        jPanel6.add(taxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 361, 170, -1));
        jPanel6.add(tdeducttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 404, 170, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 340, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Start Date:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 45, -1, -1));

        jLabel21.setText("Year:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 70, -1, -1));

        jLabel22.setText("Month:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 98, -1, -1));

        jLabel23.setText("Date:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 126, -1, -1));

        y1cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2022" }));
        jPanel2.add(y1cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 67, 70, -1));

        m1cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "9", "10", "11", "12" }));
        jPanel2.add(m1cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 95, 70, -1));

        d1cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(d1cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 123, 70, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel24.setText("Select Payslip Date Range");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("End Date:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 163, -1, -1));

        jLabel26.setText("Year:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 188, -1, -1));

        jLabel27.setText("Month:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 216, -1, -1));

        m2cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "9", "10", "11", "12" }));
        jPanel2.add(m2cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 213, 70, -1));

        y2cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2022" }));
        jPanel2.add(y2cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 185, 70, -1));

        jLabel29.setText("Date:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 241, -1, -1));

        d2cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(d2cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 241, 70, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 280));

        showpaybtn.setBackground(new java.awt.Color(204, 204, 204));
        showpaybtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showpaybtn.setText("Show Payslip");
        showpaybtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showpaybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpaybtnMouseClicked(evt);
            }
        });
        jPanel5.add(showpaybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 30));

        closebtn.setBackground(new java.awt.Color(204, 204, 204));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closebtn.setText("Close");
        closebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        jPanel5.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 70, 30));

        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAVID\\Desktop\\TA\\src\\main\\java\\Frames\\Grey White Minimalist Best Motorcycle Collection Instagram Story.jpg")); // NOI18N
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 600));

        jTabbedPane1.addTab("Payslip", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showpaybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpaybtnMouseClicked

            String employeenum = employeenumbertf.getText().trim();

            if (employeenum.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter an Employee Number", "Missing Input", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Fetch employee details
            Staff staff = EmployeeDataUtil.fetchEmployeeDetails(employeenum);

            if (staff == null) {
                JOptionPane.showMessageDialog(this, "Employee not found!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Populate employee fields using FieldPopulator
               JTextField[] fields = {
               employeenumbertf, lastnametf, firstnametf, bdaytf, addresstf,
               phonenumtf, sssnumtf, phnumtf, tinnumtf, pagibigtf,
               supervisortf, basicsalarytf, ricetf, phonetf, clothingtf,
               semratetf, hourlyratetf
           };

             FieldPopulator.populateEmployeeFields(staff, fields, positioncb, statusCB);

            // Get start and end dates
            String start = m1cb.getSelectedItem().toString() + "/" +
                           d1cb.getSelectedItem().toString() + "/" +
                           y1cb.getSelectedItem().toString();

            String end = m2cb.getSelectedItem().toString() + "/" +
                         d2cb.getSelectedItem().toString() + "/" +
                         y2cb.getSelectedItem().toString();

            try {
                float hw = staff.ComputeHoursWorked(start, end);
                salperiodtf.setText(start + " - " + end);
                salearnedtf.setText(staff.computeSalaryEarned(hw));
                riceallowtf.setText(staff.getRiceAllowance());
                phoneallowtf.setText(staff.getPhoneAllowance());
                clothingallowtf.setText(staff.getClothAllowance());
                grosstf.setText(staff.computeGrossSalary(hw));
                ssstf.setText(staff.computeSSS());
                phtf.setText(staff.computePH());
                pgbtf.setText(staff.computePGB());
                taxtf.setText(staff.computeTax());
                tdeducttf.setText(staff.computeTotalDeduct());
                nettf.setText(staff.computeNet(hw));

            } catch (IOException | CsvValidationException | ParseException ex) {
                JOptionPane.showMessageDialog(this, "Select Valid Dates", "Invalid Dates", JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_showpaybtnMouseClicked

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PayslipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayslipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayslipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayslipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayslipFrame().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SSSNumberLabel;
    private javax.swing.JLabel TINNumberLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addresstf;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel basicSalaryLabel;
    private javax.swing.JTextField basicsalarytf;
    private javax.swing.JTextField bdaytf;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel clothingAllowanceLabel;
    private javax.swing.JTextField clothingallowtf;
    private javax.swing.JTextField clothingtf;
    private javax.swing.JComboBox<String> d1cb;
    private javax.swing.JComboBox<String> d2cb;
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JTextField employeenumbertf;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstnametf;
    private javax.swing.JTextField grosstf;
    private javax.swing.JLabel hourlyRateLabel;
    private javax.swing.JTextField hourlyratetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastnametf;
    private javax.swing.JComboBox<String> m1cb;
    private javax.swing.JComboBox<String> m2cb;
    private javax.swing.JTextField nettf;
    private javax.swing.JLabel pagibigLabel;
    private javax.swing.JTextField pagibigtf;
    private javax.swing.JTextField pgbtf;
    private javax.swing.JLabel philHealthNumber;
    private javax.swing.JTextField phnumtf;
    private javax.swing.JLabel phoneAllowanceLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneallowtf;
    private javax.swing.JTextField phonenumtf;
    private javax.swing.JTextField phonetf;
    private javax.swing.JTextField phtf;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JComboBox<String> positioncb;
    private javax.swing.JLabel riceSubsidyLabel;
    private javax.swing.JTextField riceallowtf;
    private javax.swing.JTextField ricetf;
    private javax.swing.JTextField salearnedtf;
    private javax.swing.JTextField salperiodtf;
    private javax.swing.JLabel semiMonthlyRateLabel;
    private javax.swing.JTextField semratetf;
    private javax.swing.JButton showpaybtn;
    private javax.swing.JTextField sssnumtf;
    private javax.swing.JTextField ssstf;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel supervisorLabel;
    private javax.swing.JTextField supervisortf;
    private javax.swing.JTextField taxtf;
    private javax.swing.JTextField tdeducttf;
    private javax.swing.JTextField tinnumtf;
    private javax.swing.JComboBox<String> y1cb;
    private javax.swing.JComboBox<String> y2cb;
    // End of variables declaration//GEN-END:variables
}
