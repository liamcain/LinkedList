import java.util.ListIterator;
import java.util.LinkedList;
public class Driver {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        ListIterator<String> iterator = list.listIterator();
        
        
        list.add("Liam");
        list.add("uses");
        list.add("Linked");
        list.add("List");
        
        list.addFirst("Hey.");
        list.remove("uses");
        
        for(String s : list)
            System.out.print(s + " ");
    }
}