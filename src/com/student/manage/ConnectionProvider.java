/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author HP
 */
public class ConnectionProvider {
     private static Connection con;
    
    public static Connection getConnection(){
        try{
            if(con == null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Manish@1234");
            } else {
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
     return con;
    }
    
    
}
