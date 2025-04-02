package other;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import domain.Student;

public class StudentDA {
        public StudentDA() throws FileNotFoundException {
       
        Scanner studentInfo= new Scanner(
            new FileReader("C:\\Users\\LENOVO IDEAPAD\\OneDrive\\Documents\\OOP\\Project2\\OOP\\Studinfo.csv"));
      
        String rowStudent = new String();       
        rowStudent = studentInfo.nextLine();
        String[] rowStudentSpecific = new String[4];       
        rowStudentSpecific = rowStudent.split(",");      
        Student student = new Student();
     
        student.setstudentNumber(rowStudentSpecific[0].trim());
        student.setlastName(rowStudentSpecific[1].trim());
        student.setfirtName(rowStudentSpecific[2].trim());
        student.setcourse(rowStudentSpecific[3].trim());
      
        ParentDA parentDA = new ParentDA();
       
        Student.setParentList(parentDA.getParentList());
       
        System.out.println(student);
        StudentInfo.close();
    }
}
