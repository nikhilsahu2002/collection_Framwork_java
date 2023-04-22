import java.util.ArrayList;
import java.util.Iterator;

public class Itrator_Itrable{
public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<>(); 
    list.add("NIkhil");
    list.add("sagar");
    list.add("Tiwari");
    list.add("TT");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {

        String obj = iterator.next();
        System.out.println(obj);

        // System.out.println(iterator.next());
    }
    // using for each 
    // you can use for each in all collections
    for (String o : list) {
        System.out.println(o);
    }

    // using loop
}    
}