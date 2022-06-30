package lesson1.exercise20;

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        System.out.print("Введите любое количество суток: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int hour = num * 24;
        int minutes = hour * 60;
        int seconds = minutes * 60;


        String hour1 = " ";
        int ProverkaHour = hour % 100;
        int poslednyaTsyfraHour = hour % 10;
        if(ProverkaHour>10 && ProverkaHour<20 || poslednyaTsyfraHour>4 || poslednyaTsyfraHour==0) {
            hour1 = "часов";
        }else if( poslednyaTsyfraHour>1 && poslednyaTsyfraHour<5){
            hour1 = "часа";
        }else if (poslednyaTsyfraHour==1){
            hour1 = "час";
        }

        String minutes1 = " ";
        int ProverkaMinutes = minutes % 100;
        int poslednyaTsyfraMinutes = minutes % 10;
        if(ProverkaMinutes>10 && ProverkaMinutes<20 || poslednyaTsyfraMinutes>4 || poslednyaTsyfraMinutes==0 ) {
            minutes1 = "минут";
        }else if(poslednyaTsyfraMinutes>1 && poslednyaTsyfraMinutes<5){
            minutes1 = "минуты";
        }else if(poslednyaTsyfraMinutes==1 ){
            minutes1 = "минута";
        }

        String seconds1 = " ";
        int ProverkaSeconds = seconds % 100;
        int poslednyaTsyfraSeconds = seconds % 10;
        if(ProverkaSeconds>10 && ProverkaSeconds<20 || poslednyaTsyfraSeconds>4 || poslednyaTsyfraSeconds==0) {
            seconds1 = "секунд";
        }else if(poslednyaTsyfraSeconds>1 && poslednyaTsyfraSeconds<5){
            seconds1 = "секунды";
        }else if(poslednyaTsyfraSeconds==1){
            seconds1 = "секунда";
        }

        System.out.println ( +hour +" "+hour1+", "+minutes + " "+ minutes1+", "+ seconds+" "+seconds1);

    }
}
