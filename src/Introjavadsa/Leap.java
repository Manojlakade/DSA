package Introjavadsa;

public class Leap {
    public static void main(String[] args) {
        int Lyear=2014;
        if(((Lyear%4==0)&&(Lyear%100!=0))||Lyear%400==0)
        {
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
