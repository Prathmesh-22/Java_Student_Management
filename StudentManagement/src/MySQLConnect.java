
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *Returns java.sql.connection object on successful connection otherwise returns null
 * @author neilb
 */
public class MySQLConnect {
    public static Connection getConnection(){
        try{
            Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","Prathmesh","abcd1234");
            return connection;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Connection could not be established: "+e.getMessage());
            return null;
        }
    }

//    public static void main(String args[]){
//        Connection conn=MySQLConnect.getConnection();
//        if(conn!=null){
//            JOptionPane.showMessageDialog(null,"Connection established!");
//        }
//    }
}




