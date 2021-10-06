package week3homework;

import java.util.ArrayList;

public class Student extends Person {
  private int year;


    Student(String name, String surname, int age, String gender,int year){
        super();
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
        this.year=year;
    }

    int countofCredit=0;
    ArrayList<Course> takenCourses=new ArrayList<>();

    public void takingCredits(Course course){
        countofCredit=countofCredit + course.getCredit();
        if (countofCredit<20){
            this.takenCourses.add(course);
            System.out.println("count of credit is: " + countofCredit);
            course.studentCounter();



        }
        else
            System.out.println("A student can take max 20 credits");

    }








     public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}



