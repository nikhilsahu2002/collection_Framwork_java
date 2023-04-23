
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


class BOOK{
    int id;
    String name ,author,publisher;
    int Qty;
    public BOOK(int id ,String author,String publisher, String name,int Qty) {
      this.Qty = Qty;
      this.author = author;
      this.id = id;
      this.name=name;
      this.publisher = publisher;
    }
    @Override
    public String toString() {
        return "BOOK [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", Qty=" + Qty
                + "]";
    }
    
}
public class LIST {
    public static void main(String[] args) {
        Collection <BOOK> booklist = new LinkedList<>();
        BOOK book = new BOOK(69, "Nikhl", "RAndom", "FunnyLife", 25);
        BOOK book2 = new BOOK(1, "Sagar", "RAndom", "How To Became topper", 2500);
        booklist.add(book2);
        booklist.add(book);

        Iterator<BOOK> iterator = booklist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
}
