package lesson1.exercise9;

public class exercise9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a="+a+" b="+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);

    }
}
