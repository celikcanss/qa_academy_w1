package week1homework;

import java.util.Scanner;

public class SalaryCalculator {
   public static void main (String[]args){

        System.out.println("Please enter base salary.");
        Scanner scanner = new Scanner(System.in);
        int baseSalary = scanner.nextInt();
        System.out.println("Please enter weekday working hours.");
        Scanner scanner2 = new Scanner(System.in);
        int weekdayHours = scanner.nextInt();
        System.out.println("Please enter weekend working hours.");
        Scanner scanner3 = new Scanner(System.in);
        int weekendHours = scanner.nextInt();
        scanner.close();

        double unitSalary = baseSalary / 40;
        double totalSalary ;

        if (baseSalary<1000) {
            totalSalary = 0;
            System.out.println("The base salary is invalid, please enter a value at least 1000. ");
        }
        else if (weekdayHours>=40 && weekendHours>10){
           totalSalary= ((40*unitSalary+((weekdayHours-40)*1.5*unitSalary)+weekendHours*2*unitSalary)+500);
        }
        else if (weekdayHours>=40){
            totalSalary= (40*unitSalary+((weekdayHours-40)*1.5*unitSalary)+weekendHours*2*unitSalary);
        }
        else if (weekdayHours + weekendHours > 40){
          totalSalary= (weekdayHours*unitSalary + (40-weekdayHours)*unitSalary +(weekdayHours+weekendHours-40)*unitSalary*2);
        }
        else{
        totalSalary=(weekdayHours + weekendHours)*unitSalary;
        }

        if (totalSalary>0){
            System.out.println("Total salary is: " + totalSalary);
   }


   }
}







