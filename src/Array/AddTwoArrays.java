package Array;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int [] arr1={9,9,5,8};
        int[] arr2={6,7,3,4};

        System.out.println(addTwoArrays(arr1,arr2));
    }
    public static ArrayList<Integer> addTwoArrays(int[] arr1,int[] arr2)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;

        while(i>=0 || j>=0 || carry!=0)
        {
            int digit1=i<0?0:arr1[i];
            int digit2=j<0?0:arr2[j];

            int sum=0;
            sum=digit1+digit2+carry;
            carry=sum/10;
            sum=sum%10;
            ans.add(0,sum);
            i--;
            j--;
        }
        return ans;

    }
}
