package week3homework;

import java.util.ArrayList;

public class Teacher extends Person {

  Teacher(String name, String surname, int age, String gender){
      super();
      this.name=name;
    this.surname=surname;
    this.age=age;
    this.gender=gender;

}
        int countOfCourse=0;
 ArrayList<Course> givenCourses = new ArrayList<>();

 public  void giveCourse(Course course){
     if (countOfCourse<3) {
         this.givenCourses.add(course);
         countOfCourse++;
     }
     else
         System.out.println("A teacher can give max 3 courses.");


 }





}



