package Introjavadsa;

public class Triangle2 {
    public static void main(String[] args) {
        int sideOne=10,sideTwo=12  ,sideThree=11;
        if((sideOne==sideTwo)&&(sideTwo==sideThree))
        {
            System.out.println("equilateral");
        }else if ((sideOne==sideTwo)||(sideOne==sideThree)||(sideTwo==sideThree))
        {
            System.out.println("Isoscelene");
        }else{
            System.out.println("scelene");
        }
    }
}
