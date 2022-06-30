package lesson1.exercise18;

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner rub = new Scanner(System.in);
        System.out.println("Введите количество рублей");
        double rub1 = rub.nextDouble();
        Scanner exchange = new Scanner(System.in);
        System.out.println("Введите курс доллара к рублю");
        double exchange1 = exchange.nextDouble();
        double usd = rub1/exchange1;
        System.out.println(rub1+" рублей эквивалентны "+usd+"$");

    }
}
