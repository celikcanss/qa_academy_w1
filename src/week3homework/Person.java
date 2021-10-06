package week3homework;

/*We will have person class.
 person class has variables : name, surname, age, gender
 Student and teacher classes will extends person class.
 Student’s has year variable
 Course class has variables; name, credit, studentCount
 Teachers can give maximum 3 courses
 Students can take maximum 20 credits
 A maximum of 20 students can register for a course.*/



public class Person {
   public String name;
   public String surname;
    public int age;
   public String gender;

   public Person(String name, String surname, int age, String gender){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}







