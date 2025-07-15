package Introjavadsa;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        int trows=n;
        int spaces=n-1;
        for (int rows=1;rows<=trows;rows++)
        {
            for(int csp=1;csp<=spaces;csp++)
            {
                System.out.print(" ");
            }

            for(int cst=1;cst<=rows;cst++)
            {
                if (cst==1|| cst==rows)
                {
                    System.out.print(1);
                }else{
                System.out.print(cst);
            }
            spaces--;
            System.out.println();
        }

    }
}
}
