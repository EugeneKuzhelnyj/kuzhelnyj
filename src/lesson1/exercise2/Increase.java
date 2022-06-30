package lesson1.exercise2;

import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество элементов массива");
        int count = scanner.nextInt();
    int[] array = new int[count];
    for(int i=0;i<count;i++){
        array[i]=(int)(Math.random()*100);
    }

    for(int i = 0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
        System.out.println(" ");

        increaser(array);
    }

    public static void increaser (int[] array){
        double[] array1 = new double[array.length];
        for(int i = 0;i<array.length;i++){
            array1[i]=array[i]+(array[i]*0.1);
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}



