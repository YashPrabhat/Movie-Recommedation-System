/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import Connection.User;

/**
 *
 * @author alokk
 */
public class UserData {
    public static void save(User user){
        String query = "Insert into user(name,email,mobileNumber,age,password,answer,) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAge()+"','"+user.getPassword()+"','"+user.getAnswer()+"')";
        DbOperations.setDataOrDelete(query, "Registered Successfully");
    }
}
