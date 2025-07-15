package Introjavadsa;

public class Pattern4 {
    public static void main(String[] args) {
        int n=7;
        int trows=n;
        int stars=1;
        int spaces=n/2;
        for(int row=1;row<=trows;row++)
        {
            for(int csp=1;csp<=spaces;csp++)
            {
                System.out.print(" ");
            }
            for(int cst=1;cst<=stars;cst++)
            {
                System.out.print("*");
            }

            if(row<=n/2){
                stars+=2;
                spaces--;
            }else{
                stars-=2;
                spaces++;
            }


            System.out.println();
        }
    }
}
