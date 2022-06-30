package lesson1.exercise5;

public class exercise5 {
    public static void main(String[] args) {
        int[] array = new int [15];
        for(int i=0;i<15;i++){
            array[i]=i+1;
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }
}
