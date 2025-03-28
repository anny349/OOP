/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import com.mycompany.motorphgui2.LoginResult;
import com.mycompany.motorphgui2.Permission;
import com.mycompany.motorphgui2.Employees;
import com.mycompany.motorphgui2.FormUtil;
import com.mycompany.motorphgui2.Role;
import com.mycompany.motorphgui2.Staff;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class AddEmployeeFrame extends javax.swing.JDialog {
    private MainFrame mainFrame; // 
    private Role currentUserRole;
    private Staff staff;
    private String getNextEmployeeID() {
    String filename = "MotorPH Employee Data.csv";
    int maxID = 0;

    try (CSVReader reader = new CSVReader(new FileReader(filename))) {
        String[] nextLine;
        reader.readNext(); // Skip header if it exists
        
        while ((nextLine = reader.readNext()) != null) {
            try {
                int currentID = Integer.parseInt(nextLine[0].trim()); // Assuming EmployeeID is in the first column
                if (currentID > maxID) {
                    maxID = currentID;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid Employee ID found in CSV: " + nextLine[0]);
            }
        }
    } catch (IOException | CsvValidationException e) {
        e.printStackTrace();
    }

    return String.valueOf(maxID + 1);
}

    
    
    /**
     * Creates new form ViewRecordFrame
     */
    public AddEmployeeFrame(MainFrame mainFrame) {
        initComponents();
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        employeeNumberTF.setText(getNextEmployeeID());
        this.currentUserRole = LoginResult.getCurrentUser().getRole();
        this.mainFrame = mainFrame; // Store the reference
        
 
    }

    private AddEmployeeFrame() {
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        statusCB = new javax.swing.JComboBox<>();
        positionCB = new javax.swing.JComboBox<>();
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
        addButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeNumberLabel.setText("Employee Number:");
        getContentPane().add(employeeNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, -1, -1));

        lastNameLabel.setText("Last Name: ");
        getContentPane().add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 39, -1, -1));

        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 67, -1, -1));

        birthdayLabel.setText("Birthday:");
        getContentPane().add(birthdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 95, -1, -1));

        addressLabel.setText("Address:");
        getContentPane().add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 123, -1, -1));

        phoneNumberLabel.setText("Phone Number:");
        getContentPane().add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 151, -1, -1));

        SSSNumberLabel.setText("SSS Number:");
        getContentPane().add(SSSNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 179, -1, -1));

        philHealthNumber.setText("Philhealth Number:");
        getContentPane().add(philHealthNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 207, -1, -1));

        TINNumberLabel.setText("TIN Number:");
        getContentPane().add(TINNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 235, -1, -1));

        pagibigLabel.setText("PAGIBIG Number:");
        getContentPane().add(pagibigLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 263, -1, -1));

        statusLabel.setText("Status:");
        getContentPane().add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 291, -1, -1));

        positionLabel.setText("Position:");
        getContentPane().add(positionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 319, -1, -1));

        supervisorLabel.setText("Immediate Supervisor:");
        getContentPane().add(supervisorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 347, -1, -1));

        basicSalaryLabel.setText("Basic Salary:");
        getContentPane().add(basicSalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 373, -1, -1));

        riceSubsidyLabel.setText("Rice Subsidy:");
        getContentPane().add(riceSubsidyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 401, -1, -1));

        phoneAllowanceLabel.setText("Phone Allowance:");
        getContentPane().add(phoneAllowanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 431, -1, -1));

        clothingAllowanceLabel.setText("Clothing Allowance:");
        getContentPane().add(clothingAllowanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 459, -1, -1));

        semiMonthlyRateLabel.setText("Semi-monthly Rate:");
        getContentPane().add(semiMonthlyRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 487, -1, -1));

        hourlyRateLabel.setText("Hourly Rate:");
        getContentPane().add(hourlyRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 515, -1, -1));

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Probationary", "Contractual" }));
        statusCB.setToolTipText("Choose from Regular, Probationary, or Contractual.");
        getContentPane().add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 288, 387, -1));

        positionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCOUNT RANK AND FILE", "ACCOUNT TEAM LEADER", "ACCOUNT MANAGER", "FINANCE MANAGER", "HR TEAM LEADER", "HR RANK AND FILE", "HR MANAGER", "PAYROLL RANK AND FILE", "PAYROLL TEAM LEADER", "PAYROLL MANAGER" }));
        positionCB.setToolTipText("Enter a valid position. This field cannot be empty.");
        getContentPane().add(positionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 316, 387, -1));

        lastNameTF.setToolTipText("Only letters, spaces, hyphens, apostrophes, and slashes allowed. (e.g., O'Neil, Jose-Marie)");
        getContentPane().add(lastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 36, 387, -1));

        firstNameTF.setToolTipText("Only letters, spaces, hyphens, apostrophes, and slashes allowed. (e.g., O'Neil, Jose-Marie)");
        getContentPane().add(firstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 64, 387, -1));

        birthdayTF.setToolTipText("Enter date in MM/dd/yyyy format. (e.g., 03/19/2025)");
        getContentPane().add(birthdayTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 92, 387, -1));

        addressTF.setToolTipText("Max 100 characters allowed.");
        getContentPane().add(addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 120, 387, -1));

        phoneNumberTF.setToolTipText("Enter 8 to 15 digits. (e.g., 918621603)");
        getContentPane().add(phoneNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 148, 387, -1));

        SSSNumberTF.setToolTipText("Enter in format XX-XXXXXXX-X. (e.g., 49-1234567-8)");
        getContentPane().add(SSSNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 176, 387, -1));

        PhilHealthNumberTF.setToolTipText("Enter 12 digits. (e.g., 382000000000)");
        getContentPane().add(PhilHealthNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 204, 387, -1));

        TINNumberTF.setToolTipText("Enter in format XXX-XXX-XXX-XXX. (e.g., 317-674-022-000)");
        getContentPane().add(TINNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 232, 387, -1));

        pagibigTF.setToolTipText("Enter 12 digits. (e.g., 441000000000)");
        getContentPane().add(pagibigTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 260, 387, -1));

        superiorTF.setToolTipText("Only letters, spaces, hyphens, apostrophes, and slashes allowed. (e.g., O'Neil, Anne-Marie)");
        getContentPane().add(superiorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 344, 387, -1));

        employeeNumberTF.setEditable(false);
        employeeNumberTF.setToolTipText("Enter 5-digit Employee Number. (e.g., 12345)");
        employeeNumberTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                employeeNumberTFKeyTyped(evt);
            }
        });
        getContentPane().add(employeeNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 8, 387, -1));

        basicSalaryTF.setToolTipText("\"Enter a valid number between 3 to 10 digits, including optional decimals.\"");
        getContentPane().add(basicSalaryTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 372, 387, -1));

        riceAllowanceTF.setToolTipText("\"Enter a valid number between 3 to 10 digits, including optional decimals.\"");
        getContentPane().add(riceAllowanceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 400, 387, -1));

        phoneAllowanceTF.setToolTipText("\"Enter a valid number between 3 to 10 digits, including optional decimals.\"");
        getContentPane().add(phoneAllowanceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 428, 387, -1));

        clothingAllowanceTF.setToolTipText("\"Enter a valid number between 3 to 10 digits, including optional decimals.\"");
        getContentPane().add(clothingAllowanceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 456, 387, -1));

        semiMonthlyRateTF.setToolTipText("\"Enter a valid number between 3 to 10 digits, including optional decimals.\"");
        getContentPane().add(semiMonthlyRateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 484, 387, -1));

        hourlyRateTF.setToolTipText("\"Enter a valid number between 3 to 10 digits, including optional decimals.\"");
        getContentPane().add(hourlyRateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 512, 387, -1));

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmployee(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 60, 30));

        closeButton.setBackground(new java.awt.Color(204, 204, 204));
        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeButton.setText("Close");
        closeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, 60, 30));

        backgroundLabel.setToolTipText("");
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close
        dispose();
    }//GEN-LAST:event_close

    private void AddEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmployee
        Staff staff = new Staff();
        String nextID = getNextEmployeeID();
        
        if (!currentUserRole.hasPermission(currentUserRole, Permission.AddEmployee)) {
            JOptionPane.showMessageDialog(this, "You do not have permission to Add employee records.", "Access Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }
             
        try {
               // === VALIDATION INTEGRATION ===
               staff.setEmployeeNumber(staff.validateEmployeeNumber(nextID));
               staff.setLastName(staff.validateName(lastNameTF.getText(), "Last Name"));
               staff.setFirstName(staff.validateName(firstNameTF.getText(), "First Name"));
               staff.setBirthday(staff.validateDate(birthdayTF.getText()));
               staff.setAddress(staff.validateAddress(addressTF.getText()));
               staff.setPhoneNumber(staff.validatePhoneNumber(phoneNumberTF.getText()));
               staff.setSSSNumber(staff.validateSSSNumber(SSSNumberTF.getText()));
               staff.setPhilHealthNumber(staff.validatePhilHealthNumber(PhilHealthNumberTF.getText()));
               staff.setTIN(staff.validateTIN(TINNumberTF.getText()));
               staff.setPagibigNumber(staff.validatePagibigNumber(pagibigTF.getText()));
               staff.setStatus(staff.validateStatus(statusCB.getSelectedItem().toString()));
               staff.setPosition(staff.validatePosition(positionCB.getSelectedItem().toString()));
               staff.setSuperior(staff.validateName(superiorTF.getText(), "Superior"));
               staff.setBasic(staff.validateNumber(basicSalaryTF.getText(), "Basic Salary"));
               staff.setRiceAllowance(staff.validateNumber(riceAllowanceTF.getText(), "Rice Allowance"));
               staff.setPhoneAllowance(staff.validateNumber(phoneAllowanceTF.getText(), "Phone Allowance"));
               staff.setClothAllowance(staff.validateNumber(clothingAllowanceTF.getText(), "Clothing Allowance"));
               staff.setSemiMonthlyRate(staff.validateNumber(semiMonthlyRateTF.getText(), "Semi-monthly Rate"));
               staff.setHourlyRate(staff.validateNumber(hourlyRateTF.getText(), "Hourly Rate"));

               // === ADD EMPLOYEE TO CSV ===
               String filename = "MotorPH Employee Data.csv";
               staff.AddEmployee(filename);

               // === RESET FIELDS AFTER ADDING ===
               
               
               clearFields();
               JOptionPane.showMessageDialog(this, "Employee record has been successfully saved.");

               if (mainFrame != null) {
                   mainFrame.updateEmployeeTable();
               }

           } catch (IllegalArgumentException | IOException ex) {
               JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
           }

            
    }//GEN-LAST:event_AddEmployee
       
    private void clearFields() {
            FormUtil.clearFields(employeeNumberTF, firstNameTF, lastNameTF, birthdayTF, addressTF, phoneNumberTF, 
                SSSNumberTF, PhilHealthNumberTF, TINNumberTF, pagibigTF, superiorTF, 
                basicSalaryTF, riceAllowanceTF, phoneAllowanceTF, clothingAllowanceTF, semiMonthlyRateTF, hourlyRateTF
            );

            FormUtil.clearComboBoxes(positionCB,statusCB);
        }
    
    
    
    private void employeeNumberTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeNumberTFKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNumberTFKeyTyped

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
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeFrame().setVisible(true);
            }
        });
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PhilHealthNumberTF;
    private javax.swing.JLabel SSSNumberLabel;
    private javax.swing.JTextField SSSNumberTF;
    private javax.swing.JLabel TINNumberLabel;
    private javax.swing.JTextField TINNumberTF;
    private javax.swing.JButton addButton;
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
    private javax.swing.JLabel philHealthNumber;
    private javax.swing.JLabel phoneAllowanceLabel;
    private javax.swing.JTextField phoneAllowanceTF;
    private javax.swing.JLabel phoneNumberLabel;
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
