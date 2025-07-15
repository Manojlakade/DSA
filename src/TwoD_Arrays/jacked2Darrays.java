package TwoD_Arrays;

public class jacked2Darrays {
    public static void main(String[] args) {
        // in jacked arrays no. of rows are fixed but no. of coloums differ
        int [][] array=new int[2][];

        array[0]=new int[10];
        array[1]=new int[2];

        //for printing them
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " " );
            }
            System.out.println();
        }
    }


}
