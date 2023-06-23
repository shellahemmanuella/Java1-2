// write a java program to create a class called  student with a private instance variables students_id, student_name and grades provide public setter and getter methods  to access and modify the student_id,student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades varaiable while performing additional variables.

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;

    private ArrayList<Integer> grades;//this returns an arrayList of integers of grades.

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        }
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("Shellah Emmanuella");
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(98);

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grades: " + student.getGrades());
    }
}