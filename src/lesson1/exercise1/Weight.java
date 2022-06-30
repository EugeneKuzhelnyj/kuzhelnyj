package lesson1.exercise1;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        double m = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите массу своего тела");
        while(!(s.hasNextDouble())){
            System.out.println("Вы ввели неверные данные.Введите массу своего тела повторно");
            s.nextLine();
        }
        m = s.nextDouble();
        double gOnTheMoon = 9.8 * 0.16;
        double p = m*gOnTheMoon;
        System.out.println("Ваш вес на луне составляет "+p+"(Н)");

    }
}
