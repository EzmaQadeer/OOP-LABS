import java.util.ArrayList;
import java.util.Iterator;

public class DirectIteratorExample {
    public static void main(String[] args) {
        
        ArrayList<Int2> v2 = new ArrayList<>();
        v2.add(new Int2(5));
        v2.add(new Int2(10));

        System.out.println("Before increment: " + v2);

        
        Iterator<Int2> e = v2.iterator();

        //Traverse and increment directly in one line using e.next()
        while (e.hasNext()) {
        // e.next() fetches the object and .increment() modifies it immediately on the heap
            e.next().increment();
        }

        System.out.println("After increment: " + v2);
    }
}