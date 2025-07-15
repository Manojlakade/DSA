package Introjavadsa;

public class whileloop {
    public static void main(String[] args) {
        int result=0;
        int n=123;
        while(n> 0)
        {
            int a=n%10;
            result =(result*10) +a;
            n=n/10;
        }
        System.out.println(result);
        int n1=10;
        do{
            System.out.println("hello");
        }while(n1<9);

    }

}
