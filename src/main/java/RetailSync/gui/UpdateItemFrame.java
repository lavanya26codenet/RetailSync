/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RetailSync.gui;

import RetailSync.dao.ProductDAO;
import RetailSync.dbutil.DBConnection;
import RetailSync.pojo.ProductsPojo;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Admin
 */
public class UpdateItemFrame extends javax.swing.JFrame {

    DefaultTableModel tm;
    public UpdateItemFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/logo.jpg")).getImage());
        this.setLocationRelativeTo(null);
        customizeUI(); // Apply custom UI changes
        this.setResizable(false); // Prevent resizing
        this.setSize(600, 400); // More than half screen width
        loadProductDetails();
    }
    
    private void customizeUI() {
        jPanel2.setBackground(new Color(255, 223, 102)); // Warm Yellow (Top Panel)
        jPanel4.setBackground(new Color(135, 206, 250)); // Light Sky Blue (Right Panel)
        jPanel3.setBackground(new Color(255, 223, 102)); // Warm Yellow (Left Panel)

        jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        jLabel1.setForeground(new Color(30, 30, 80));

        jLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        jLabel2.setForeground(new Color(30, 30, 80));

        Font labelFont = new Font("Comic Sans MS", Font.BOLD, 16);
        Color labelColor = new Color(30, 30, 80);

        lblProductId.setFont(labelFont);
        lblProductId.setForeground(labelColor);
        lblProductName.setFont(labelFont);
        lblProductName.setForeground(labelColor);
        lblCompanyName.setFont(labelFont);
        lblCompanyName.setForeground(labelColor);
        lblProductPrice.setFont(labelFont);
        lblProductPrice.setForeground(labelColor);
        lblOurPrice.setFont(labelFont);
        lblOurPrice.setForeground(labelColor);
        lblQuantity.setFont(labelFont);
        lblQuantity.setForeground(labelColor);
        lblTax.setFont(labelFont);
        lblTax.setForeground(labelColor);
        
        txtProductId.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        txtProductId.setBackground(Color.WHITE);
        txtProductId.setForeground(Color.BLACK);
        txtProductId.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        
        txtProductName.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        txtProductName.setBackground(Color.WHITE);
        txtProductName.setForeground(Color.BLACK);
        txtProductName.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        txtProductPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        txtProductPrice.setBackground(Color.WHITE);
        txtProductPrice.setForeground(Color.BLACK);
        txtProductPrice.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        txtOurPrice.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        txtOurPrice.setBackground(Color.WHITE);
        txtOurPrice.setForeground(Color.BLACK);
        txtOurPrice.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        txtProductCompany.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        txtProductCompany.setBackground(Color.WHITE);
        txtProductCompany.setForeground(Color.BLACK);
        txtProductCompany.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        txtQuantity.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        txtQuantity.setBackground(Color.WHITE);
        txtQuantity.setForeground(Color.BLACK);
        txtQuantity.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        jcTax.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        jcTax.setBackground(Color.WHITE);
        jcTax.setForeground(Color.BLACK);
        jcTax.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
       
        styleButton(btnBack, new Color(139, 0, 139)); // Dark Magenta
        styleButton(btnLogOut, new Color(255, 69, 0)); // Bright Red
        styleButton(btnUpdate, new Color(60, 179, 113)); // Green
    }

    private void styleButton(JToggleButton button, Color bgColor) {
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    // Set background colors for panels
    jPanel1.setBackground(new Color(255, 223, 102)); // Warm Yellow
    jPanel2.setBackground(new Color(135, 206, 250)); // Light Sky Blue

       
    // Button Styling (Fix for JToggleButton)
    styleToggleButton(btnBack, new Color(139, 0, 139)); // Dark Magenta
    styleToggleButton(btnLogOut, new Color(255, 69, 0)); // Bright Red

    // Table Styling
    jtViewItems.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    jtViewItems.setRowHeight(25);
    jtViewItems.setGridColor(Color.BLACK);
    jtViewItems.setSelectionBackground(new Color(173, 216, 230)); // Light Blue
    jtViewItems.setSelectionForeground(Color.BLACK);
    jtViewItems.setShowVerticalLines(true);

    // Table Header Styling
    JTableHeader tableHeader = jtViewItems.getTableHeader();
    tableHeader.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
    tableHeader.setBackground(new Color(30, 144, 255)); // Dodger Blue
    tableHeader.setForeground(Color.WHITE);
}

// Unified method for JToggleButton styling
private void styleToggleButton(JToggleButton button, Color bgColor) {
    button.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
    button.setBackground(bgColor);
    button.setForeground(Color.WHITE);
    button.setFocusPainted(false);
    button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
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
        jLabel2 = new javax.swing.JLabel();
        lblProductId = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblCompanyName = new javax.swing.JLabel();
        txtProductCompany = new javax.swing.JTextField();
        lblProductPrice = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        lblOurPrice = new javax.swing.JLabel();
        txtOurPrice = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblTax = new javax.swing.JLabel();
        jcTax = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtViewItems = new javax.swing.JTable();
        btnUpdate = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update Item Panel");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(btnLogOut))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel2.setText("Update Item");

        lblProductId.setText("Product Id");

        lblProductName.setText("Product Name");

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        lblCompanyName.setText("Company Name");

        lblProductPrice.setText("Product price");

        lblOurPrice.setText("Our Price");

        lblQuantity.setText("Quantity");

        lblTax.setText("Tax");

        jcTax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "18%", "28%" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcTax, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtOurPrice)
                                        .addComponent(txtProductCompany)))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompanyName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOurPrice)
                    .addComponent(txtOurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTax)
                    .addComponent(jcTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jtViewItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Company", "Product Price", "Our Price", "Quantity", "Tax"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtViewItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtViewItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtViewItems);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jtViewItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtViewItemsMouseClicked
        int row = jtViewItems.getSelectedRow();
        txtProductId.setText(tm.getValueAt(row, 0).toString());
        txtProductName.setText(tm.getValueAt(row, 1).toString());
        txtProductCompany.setText(tm.getValueAt(row, 2).toString());
        txtProductPrice.setText(tm.getValueAt(row, 3).toString());
        txtOurPrice.setText(tm.getValueAt(row, 4).toString());
        txtQuantity.setText(tm.getValueAt(row, 5).toString());
        String tax = tm.getValueAt(row,6).toString();
        jcTax.setSelectedItem(tax);
        
    }//GEN-LAST:event_jtViewItemsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!validateInputs())
        {
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "!Insufficient Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try{
            int n = jcTax.getSelectedItem().toString().length();
            int tax = Integer.parseInt(jcTax.getSelectedItem().toString().substring(0,n-1));
            ProductsPojo p = new ProductsPojo();
            p.setProductId(txtProductId.getText().trim());
            p.setProductName(txtProductName.getText().trim());
            p.setProductCompany(txtProductCompany.getText().trim());
            p.setProductPrice(Double.parseDouble(txtProductPrice.getText().trim()));
            p.setOurPrice(Double.parseDouble(txtOurPrice.getText().trim()));
            p.setQuantity(Integer.parseInt(txtQuantity.getText().trim()));
            p.setTax(tax);
            boolean result = ProductDAO.updateProducts(p);
            if(result)
            {
                JOptionPane.showMessageDialog(null, "Product Updated Successfully", "Success!!", JOptionPane.INFORMATION_MESSAGE);
                loadProductDetails();
                return;
            }
            JOptionPane.showMessageDialog(null, "Product Updation Failed", "Error!!", JOptionPane.INFORMATION_MESSAGE);
                
        }
        catch(NumberFormatException ex)
        {
           JOptionPane.showMessageDialog(null, "Please Input Numeric Value", "Conversion Error!", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "DB Error", "Error!", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageStocksFrame mStocks = new ManageStocksFrame();
        mStocks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        DBConnection.closeConnection();
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnLogOut;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcTax;
    private javax.swing.JTable jtViewItems;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblOurPrice;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTax;
    private javax.swing.JTextField txtOurPrice;
    private javax.swing.JTextField txtProductCompany;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

private void loadProductDetails() {
    try
        {
        List<ProductsPojo> productList = ProductDAO.getProductDetails();
        tm = (DefaultTableModel)jtViewItems.getModel();
        // Clearing previous data if any
        tm.setRowCount(0);  // This will ensure old data is cleared before adding new ones
        // Define column headers, ensure they match your data
        tm.setColumnIdentifiers(new Object[]{"Product ID", "Product Name","Product Company", "Product Price", "Our Price", "Quantity", "Tax"});

        Object[] rows = new Object[7];
        if(productList.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No product present in the stock");
            return;
        
        }
        btnUpdate.setEnabled(true);
        for(ProductsPojo p:productList)    
        {
            rows[0] = p.getProductId();
            rows[1] = p.getProductName();
            rows[2] = p.getProductCompany();
            rows[3] = p.getProductPrice();
            rows[4] = p.getOurPrice();
            rows[5] = p.getQuantity();
            rows[6] = p.getTax()+"%";
            
            tm.addRow(rows);
        }
        }
        catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "DB Error", "Error!", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
        
    }
    }

private boolean validateInputs()
    {
        return !(txtProductName.getText().isEmpty()||txtProductCompany.getText().isEmpty()
                ||txtProductPrice.getText().isEmpty()||txtOurPrice.getText().isEmpty()||txtQuantity.getText().isEmpty());
    }
    
}
