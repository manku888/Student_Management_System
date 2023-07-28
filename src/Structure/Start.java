/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import com.student.manage.Student;
import com.student.manage.StudentDQ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class Start {
    public static void main(String[] args)throws IOException{
        System.out.println("Welcome to Student Managemsnt App");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while (true) {            
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to Display student");
            System.out.println("PRESS 4 to Updeate student");
            System.out.println("PRESS 5 to Exit App");
            
            // choise input from user 
            int c=Integer.parseInt(br.readLine());
            if (c==1) {
                //Add student
                System.out.println("Enter User Name  : ");
                String name=br.readLine();
                
                System.out.println("Enter User Phone : ");
                String phone=br.readLine();
                
                System.out.println("Enter User City  : ");
                String city = br.readLine();
                // create student object to store student
                Student st= new Student(name, phone, city);
                boolean answer = StudentDQ.insterStudentToDB(st);
                if (answer) {
                    System.out.println("Student is addeded Succesfully.....");
                }
                else{
                    System.out.println("Something went Wront try again....");
                }
                System.out.println(st);
                
            }else if (c==2) {
                //Delete student
                System.out.println("Enter Students Id to Delete : ");
               int userId  = Integer.parseInt(br.readLine());
               StudentDQ.deleteStudent(userId);
               boolean f=StudentDQ.deleteStudent(userId);
                if (f) {
                    System.out.println("Deleted.......");
                }
                else{
                    System.out.println("Somthing went worng......");
                }
               
               
                
            }else if (c==3) {
                //Display student
                System.out.println("Show all Students : ");
                
                StudentDQ.showAllStudents();
                
//              boolean f = StudentDQ .showAllStudents();
//                if (f) {
//                    System.out.println("Dekh lo");
//                }
//                else{
//                    System.out.println("Somthing went Wrong");
//                }
                
            }
            else if(c==4){
                // Update Student 
                System.out.println("Enter Student id for upadate student details : ");
                //int sid = Integer.parseInt(br.readLine());
                StudentDQ.updateStudent();
            }
            else if (c==5) {
                //Exit App
                
                break;
            }
            else{
                
            }

        }
        System.out.println("Thank-you for using my application ");
        System.out.println("See you soon....bye-bye");
    }
    
}
