import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SET {
    public static void main(String[] args) {
        Set <String> str1 = new HashSet<>();
        Set <String> str2 = new LinkedHashSet<>();
        Set <String> str3 = new TreeSet<>();
        str1.add("element1");
        str1.add("element2");
        str1.add("element2");
        str1.add("element3");

        // System.out.println(str1.toString());
        // Iterator<String> iterator = str1.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        str2.add("A");
        str2.add("B");
        str2.add("C");
        str2.add("C");
        str2.add("D");
        str2.add("E");

        str2.remove("D");

        // Iterator<String> iterator = str2.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        str3.add("A");
        str3.add("D");
        str3.add("C");
        str3.add("B");
        str3.add("B");
        System.out.println(str3.toString()); 

    }
}
