package week2homework;

import java.util.Random;
import java.util.Scanner;

public class GamblingGame {
    public static void main(String[] args) {
        System.out.println("Lets roll the dice!");
        int Puan = 0;

        while (Puan < 50) {
            Random random = new Random();
            int dice = random.nextInt(6) + 1;
            if (dice == 1 || dice == 2) {
                System.out.println("Game over, your score is: " + Puan);
                break;
            }
             if (dice == 4) {
                System.out.println("Dice is: 4, You got 4 points. Continue.." );
                Puan = Puan + 4;
            }
             else if (dice == 5) {
                System.out.println("Dice is: 5, You got 5 points. Continue.." );
                Puan = Puan + 5;
            }
             else if (dice == 6) {
                System.out.println("Dice is: 6, You got 6 points. Continue.." );
                Puan = Puan + 6;
            }
            else{
                System.out.println("Dice is: 3, Continue.." );
            }
        }
        if (Puan>=50){
            Puan=50;
            System.out.println("Game over, your score is: "+ Puan + "   You got the max score!!" );
        }

    }

}

