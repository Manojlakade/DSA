package Introjavadsa;

public class Pattern3 {
    public static void main(String[] args) {
        int n=7;

        int trows=n;
        int star=1;
        for(int row=1;row<=trows;row++)
        {
            for(int cst=1;cst<=star;cst++)
            {
                System.out.print("*");
            }
            if (row<=n/2){
                star++;
            }else{
                star--;
            }

            System.out.println();
        }

    }
}
