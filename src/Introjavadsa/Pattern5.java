package Introjavadsa;

public class Pattern5 {
    public static void main(String[] args) {
        int n=4;

        for(int stars=1;stars<=2*n-1;stars++)
        {
            System.out.print("*");
        }
        System.out.println();
        int trows=n-1;
        int stars=1;
        for(int row=1;row<=trows;row++)
        {
            for(int cst=1;cst<=n-1;cst++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
