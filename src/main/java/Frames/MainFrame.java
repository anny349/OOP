/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import com.mycompany.motorphgui2.CredentialsManager;
import com.mycompany.motorphgui2.EmployeeDataUtil;
import com.mycompany.motorphgui2.LoginResult;
import com.mycompany.motorphgui2.Permission;
import com.mycompany.motorphgui2.Role;
import com.mycompany.motorphgui2.Staff;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class MainFrame extends javax.swing.JDialog {

    /**
     * Creates new form MainFrame
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws com.opencsv.exceptions.CsvValidationException
     */
    
    private Role currentUserRole;
    
    public MainFrame() throws IOException, FileNotFoundException, CsvValidationException {
        initComponents();
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        
        Staff staff = new Staff();
        table1.setModel(new DefaultTableModel()); // Clear previous data
        table1.setModel(staff.tableDetails("MotorPH Employee Data.csv"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CreateLoginUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        viewLeaveStatus = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        payslipbtn = new javax.swing.JButton();
        leavebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateLoginUser.setBackground(new java.awt.Color(102, 102, 102));
        CreateLoginUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CreateLoginUser.setForeground(new java.awt.Color(255, 255, 255));
        CreateLoginUser.setText("Add User");
        CreateLoginUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateLoginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateLoginUserMouseClicked(evt);
            }
        });
        jPanel2.add(CreateLoginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 300, 161, 30));

        table1.setForeground(new java.awt.Color(51, 51, 51));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee No.", "Last Name", "First Name", "SSS ", "Philhealth", "TIN", "PAGIBIG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setPreferredWidth(80);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(1).setPreferredWidth(80);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(80);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(3).setPreferredWidth(120);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(4).setPreferredWidth(120);
            table1.getColumnModel().getColumn(5).setResizable(false);
            table1.getColumnModel().getColumn(5).setPreferredWidth(120);
            table1.getColumnModel().getColumn(6).setResizable(false);
            table1.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 770, 350));

        viewLeaveStatus.setBackground(new java.awt.Color(102, 102, 102));
        viewLeaveStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewLeaveStatus.setForeground(new java.awt.Color(255, 255, 255));
        viewLeaveStatus.setText("View Leave Status");
        viewLeaveStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewLeaveStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLeaveStatusMouseClicked(evt);
            }
        });
        jPanel2.add(viewLeaveStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 345, 161, 30));

        viewbtn.setBackground(new java.awt.Color(102, 102, 102));
        viewbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View and Update Record");
        viewbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewbtnMouseClicked(evt);
            }
        });
        jPanel2.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, 161, 30));

        addbtn.setBackground(new java.awt.Color(102, 102, 102));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add Record");
        addbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmployee(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, 161, 30));

        payslipbtn.setBackground(new java.awt.Color(102, 102, 102));
        payslipbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payslipbtn.setForeground(new java.awt.Color(255, 255, 255));
        payslipbtn.setText("Generate Payslip");
        payslipbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        payslipbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaySlip(evt);
            }
        });
        jPanel2.add(payslipbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 165, 161, 30));

        leavebtn.setBackground(new java.awt.Color(102, 102, 102));
        leavebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        leavebtn.setForeground(new java.awt.Color(255, 255, 255));
        leavebtn.setText("Apply Leave");
        leavebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leavebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavebtnMouseClicked(evt);
            }
        });
        jPanel2.add(leavebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 210, 161, 30));

        deletebtn.setBackground(new java.awt.Color(102, 102, 102));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete Record");
        deletebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteRecord(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, 161, 30));

        exitbtn.setBackground(new java.awt.Color(102, 102, 102));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Logout");
        exitbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });
        jPanel2.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 255, 161, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Red and Beige Geometric Style Custom Motorcycle Garage Presentation.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadEmployeeData() {
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setRowCount(0); // Clear table

            String filename = "MotorPH Employee Data.csv";
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                boolean firstLine = true;

                while ((line = br.readLine()) != null) {
                    if (firstLine) { // Skip header
                        firstLine = false;
                        continue;
                    }

                    String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                    for (int i = 0; i < data.length; i++) {
                        data[i] = data[i].trim().replaceAll("^\"|\"$", "");
                        if (data[i].isEmpty()) {
                            data[i] = "N/A"; 
                        }
                    }

                    model.addRow(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading employee data.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            model.fireTableDataChanged();
            }


    public void updateEmployeeTable() {
    // Reload the employee data
        loadEmployeeData();  
    }
    
   
    
    private void DeleteRecord(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteRecord
        Staff staff = new Staff(); 
        this.currentUserRole = LoginResult.getCurrentUser().getRole();
        
       if (!currentUserRole.hasPermission(currentUserRole, Permission.Delete)) {
        JOptionPane.showMessageDialog(this, "You do not have permission to delete employee records.", "Access Denied", JOptionPane.ERROR_MESSAGE);
        return; // Stop execution if permission is denied
    }

        try {
            // ✅ Proceed with deletion if permission is granted
            String employeenum = table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString();
            DeleteRecordFrame deleteFrame = new DeleteRecordFrame(employeenum, this);
            deleteFrame.setVisible(true);

        } catch (ArrayIndexOutOfBoundsException ex) {
            // ⚠️ Show error if no row is selected
            JOptionPane.showMessageDialog(this, "Select a row.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_DeleteRecord

    private void leavebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebtnMouseClicked
        Staff staff = new Staff();
           String filename = "MotorPH Employee Data.csv";

            try {
            // Get current logged-in employee
               LoginResult currentUser = LoginResult.getCurrentUser();

               if (currentUser == null || !currentUser.isValid()) {
                   JOptionPane.showMessageDialog(this, "No user is logged in.", "Login Error", JOptionPane.ERROR_MESSAGE);
                   return; // Exit if no user is logged in
               }

               String employeeID = currentUser.getEmployeeID();

               // Fetch employee details using EmployeeDataUtil
               staff = EmployeeDataUtil.fetchEmployeeDetails(employeeID);

               // Check if staff data was found
               if (staff.getLastName() != null && staff.getFirstName() != null) {
                   // Open LeaveFrame with pre-filled staff details
                   LeaveFrame leaveframe = new LeaveFrame(staff);
                   leaveframe.setVisible(true);
               } else {
                   JOptionPane.showMessageDialog(this, "Employee details not found in the system."+ employeeID, "Error", JOptionPane.ERROR_MESSAGE);
               }

           } catch (Exception ex) {
               Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leavebtnMouseClicked

    private void PaySlip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaySlip
                try {
                    int selectedRow = table1.getSelectedRow();
                    if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(this, "Select a row.", "Selection Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Get the selected employee number
                    String employeeNum = table1.getModel().getValueAt(selectedRow, 0).toString();

                    // Fetch employee details from EmployeeDataUtil
                    Staff staff = EmployeeDataUtil.fetchEmployeeDetails(employeeNum);

                    // Ensure the staff object is populated
                    if (staff.getFirstName() == null || staff.getLastName() == null) {
                        JOptionPane.showMessageDialog(this, "Employee data not found.", "Data Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Open the Payslip Frame
                    PayslipFrame payslipFrame = new PayslipFrame(staff);
                    payslipFrame.setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "An error occurred while generating the payslip.", "Error", JOptionPane.ERROR_MESSAGE);
                }

    }//GEN-LAST:event_PaySlip

    private void AddEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmployee
         Staff staff = new Staff();
         this.currentUserRole = LoginResult.getCurrentUser().getRole();

         // 🛑 Check if the user has permission to add employees
         if (!currentUserRole.hasPermission(currentUserRole, Permission.AddEmployee)) {
             JOptionPane.showMessageDialog(this, "You do not have permission to add employees.", "Access Denied", JOptionPane.ERROR_MESSAGE);
             return; // Stop if permission is denied
         }

         // ✅ Proceed if permission is granted
         AddEmployeeFrame addframe = new AddEmployeeFrame(this);
         addframe.setVisible(true);

         String filename = "MotorPH Employee Data.csv";
         try {
             table1.setModel(staff.tableDetails(filename));
         } catch (IOException | CsvValidationException ex) {
             Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_AddEmployee

    private void viewbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewbtnMouseClicked
                try {
           // Fetch the selected employee number from the table
           String employeenum = table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString();

           // Pass employee number to ViewRecordFrame
           ViewRecordFrame viewFrame = new ViewRecordFrame(employeenum, this);
           viewFrame.setVisible(true);
       } catch (ArrayIndexOutOfBoundsException ex) {
           JOptionPane.showMessageDialog(this, "Select a row.", "Selection Error", JOptionPane.ERROR_MESSAGE);
       }

    }//GEN-LAST:event_viewbtnMouseClicked

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        dispose();
        LogInFrame login = new LogInFrame();
        login.setVisible(true);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void CreateLoginUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateLoginUserMouseClicked
            this.currentUserRole = LoginResult.getCurrentUser().getRole();

        if (!currentUserRole.hasPermission(currentUserRole, Permission.CreateLogIn)) {
            JOptionPane.showMessageDialog(this, "You do not have permission to create login accounts.", "Access Denied", JOptionPane.ERROR_MESSAGE);
            return; // Stop if permission is denied
        }

        // ✅ Proceed if permission is granted
        CreateUserLogin addframe = new CreateUserLogin(null, true); // Pass `this` as the JFrame parent
        addframe.setVisible(true);
    }//GEN-LAST:event_CreateLoginUserMouseClicked

    private void viewLeaveStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLeaveStatusMouseClicked
        // Open LeaveViewFrame on click
           LeaveViewFrame leaveFrame = new LeaveViewFrame(this, true);
           leaveFrame.setVisible(true);
    }//GEN-LAST:event_viewLeaveStatusMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException | CsvValidationException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateLoginUser;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leavebtn;
    private javax.swing.JButton payslipbtn;
    private javax.swing.JTable table1;
    private javax.swing.JButton viewLeaveStatus;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
