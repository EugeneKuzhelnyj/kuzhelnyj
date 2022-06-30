package lesson1.exercise11;

public class exercise11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        if(a==b){
            if(a==c){
                System.out.println("Все три числа равны между собой");
            }else if(a>c){
                System.out.println("Наибольшими числами являются А и Б");
            }else{
                System.out.println("Наибольшим числом является С");
            }
        }else{
            if(a>b){
                if(a==c){
                    System.out.println("Наибольшими числами являются А и С");
                }else{
                    if(a>c){
                        System.out.println("Наибольшим числом является А");
                    }else{
                        System.out.println("Наибольшим числом является С");
                    }
                }
            }else{
                if(b==c){
                    System.out.println("Наибольшими числами являются Б и С");
                }else{
                    if(b>c){
                        System.out.println("Наибольшим числом является Б");
                    }else{
                        System.out.println("Наибольшим числом является С");
                    }
                }
            }
        }
    }
}
