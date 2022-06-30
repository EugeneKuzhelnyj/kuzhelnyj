package lesson1.exercise17;

public class exercise17 {
    public static void main(String[] args) {
        int count= 10;
        double [] array = new double[count];
        for(int i=0; i< array.length;i++){
            array[i]= (int)(Math.random()*count);
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        double max = array[0];
        for(int i=0;i<array.length-1;i++){
            if(max<array[i+1]){
                max=array[i+1];
            }
        }
        System.out.println("Максимальное значение массива = "+max);
        for(int i=0;i<array.length;i++){
            array[i]= array[i]/max;
            System.out.print(array[i]+" ");
        }
    }
}
