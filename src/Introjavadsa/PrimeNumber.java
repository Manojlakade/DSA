package Introjavadsa;

public class PrimeNumber {
    public static void main(String[] args) {
        int number=15;
        if(number >= 3){
            System.out.println(1);
            System.out.println(2);
        }else if(number >= 2){
            System.out.println(1);
            System.out.println(2);
        }else if(number == 1){
            System.out.println(1);
        }else{
            System.out.println("Invalid");
        }

        for(int i=3;i<=number;i++)
        {
            boolean flag=true;
            for(int j=2; j<i;j++) {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }

        }
    }
}
