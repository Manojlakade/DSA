package Introjavadsa;

public class Armstrongmethod {
    public static void main(String[] args) {
        int n=154;
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n)
    {
        int Length=0;
        boolean arm =false;
        int Total=0;
        int lenN=n;
        while(lenN>0)
        {
            Length++;
            lenN/= 10;
        }
        int num2=n;
        while(num2>0)
        {
            int num=num2%10;
            num2=num2/10;
            Total+=Math.pow(num,Length);

        }
        if(Total==n)
        {
            arm=true;
        }
        return arm;
    }

}