package lesson1.exercise16;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        Scanner max = new Scanner(System.in);
        Scanner step = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int min1 = min.nextInt();
        System.out.println("Введите максимальное число");
        int max1 = max.nextInt();
        System.out.println("Введите шаг вывода чисел");
        int step1 = step.nextInt();

        for(int i = min1; i<=max1; i=i+step1){
            System.out.print(i+" ");
        }

    }
}
