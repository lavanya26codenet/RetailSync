/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RetailSync.gui;

import RetailSync.dao.EmployeeDAO;
import RetailSync.dbutil.DBConnection;
import RetailSync.pojo.EmployeePojo;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class AddEmployeesFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeesFrame
     */
    public AddEmployeesFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/logo.jpg")).getImage());
        this.setLocationRelativeTo(null);
        customizeUI(); // Apply custom UI changes
        this.setResizable(false); // Prevent resizing
        this.setSize(600, 400); // More than half screen width
        loadEmpId();
    }
    


private void customizeUI() {
    // Set background colors for panels
    jPanel2.setBackground(new Color(255, 223, 102)); // Warm Yellow (Top Panel)
    jPanel4.setBackground(new Color(135, 206, 250)); // Light Sky Blue (Right Panel - Employee Details)
    jPanel3.setBackground(new Color(255, 223, 102)); // Warm Yellow (Left Panel - Space for Image)

    // Title Label Styling
    jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
    jLabel1.setForeground(new Color(30, 30, 80)); // Deep Navy Blue

    // Employee Details Label Styling
    jLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
    jLabel2.setForeground(new Color(30, 30, 80)); // Deep Navy Blue

    // Labels for Employee ID, Name, Job, Salary
    jLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
    jLabel3.setForeground(new Color(30, 30, 80)); 

    jLabel4.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
    jLabel4.setForeground(new Color(30, 30, 80)); 

    jLabel5.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
    jLabel5.setForeground(new Color(30, 30, 80)); 

    jLabel6.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
    jLabel6.setForeground(new Color(30, 30, 80)); 

    // Back Button Styling
    btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
    btnBack.setBackground(new Color(139, 0, 139)); // Dark Magenta
    btnBack.setForeground(Color.WHITE);
    btnBack.setFocusPainted(false);
    btnBack.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    // LogOut Button Styling
    btnLogOut.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
    btnLogOut.setBackground(new Color(255, 69, 0)); // Bright Red
    btnLogOut.setForeground(Color.WHITE);
    btnLogOut.setFocusPainted(false);
    btnLogOut.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    // Add Button Styling
    btnAdd.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
    btnAdd.setBackground(new Color(60, 179, 113)); // Green
    btnAdd.setForeground(Color.WHITE);
    btnAdd.setFocusPainted(false);
    btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    // Text Fields Styling
    txtEmpId.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    txtEmpId.setBackground(Color.WHITE);
    txtEmpId.setForeground(Color.BLACK);
    txtEmpId.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

    txtEmpName.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    txtEmpName.setBackground(Color.WHITE);
    txtEmpName.setForeground(Color.BLACK);
    txtEmpName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

    txtSalary.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    txtSalary.setBackground(Color.WHITE);
    txtSalary.setForeground(Color.BLACK);
    txtSalary.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

    // ComboBox Styling
    jcJob.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    jcJob.setBackground(Color.WHITE);
    jcJob.setForeground(Color.BLACK);
    jcJob.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        btnLogOut = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jcJob = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Employee Panel");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogOut.setText("LogOut");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnLogOut)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ManagerReceptionistFrame.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Employee Details");

        jLabel3.setText("Employee ID");

        jLabel4.setText("Employee Name");

        jLabel5.setText("Job");

        jLabel6.setText("Salary");

        jcJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Receptionist", "Staff", "Cleaner" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpName)
                            .addComponent(txtEmpId)
                            .addComponent(jcJob, 0, 119, Short.MAX_VALUE)
                            .addComponent(txtSalary))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(!validateInput())
        {
            JOptionPane.showMessageDialog(null,"Please Fill All The Fields!","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
        EmployeePojo emp = new EmployeePojo();
        emp.setEmpid(txtEmpId.getText());
        emp.setEmpname(txtEmpName.getText());
        emp.setJob(jcJob.getSelectedItem().toString());
        emp.setSalary(Double.parseDouble(txtSalary.getText()));
        boolean result = EmployeeDAO.addEmployee(emp);
        if(!result)
        {
            JOptionPane.showMessageDialog(null,"Record Not Inserted!","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
         JOptionPane.showMessageDialog(null,"Record Added Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
         clearText();
         loadEmpId();
           
        }
        catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "DB Error", "Error!", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        
    }
         catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please Input Numeric Value For Salary", "Error!", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageEmployeesFrame mEmp = new ManageEmployeesFrame();
        mEmp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        DBConnection.closeConnection();
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        this.dispose();
        
                
       
        
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcJob;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    private void loadEmpId() {
    try {
        String empId = EmployeeDAO.getNextEmpId();
        txtEmpId.setText(empId);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "DB Error", "Error!", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        
    }
}
    private boolean validateInput()
    {
        return !(txtEmpName.getText().isEmpty() || txtSalary.getText().isEmpty());
    }

    private void clearText() {
        txtEmpName.setText("");
        txtSalary.setText("");
        jcJob.setSelectedIndex(0) ;
    
    }

}
