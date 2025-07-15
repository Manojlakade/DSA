package Introjavadsa;

public class Max {
    public static void main(String[] args) {
        int One=10,Two=20,Three=30;
        if((One>Two)&&(One>Three))
        {
              System.out.println(One);
        }else if( (Two>One) &&(Two>Three)){
            System.out.println(Two);
        }else{
            System.out.println(Three);
        }

    }

}
