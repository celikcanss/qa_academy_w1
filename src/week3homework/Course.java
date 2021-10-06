package week3homework;

import java.util.ArrayList;

public class Course {
    private String nameOfCourse;
    private int credit;
    public int studentCount = 0;


    Course(String name, int credit) {
        this.nameOfCourse = nameOfCourse;
        this.credit = credit;

        ArrayList<Student> studentList = new ArrayList<>();


    }


    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public int getCredit() {
        return credit;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setNameOfCourse(String name) {
        this.nameOfCourse = name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    public void studentCounter (){
        if (studentCount<20){
            studentCount++;
        }
        else
            System.out.println("A course is can taken by max 20 students.");
    }


}




