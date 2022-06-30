package lesson1.exercise12;

public class exercise12 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        print(a);
        print(b);

    }
    public static void print(boolean i){
        if(i==true){
            System.out.println("Истина");
        }else {
            System.out.println("Ложь");
        }
    }
}
