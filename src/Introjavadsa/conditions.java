package Introjavadsa;
import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        switch (num%2){
            case 0:
                System.out.println("EVEN");
                break;
            default:
                System.out.println("odd");
        }
    }
}
