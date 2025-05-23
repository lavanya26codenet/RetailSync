/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetailSync.dao;

import RetailSync.dbutil.DBConnection;
import RetailSync.pojo.UserPojo;
import RetailSync.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class UserDAO {
    public static boolean validateUser(UserPojo user)throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? and "
                + "password = ? and usertype = ?");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUsertype());
        
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        {
            String username = rs.getString(5);
            UserProfile.setUsername(username);
            return true;
        }
        return false;
        
        
    }
    
    public static boolean isUserPresent(String empid)throws SQLException
    {
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement("select 1 from users where empid = ?");
       ps.setString(1, empid);
       ResultSet rs = ps.executeQuery();
       return rs.next();
               
    }
    
}
