import java.util.Collections;
import java.util.LinkedList;

public class HomeWork4 {
    private static final String Collection = null;

    public static void main(String[] args){
        
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("4");
        ll.add("2");
        ll.add("1");
        ll.add("5");
        ll.add("3");
        System.out.println(ll);
        LinkedList<String> yy = reverseLinkedList(ll);
        System.out.println(yy);
    }

    
    /**
     * @param ll
     * @return
     */
    private static LinkedList reverseLinkedList(LinkedList ll) {
        Collections.reverse(ll);
        return ll;
    }
}