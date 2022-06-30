package lesson1.exercise4;

public class Numbers {
    public static void main(String[] args) {
        int[] array = new int [100];
        for(int i=0;i<100;i++){
            array[i]=i+1;
            if(array[i]%2==0){
                System.out.println(array[i]);
            }
        }
    }
}
