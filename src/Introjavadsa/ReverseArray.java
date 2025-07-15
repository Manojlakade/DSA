package Introjavadsa;

public class ReverseArray {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50};
        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length -i-1];
            a[a.length -i-1]=temp;
        }
        for(int num:a){
            System.out.print(num + " ");

        }
    }
}
