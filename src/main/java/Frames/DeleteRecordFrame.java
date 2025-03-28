/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import com.mycompany.motorphgui2.*;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * 
 */
public class DeleteRecordFrame extends javax.swing.JDialog {

    /**
     * Creates new form ViewRecordFrame
     */
    private Role currentUserRole;
    private Staff staff;
    private MainFrame mainFrame; // 

    public DeleteRecordFrame(String employeenum, MainFrame mainFrame) {
        initComponents();
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        this.currentUserRole = LoginResult.getCurrentUser().getRole();
        this.mainFrame = mainFrame; // Store the reference
        
        staff = EmployeeDataUtil.fetchEmployeeDetails(employeenum);

        // Populate 
        FieldPopulator.populateEmployeeFields(staff, new JTextField[]{
            employeeNumberTF, lastNameTF, firstNameTF, birthdayTF, addressTF, phoneNumberTF,
            SSSNumberTF, PhilHealthNumberTF, TINNumberTF, pagibigTF, superiorTF, basicSalaryTF,
            riceAllowanceTF, phoneAllowanceTF, clothingAllowanceTF, semiMonthlyRateTF, hourlyRateTF
        }, positionCB, statusCB);

        
       
    }

    private DeleteRecordFrame() {
        
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lastNameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        basicSalaryLabel = new javax.swing.JLabel();
        pagibigLabel = new javax.swing.JLabel();
        TINNumberLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        SSSNumberLabel = new javax.swing.JLabel();
        supervisorLabel = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        employeeNumberLabel = new javax.swing.JLabel();
        philHealthLabel = new javax.swing.JLabel();
        phoneAllowanceLabel = new javax.swing.JLabel();
        riceSubsidyLabel = new javax.swing.JLabel();
        clothingAllowanceLabel = new javax.swing.JLabel();
        semiMonthlyRateLabel = new javax.swing.JLabel();
        hourlyRateLabel = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        firstNameTF = new javax.swing.JTextField();
        birthdayTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        phoneNumberTF = new javax.swing.JTextField();
        SSSNumberTF = new javax.swing.JTextField();
        PhilHealthNumberTF = new javax.swing.JTextField();
        TINNumberTF = new javax.swing.JTextField();
        pagibigTF = new javax.swing.JTextField();
        superiorTF = new javax.swing.JTextField();
        employeeNumberTF = new javax.swing.JTextField();
        basicSalaryTF = new javax.swing.JTextField();
        riceAllowanceTF = new javax.swing.JTextField();
        phoneAllowanceTF = new javax.swing.JTextField();
        clothingAllowanceTF = new javax.swing.JTextField();
        semiMonthlyRateTF = new javax.swing.JTextField();
        hourlyRateTF = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        positionCB = new javax.swing.JComboBox<>();
        statusCB = new javax.swing.JComboBox<>();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastNameLabel.setText("Last Name: ");
        getContentPane().add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        addressLabel.setText("Address:");
        getContentPane().add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        statusLabel.setText("Status:");
        getContentPane().add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        basicSalaryLabel.setText("Basic Salary:");
        getContentPane().add(basicSalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        pagibigLabel.setText("PAGIBIG Number:");
        getContentPane().add(pagibigLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        TINNumberLabel.setText("TIN Number:");
        getContentPane().add(TINNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        PhoneNumberLabel.setText("Phone Number:");
        getContentPane().add(PhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        positionLabel.setText("Position:");
        getContentPane().add(positionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        SSSNumberLabel.setText("SSS Number:");
        getContentPane().add(SSSNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        supervisorLabel.setText("Immediate Supervisor:");
        getContentPane().add(supervisorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        birthdayLabel.setText("Birthday:");
        getContentPane().add(birthdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        employeeNumberLabel.setText("Employee Number:");
        getContentPane().add(employeeNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        philHealthLabel.setText("Philhealth Number:");
        getContentPane().add(philHealthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        phoneAllowanceLabel.setText("Phone Allowance:");
        getContentPane().add(phoneAllowanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        riceSubsidyLabel.setText("Rice Subsidy:");
        getContentPane().add(riceSubsidyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        clothingAllowanceLabel.setText("Clothing Allowance:");
        getContentPane().add(clothingAllowanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        semiMonthlyRateLabel.setText("Semi-monthly Rate:");
        getContentPane().add(semiMonthlyRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        hourlyRateLabel.setText("Hourly Rate:");
        getContentPane().add(hourlyRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        lastNameTF.setEditable(false);
        getContentPane().add(lastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 50, 387, -1));

        firstNameTF.setEditable(false);
        getContentPane().add(firstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 78, 387, -1));

        birthdayTF.setEditable(false);
        getContentPane().add(birthdayTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 106, 387, -1));

        addressTF.setEditable(false);
        getContentPane().add(addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 134, 387, -1));

        phoneNumberTF.setEditable(false);
        getContentPane().add(phoneNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 162, 387, -1));

        SSSNumberTF.setEditable(false);
        getContentPane().add(SSSNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 190, 387, -1));

        PhilHealthNumberTF.setEditable(false);
        getContentPane().add(PhilHealthNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 218, 387, -1));

        TINNumberTF.setEditable(false);
        getContentPane().add(TINNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 246, 387, -1));

        pagibigTF.setEditable(false);
        getContentPane().add(pagibigTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 274, 387, -1));

        superiorTF.setEditable(false);
        getContentPane().add(superiorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 358, 387, -1));

        employeeNumberTF.setEditable(false);
        getContentPane().add(employeeNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 22, 387, -1));

        basicSalaryTF.setEditable(false);
        getContentPane().add(basicSalaryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 386, 387, -1));

        riceAllowanceTF.setEditable(false);
        getContentPane().add(riceAllowanceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 414, 387, -1));

        phoneAllowanceTF.setEditable(false);
        getContentPane().add(phoneAllowanceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 442, 387, -1));

        clothingAllowanceTF.setEditable(false);
        getContentPane().add(clothingAllowanceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 470, 387, -1));

        semiMonthlyRateTF.setEditable(false);
        getContentPane().add(semiMonthlyRateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 498, 387, -1));

        hourlyRateTF.setEditable(false);
        getContentPane().add(hourlyRateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 526, 387, -1));

        deleteButton.setBackground(new java.awt.Color(252, 249, 249));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteRecord(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 90, 30));

        closeButton.setBackground(new java.awt.Color(249, 248, 248));
        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeButton.setText("Close");
        closeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 80, 30));

        positionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCOUNT RANK AND FILE", "ACCOUNT TEAM LEADER", "ACCOUNT MANAGER", "FINANCE MANAGER", "HR TEAM LEADER", "HR RANK AND FILE", "HR MANAGER", "PAYROLL RANK AND FILE", "PAYROLL TEAM LEADER", "PAYROLL MANAGER" }));
        positionCB.setToolTipText("");
        positionCB.setEnabled(false);
        getContentPane().add(positionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 330, 387, -1));

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Probationary", "Contractual" }));
        statusCB.setToolTipText("Choose from Regular, Probationary, or Contractual.");
        statusCB.setEnabled(false);
        getContentPane().add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 302, 387, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Orange and Black Illustrated Riding Tips and Trick Instagram Story .png"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteRecord(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteRecord
        // define roles for deletion
        if (!currentUserRole.hasPermission(currentUserRole, Permission.Delete)) {
            JOptionPane.showMessageDialog(this, "You do not have permission to delete employee records.", "Access Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Staff staff = new Staff();
        String filename = "MotorPH Employee Data.csv";

        staff.setEmployeeNumber(employeeNumberTF.getText());
        staff.setLastName(lastNameTF.getText());
        staff.setFirstName(firstNameTF.getText());
        staff.setBirthday(birthdayTF.getText());
        staff.setAddress(addressTF.getText());
        staff.setPhoneNumber(phoneNumberTF.getText());
        staff.setSSSNumber(SSSNumberTF.getText());
        staff.setPhilHealthNumber(PhilHealthNumberTF.getText());
        staff.setTIN(TINNumberTF.getText());
        staff.setPagibigNumber(pagibigTF.getText());
        staff.setStatus(statusCB.getSelectedItem().toString());
        staff.setPosition(positionCB.getSelectedItem().toString());
        staff.setSuperior(superiorTF.getText());
        staff.setBasic(basicSalaryTF.getText());
        staff.setRiceAllowance(riceAllowanceTF.getText());
        staff.setPhoneAllowance(phoneAllowanceTF.getText());
        staff.setClothAllowance(clothingAllowanceTF.getText());
        staff.setSemiMonthlyRate(semiMonthlyRateTF.getText());
        staff.setHourlyRate(hourlyRateTF.getText());
        
        try{
            staff.DeleteEmployee(filename);
            clearFields();
            JOptionPane.showMessageDialog(this, "Employee Record is deleted.");
            
            
              if (mainFrame != null) {
            mainFrame.updateEmployeeTable();
        }
            
            dispose();
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(DeleteRecordFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteRecord

        private void clearFields() {
            FormUtil.clearFields(employeeNumberTF, firstNameTF, lastNameTF, birthdayTF, addressTF, phoneNumberTF, 
                SSSNumberTF, PhilHealthNumberTF, TINNumberTF, pagibigTF, superiorTF, 
                basicSalaryTF, riceAllowanceTF, phoneAllowanceTF, clothingAllowanceTF, semiMonthlyRateTF, hourlyRateTF
            );

            FormUtil.clearComboBoxes(positionCB, statusCB);
        }





    private void close(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close
        dispose();
    }//GEN-LAST:event_close

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
            java.util.logging.Logger.getLogger(DeleteRecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteRecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteRecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteRecordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteRecordFrame().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PhilHealthNumberTF;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel SSSNumberLabel;
    private javax.swing.JTextField SSSNumberTF;
    private javax.swing.JLabel TINNumberLabel;
    private javax.swing.JTextField TINNumberTF;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel basicSalaryLabel;
    private javax.swing.JTextField basicSalaryTF;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JTextField birthdayTF;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel clothingAllowanceLabel;
    private javax.swing.JTextField clothingAllowanceTF;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JTextField employeeNumberTF;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel hourlyRateLabel;
    private javax.swing.JTextField hourlyRateTF;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JLabel pagibigLabel;
    private javax.swing.JTextField pagibigTF;
    private javax.swing.JLabel philHealthLabel;
    private javax.swing.JLabel phoneAllowanceLabel;
    private javax.swing.JTextField phoneAllowanceTF;
    private javax.swing.JTextField phoneNumberTF;
    private javax.swing.JComboBox<String> positionCB;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JTextField riceAllowanceTF;
    private javax.swing.JLabel riceSubsidyLabel;
    private javax.swing.JLabel semiMonthlyRateLabel;
    private javax.swing.JTextField semiMonthlyRateTF;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField superiorTF;
    private javax.swing.JLabel supervisorLabel;
    // End of variables declaration//GEN-END:variables
}
