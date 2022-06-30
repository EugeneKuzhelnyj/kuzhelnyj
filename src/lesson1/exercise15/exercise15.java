package lesson1.exercise15;

public class exercise15 {
    public static void main(String[] args) {
        int count = 1;
        int count1 = 1;
        for(int i = 1; i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        while (count<=100){
            System.out.print(count+" ");
            count++;
        }
        System.out.println(" ");

        do{
            System.out.print(count1+" ");
            count1++;
        }while(count1<=100);
    }
}
