package Array;
import java.util.ArrayList;
public class arraylistdemo {
    public static void main(String[] args) {

        //creating
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList <String> languages=new ArrayList<>();

        //adding
        languages.add("java");
        languages.add("javaScript");
        languages.add("python");
        languages.add("ruby");
        System.out.println(languages);

         //adding at pecific index
        languages.add(1,"c++");
        System.out.println(languages);

        //accessing
        String str= languages.get(1);
        System.out.println(languages);

        //changing
        languages.set(1,"php");
        System.out.println(languages);

        //removing
        System.out.println(languages.size());
        languages.remove(1);
        System.out.println(languages);
        System.out.println(languages.size()  );

        //iteration
        for (String language:languages)
        {
            System.out.print(language + " ");
        }




    }
}
