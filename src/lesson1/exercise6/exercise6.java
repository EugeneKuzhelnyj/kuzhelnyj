package lesson1.exercise6;

public class exercise6 {
    public static void main(String[] args) {
        int[] array = new int [100];
        for(int i=0;i<100;i++){
            array[i]=i+1;
        }
        for(int i=1;i<=100;i=i+2){
            System.out.println(array[i]);
        }
    }
}
