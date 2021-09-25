package week2homework;

public class SalaryRaise {

    public static double salaryRaise(double salary, int year) {
        double raisedSalary;
        if (year<1){
            raisedSalary=salary;
        }
        else if (year==1 ){
            raisedSalary=salary*1.05;
        }
        else if (year==2){
            raisedSalary=salary*1.1;
        }
        else if (year==3) {
            raisedSalary = salary * 1.15;
        }
        else if(year==4){
            raisedSalary=salary*1.2;
        }
        else {
            raisedSalary = salary * 1.25;
        }
        return raisedSalary;

    }
    public static void main(String[] args){
        System.out.println("Raised salary is: " + salaryRaise(1000, 5));
    }
}
