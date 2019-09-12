/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.managment.system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ICTSTUDENT
 */
public class dpconnection {
    static Connection con;
    static Connection getConnection()
{
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_managment_system","root","root");   
   }
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}
return con;
}
}
