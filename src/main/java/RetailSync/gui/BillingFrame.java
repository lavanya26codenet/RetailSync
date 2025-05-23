/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RetailSync.gui;

import RetailSync.dao.OrderDAO;
import RetailSync.dao.ProductDAO;
import RetailSync.dbutil.DBConnection;
import RetailSync.pojo.ProductsPojo;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class BillingFrame extends javax.swing.JFrame {

    ArrayList<ProductsPojo> al =new ArrayList<>();
    DefaultTableModel tm; 
    double GrandTotal=0.0;
    public BillingFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Images/logo.jpg")).getImage());
        this.setLocationRelativeTo(null);
        customizeUI(); // Apply custom UI changes
        this.setResizable(false); // Prevent resizing
        this.setSize(600, 400); // More than half screen width
        //loadProductDetails();
        tm = (DefaultTableModel)jtAllOrders.getModel();
        txtProductId.requestFocus();
        
    }
    
    private void customizeUI() {
    // Set background colors for panels
    jPanel1.setBackground(new Color(255, 223, 102)); // Warm Yellow
    
    // Title Label Styling
    jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
    jLabel1.setForeground(new Color(30, 30, 80)); // Deep Navy Blue
    //jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

    // Button Styling (Fix for JToggleButton)
    styleToggleButton(btnBack, new Color(139, 0, 139)); // Dark Magenta
    styleToggleButton(btnLogOut, new Color(255, 69, 0)); // Bright Red

    // Table Styling
    jtAllOrders.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
    jtAllOrders.setRowHeight(25);
    jtAllOrders.setGridColor(Color.BLACK);
    jtAllOrders.setSelectionBackground(new Color(173, 216, 230)); // Light Blue
    jtAllOrders.setSelectionForeground(Color.BLACK);
    jtAllOrders.setShowVerticalLines(true);

    // Table Header Styling
    JTableHeader tableHeader = jtAllOrders.getTableHeader();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        btnBack = new javax.swing.JToggleButton();
        btnLogOut = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAllOrders = new javax.swing.JTable();
        btnGenerateBill = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Billing Panel");

        jLabel2.setText("Product Id");

        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

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

        jtAllOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Company", "Product Price", "Our Price", "Quantity", "Tax", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtAllOrders);

        btnGenerateBill.setText("Generate Bill");
        btnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnGenerateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(btnLogOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        if(txtProductId.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter Product Id", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        loadItemList(txtProductId.getText().trim());
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void btnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillActionPerformed
        try
        {
        String ordId = OrderDAO.getNextOrderId();
        if(OrderDAO.addOrders(al, ordId) && ProductDAO.updateStocks(al))
        {
            JOptionPane.showMessageDialog(null, "Order of Rs "+GrandTotal+"/- created successfully");
            ViewOrdersFrame vs = new ViewOrdersFrame();
            vs.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Order not created");
        }
        }
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "DB Error", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerateBillActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ReceptionistOptionsFrame roptions = new ReceptionistOptionsFrame();
        roptions.setVisible(true);
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
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnGenerateBill;
    private javax.swing.JToggleButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAllOrders;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables

    private void loadItemList(String pid) {
        try{
        ProductsPojo p = ProductDAO.getProductDetails(pid);
        if(p.getProductId()==null)
        {
            JOptionPane.showMessageDialog(null, "Please Enter a valid Product Id", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int index = getProductId(pid);
        if(index == -1)
        {
            Object[] rows = new Object[8];
            int quantity = 1;
            double amt = quantity*p.getOurPrice();
            p.setQuantity(quantity);
            p.setTotal(amt+(amt*p.getTax()/100.0));
            rows[0] = p.getProductId();
            rows[1] = p.getProductName();
            rows[2] = p.getProductCompany();
            rows[3] = p.getProductPrice();
            rows[4] = p.getOurPrice();
            rows[5] = p.getQuantity();
            rows[6] = p.getTax()+"%";
            rows[7] = p.getTotal();
            
            al.add(p);
            tm.addRow(rows);
            GrandTotal+=p.getTotal();
        }
        else
        {
            ProductsPojo products = al.get(index);
            int oldq = (int)tm.getValueAt(index, 5);
            double amt = products.getOurPrice();
            int tax = products.getTax();
            amt = amt + (amt*tax/100);
            double total = (double)tm.getValueAt(index, 7);
            tm.setValueAt(++oldq, index, 5);
            tm.setValueAt(total+amt, index, 7);
            GrandTotal += amt;
            products.setQuantity(oldq);
            products.setTotal(total+amt);
            al.set(index, products);
        }
        }
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "DB Error", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private int getProductId(String pid)
    {
        int index = -1;
        for(int i=0; i<al.size(); i++)
        {
            ProductsPojo p = al.get(i);
            if(p.getProductId().equals(pid))
            {
                index = i;
                break;
            }
            
        }
        return index;
    }
}
