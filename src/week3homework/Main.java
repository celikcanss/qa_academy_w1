package week3homework;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
        Course mat = new Course ("MAT101",6);
        Teacher cansu = new Teacher("cansu","celik",26,"female");
        Course end= new Course("END101",8);
        Course ata= new Course("ATA102",4);
        Course fiz= new Course("FIZ102",7);
        Student ege= new Student("ege", "surname",27,"female",4);
        Student can= new Student("can","surname",27,"male",3);


        System.out.println("Ege's courses..." );
        ege.takingCredits(mat);
        ege.takingCredits(end);
        ege.takingCredits(fiz);
        System.out.println("Ege will take following courses" + ege.takenCourses);

        System.out.println("Can's courses..." );
        can.takingCredits(end);
        can.takingCredits(mat);
        can.takingCredits(fiz);
        System.out.println("Can will take following courses" + can.takenCourses);


        System.out.println("Teacher's courses..." );
        cansu.giveCourse(mat);
        cansu.giveCourse(end);
        cansu.giveCourse(ata);
        cansu.giveCourse(fiz);
        System.out.println("Cansu will give following courses" + cansu.givenCourses);
    }



}
