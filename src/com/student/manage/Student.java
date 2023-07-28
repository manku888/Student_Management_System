/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.manage;

/**
 *
 * @author HP
 */
public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private  String studentCity;
    
    public Student(int studentId, String studentName, String studentPhone, String studentCity){
        super();
        this.studentId    =studentId;
        this.studentName  =studentName;
        this.studentPhone = studentPhone;
        this.studentCity  = studentCity;
    }
    public Student(String studentName, String studentPhone, String studentCity){
        super();
        this.studentName  =studentName;
        this.studentPhone = studentPhone;
        this.studentCity  = studentCity;
    }
    public Student(){
        super();
        
    }

    // getter and Setters
    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentPhone
     */
    public String getStudentPhone() {
        return studentPhone;
    }

    /**
     * @param studentPhone the studentPhone to set
     */
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    /**
     * @return the studentCity
     */
    public String getStudentCity() {
        return studentCity;
    }

    /**
     * @param studentCity the studentCity to set
     */
    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }
    
    
    // 
    
    @Override
    public String toString(){
        return "Student[studentId=" + studentId +",studentName=" + studentName +",studentPhone=" + studentPhone +","
                + "studentCity=" + studentCity + "]";
    }
    
    
    
    
            
}
