/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetailSync.dao;

import RetailSync.dbutil.DBConnection;
import RetailSync.pojo.ProductsPojo;
import RetailSync.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class OrderDAO {
    public static String getNextOrderId() throws SQLException {
    Connection conn = DBConnection.getConnection();
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(order_id) FROM orders");
    String orderid = null;
    if (rs.next()) {
        orderid = rs.getString(1);
    }

    if (orderid == null) {  // If no employees exist
        return "O101";    // Start with the first ID
    }
    int oid = Integer.parseInt(orderid.substring(1)); // Extract number part
    oid = oid + 1;
    return "O" + oid;
}
    
    public static boolean addOrders(ArrayList<ProductsPojo> al, String orderId)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into orders values(?,?,?,?)");
        int count = 0;
        for(ProductsPojo p:al)
        {
            ps.setString(1,orderId);
            ps.setString(2, p.getProductId());
            ps.setInt(3, p.getQuantity());
            ps.setString(4, UserProfile.getUserid());
            count += ps.executeUpdate();
        }
        return count==al.size();
    }
    public static List<Map<String, Object>> getOrderDetails(String userType, String userId) throws SQLException {
    List<Map<String, Object>> orderList = new ArrayList<>();
    String sql = "SELECT o.order_id, o.p_id, p.p_name, p.p_companyname, p.p_price, p.our_price, o.quantity " +
                 "FROM orders o JOIN products p ON o.p_id = p.p_id ";

    if (userType.equalsIgnoreCase("Receptionist")) {
        sql += "WHERE o.userid = ? ";
    }

    sql += "ORDER BY o.order_id";


    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        if (userType.equalsIgnoreCase("Receptionist")) {
            ps.setString(1, userId);
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Map<String, Object> row = new HashMap<>();
            row.put("order_id",rs.getString("order_id"));
            row.put("p_id", rs.getString("p_id"));
            row.put("p_name", rs.getString("p_name"));
            row.put("p_companyname", rs.getString("p_companyname"));
            row.put("p_price", rs.getDouble("p_price"));
            row.put("our_price", rs.getDouble("our_price"));
            row.put("quantity", rs.getInt("quantity")); // purchased qty
            orderList.add(row);
        }
    }
     catch (SQLException e) {
        System.out.println("Error fetching order details: " + e.getMessage());
        e.printStackTrace(); // Optional: logs full error in console
    }

    return orderList; 
}

}