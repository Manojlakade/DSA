package Introjavadsa;

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;

        int trows=n;

        int spaces=n-1;
        int stars=1;

        for(int row=1;row<=n;row++)
        {
            //spaces n-1,n-2,n-2
            for(int csp=1;csp<=spaces;csp++)
            {
                System.out.print(" ");
            }
            for(int cst=1;cst<=stars;cst++)
            {
                System.out.print("*");
            }
            System.out.println();
            stars +=2;
            spaces--;
        }
    }
}
