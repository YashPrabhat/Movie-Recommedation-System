/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package images;

import AnniWork.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shudhanshu pal
 */
public class connectortest {
    public static Connection Connection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","khaleesi");
        } catch (SQLException ex) {
            Logger.getLogger(connectortest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
