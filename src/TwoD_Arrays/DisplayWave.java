package TwoD_Arrays;

public class DisplayWave {
    public static void main(String[] args) {
        int [][] a ={
                {1,2,7,10},
                {3,4,8,11},
                {5,6,9,12}
        };

        waveDisplay(a);
    }
    private static void waveDisplay(int[][] arr){
        for(int c=0;c<arr[0].length;c++)
        {
            if (c % 2 == 0){
                for(int r=0;r< arr.length;r++)
                {
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();
            }else {
                for(int r= arr.length-1;r>=0;r--)
                {
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();
            }

        }
    }



}
