package domain;

import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String lastName;
    private String firtName;
    private String course;
    private ArrayList<Parent> parentList;

    public String getstudentNumber(){
        return studentNumber;
    }
    public void setstudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public String getlastName(){
        return studentNumber;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getfirtName(){
        return firtName;
    }
    public void setfirtName(String firtName){
        this.firtName = firtName;
    }
    public String getcourse(){
        return course;
    }
    public void setcourse(String course){
        this.course = course;
    }

    public ArrayList<Parent> getparentList() {
        return parentList;
    }
    public void setparent(ArrayList<Parent> parentList) {
        this.parentList = parentList;
    }

    public String toString(){
        String result = new String();

        for (Parent parent : parentList) {
            result += "Student Number: " + studentNumber + "\n"
            + "Last Name: " + lastName + "\n"
            + "First Name: " + firtName + "\n"
            + "Course: " + course + "\n";
            result += parentList;
        }
        return result;
    }
}
