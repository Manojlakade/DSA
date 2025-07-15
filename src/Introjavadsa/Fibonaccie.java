package Introjavadsa;

public class Fibonaccie {
    public static void main(String[] args) {
        int n=6;
        int previous=0;
        int current=1;
        int next=0;

        for(int i=2;i<=n;i++)
        {
            next=previous +current;
            previous=current;
            current=next;
        }
        System.out.println(next);

    }
}
