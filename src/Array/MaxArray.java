package Array;

public class MaxArray {
    public static void main(String[] args) {
        int[] numbers={4,5,3,1,9};
        int max=Integer.MIN_VALUE;
        for(int num:numbers)
        {
            if (num>max)
            {
                max=num;
            }
        }
        System.out.println(max );

    }
}
