package TwoD_Arrays;

public class twodarray {
    public static void main(String[] args) {
        int [][] array=new int[2][3];

        array[0][0]=7;

        //length-colomns
        System.out.println(array.length);

        //rows
        System.out.println(array[0].length);

        //for printing elements
        for (int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
