package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=12;
        k=k%arr.length;
        if (k<0)
        {
            k=k+arr.length;
        }
        for(int r=1;r<=k;r++)
        {
            int temp=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--) {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
        for(int num:arr){
            System.out.print(num + " ");
        }

    }

}
