package Introjavadsa;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
//        Scanner scn= new Scanner(System.in);
//        int angle1= scn.nextInt();
//        int angle2= scn.nextInt();
//        int angle3= scn.nextInt();
//        switch(angle1+angle2+angle3){
//            case 180:
//                System.out.println("Valid Triangle");
//                break;
//            default:
//                System.out.println("Invalid Triangle");
//        }
        Scanner scn= new Scanner(System.in);
        int angle1= scn.nextInt();
        int angle2= scn.nextInt();
        int angle3= scn.nextInt();
        if((angle1+angle2+angle3)==180 && angle1!=0&&angle2!=0&&angle3!=0)
        {
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }

}
