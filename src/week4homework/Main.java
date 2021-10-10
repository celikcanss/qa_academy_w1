package week4homework;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        User Ahmet = new User("Ahmet", 1, "İstanbul/Avcılar", 1);
        User Mehmet = new User("Mehmet", 2, "Kocaeli/Gebze", 2);
        User Ayse = new User("Ayşe", 3, "Konya/Selçuklu", 3);
        User Fatma = new User("Fatma", 4, "Ordu/Ünye", 4);
        User Hayriye = new User("Hayriye", 5, "Samsun/Çarşamba", 5);

        User loginUser = null;

        for (int i = 0; i < 10000; i++) {
            System.out.println("Please enter phone number");
            Scanner scanner = new Scanner(System.in);
            int givenTel = scanner.nextInt();
            System.out.println("Please enter password");
            Scanner scanner1 = new Scanner(System.in);
            int givenPassword = scanner1.nextInt();


            if (givenTel == Ahmet.getTel()) {
                loginUser = Ahmet;
            } else if (givenTel == Mehmet.getTel()) {
                loginUser = Mehmet;
            }
            else if (givenTel==Ayse.getTel()){
                loginUser=Ayse;
            }
            else if(givenTel== Fatma.getTel()){
                loginUser=Fatma;
            }
            else if(givenTel== Hayriye.getTel()){
                loginUser=Hayriye;
            }


            loginUser.login(givenTel, givenPassword);


        }
    }
}




