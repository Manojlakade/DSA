package Introjavadsa;

public class Pattern {
    public static void main(String[] args) {

        byte n=10;
        byte trows=n;

        for(int row=1;row<=trows;row++) {
            for (int cst = 1; cst <= row; cst++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
