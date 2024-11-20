/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author alokk
 */
public class tables {
    public static void main(String[] args)
    {
        try {
            String userTable = "CREATE TABLE user(name VARCHAR(200), email VARCHAR(200), mobileNumber VARCHAR(10), age VARCHAR(10), password VARCHAR(200), securityquestion VARCHAR(200), answer VARCHAR(200), UNIQUE (email))";
            DbOperations.setDataOrDelete(userTable, "User table create successfully");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
