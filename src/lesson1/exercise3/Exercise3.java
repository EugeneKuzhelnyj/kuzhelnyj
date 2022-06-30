package lesson1.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число");
        String personNumber = number.nextLine();
        boolean yesOrNot = true;

        for (int i = 0; i < personNumber.length()/2; i++) {
            if(personNumber.charAt(i) != personNumber.charAt(personNumber.length()-i-1)){
                System.out.println("Число не является палиндромом");
                yesOrNot = false;
                break;
            }
        }if(yesOrNot){
            System.out.println("Число является палиндромом");
        }

    }
}
