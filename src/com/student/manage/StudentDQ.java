/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.manage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Statement;
import java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class StudentDQ {
    public static boolean insterStudentToDB(Student st){
        boolean f= false;
        
        try {
            Connection con = ConnectionProvider.getConnection();
            // Dynamic Query
            String q= "insert into students(sname,sphone,scity) values(?,?,?)";
            
            // prepaeredStatement
           PreparedStatement pstmt =con.prepareStatement(q);
           
           // set the vlue of parameter
           pstmt.setString(1, st.getStudentName());
           pstmt.setString(2, st.getStudentPhone());
           pstmt.setString(3, st.getStudentCity());
           
           // execute
           pstmt.executeLargeUpdate();
           f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean f= false;
        try {
          Connection con=   ConnectionProvider.getConnection();
            
          String q = "delete from students where sid = ?";
          PreparedStatement pstms= con.prepareStatement(q);
          
          pstms.setInt(1, userId);
          
          pstms.executeLargeUpdate();
          f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
        
    }

    public static boolean showAllStudents() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       boolean f= false;
        try {
             Connection con = ConnectionProvider.getConnection();
             String q= "Select * from students;";
            Statement smtp = con.createStatement();
            ResultSet set = smtp.executeQuery(q);
            while(set.next()){
                int id = set.getInt(1);
                String name= set.getNString(2);
                String phone = set.getNString(3);
                String city = set.getNString("scity");
                
                System.out.println("studentID : "+ id );
                System.out.println("student Name : "+ name);
                System.out.println("Phone :" + phone);
                System.out.println("City " + city);
                System.out.println("+++++++++++++++++++++++++++");
            }
            
            
        } catch (Exception e) {
        }
         return f;
    
    }

    public static void updateStudent() {
        //throw new UnsupportedOperationException("Not supported yet."); 
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        try {
             Connection con = ConnectionProvider.getConnection();
             String q= "update students set sname=?, sphone=?, scity=? where sid = ? ";
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             
             
             
             System.out.println("Enter your name : ");
             String name = br.readLine();
             
             System.out.println("Enter your phone : ");
             String phone = br.readLine();
             
             System.out.println("Enter your City");
             String city = br.readLine();
             
             System.out.println("Enter your SId : ");
             int id = Integer.parseInt(br.readLine());
             
             
             
             PreparedStatement psmt = con.prepareStatement(q);
            
             psmt.setString(1, name);
             psmt.setString(2, phone);
             psmt.setString(3, city);
              psmt.setInt(4, id);
             
            
             psmt.executeUpdate();
             
             System.out.println("updated.......");     
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
