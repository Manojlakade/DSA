package TwoD_Arrays;

public class MatrixMultiplcation {
    public static void main(String[] args) {
        int[][] m1={
                {1,2,3},
                {4,5,6}
        };
        int [][] m2={
                {1,1},
                {1,2},
                {2,1}
        };

        int [][] result= new int[m1.length][m2[0].length];

        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j< m2[0].length;j++){
                int sum=0;
                for(int k=0;k<m1[0].length;k++)
                {
                    int temp=m1[i][k]*m2[k][j];
                    sum +=temp;
                }
                result[i][j]=sum;
            }
        }
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j] + " " );
            }
            System.out.println();
        }
    }
}
