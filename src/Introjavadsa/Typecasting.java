package Introjavadsa;

public class Typecasting {
    public static void main(String[] args) {
        //implicit/automtic/widdening - done by compiler
        byte by=10;
        short sh=10;
        int in=10;
        long lg=10;
        sh=by;
        in=by;
        lg=by;
        //by=sh
        lg=in;
        lg=in;
        //explicit/manual/narrowing
        by=(byte)sh;


        in=(int) lg;
    }

}
