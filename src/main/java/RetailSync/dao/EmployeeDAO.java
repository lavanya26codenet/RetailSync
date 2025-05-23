/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetailSync.dao;

import RetailSync.dbutil.DBConnection;
import RetailSync.pojo.EmployeePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class EmployeeDAO {
   public static String getNextEmpId() throws SQLException {
    Connection conn = DBConnection.getConnection();
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(empid) FROM employees");

    String empid = null;
    if (rs.next()) {
        empid = rs.getString(1);
    }

    if (empid == null) {  // If no employees exist
        return "E101";    // Start with the first ID
    }

    int empno = Integer.parseInt(empid.substring(1)); // Extract number part
    empno = empno + 1;
    return "E" + empno;
}

   public static boolean addEmployee(EmployeePojo emp)throws SQLException
   {
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement("Insert Into employees values(?,?,?,?)");
       ps.setString(1,emp.getEmpid());
       ps.setString(2,emp.getEmpname());
       ps.setString(3,emp.getJob());
       ps.setDouble(4,emp.getSalary());
       int result = ps.executeUpdate();
       return result == 1;
   }
   
   public static List<EmployeePojo> getAllEmployees()throws SQLException
   {
       Connection conn = DBConnection.getConnection();
       Statement st = conn.createStatement();
       ResultSet rs = st.executeQuery("select * from employees order by empid");
       ArrayList<EmployeePojo> emplist = new ArrayList<>();
       while(rs.next())
       {
       EmployeePojo emp = new EmployeePojo();
       emp.setEmpid(rs.getString(1));
       emp.setEmpname(rs.getString(2));
       emp.setJob(rs.getString(3));
       emp.setSalary(rs.getDouble(4));
       emplist.add(emp);
       
       }
       return emplist;
       
   }
   
   public static List<String> getAllEmpId()throws SQLException
   {
       Connection conn = DBConnection.getConnection();
       Statement st = conn.createStatement();
       ResultSet rs = st.executeQuery("select empid from employees order by empid");
       ArrayList<String> allId = new ArrayList<String>();
       while(rs.next())
       {
           allId.add(rs.getString(1));
           
       }
       return allId;
         
   }
   
   public static EmployeePojo findEmpById(String empid)throws SQLException
   {
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement("select * from employees where empid = ?");
       ps.setString(1, empid);
       ResultSet rs = ps.executeQuery();
       rs.next();
       EmployeePojo e = new EmployeePojo();
       e.setEmpid(rs.getString(1));
       e.setEmpname(rs.getString(2));
       e.setJob(rs.getString(3));
       e.setSalary(rs.getDouble(4));
       return e;
   }
   
   public static boolean updateEmployee(EmployeePojo e) throws SQLException {
   
        Connection conn = DBConnection.getConnection();
        // First UPDATE query (employees table)
        PreparedStatement ps = conn.prepareStatement("UPDATE employees SET empname = ?, job = ?, salary = ? WHERE empid = ?");
        ps.setString(1, e.getEmpname());
        ps.setString(2, e.getJob());
        ps.setDouble(3, e.getSalary());
        ps.setString(4, e.getEmpid());
        int x = ps.executeUpdate();
        
        if (x == 0) {
            return false;
        }
        // Check if user exists in users table
        boolean userExists = UserDAO.isUserPresent(e.getEmpid());

        // Only update the users table if the employee exists
        if (userExists == false)
            return true;
            ps = conn.prepareStatement("UPDATE users SET username = ?, usertype = ? WHERE empid = ?");
            ps.setString(1, e.getEmpname());
            ps.setString(2, e.getJob());
            ps.setString(3, e.getEmpid());
            int y = ps.executeUpdate();
            return y == 1 ;
    }

   public static boolean deleteEmployee(String empid)throws SQLException
   {
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement("delete from employees WHERE empid = ?");
       ps.setString(1, empid);
       int x = ps.executeUpdate();
       return x==1;
   }
}
