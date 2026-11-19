import java.util.ArrayList;
import java.util.Iterator;

public class StudentIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 101));
        students.add(new Student("Sara", 102));
        students.add(new Student("Ahmed", 103));

        // Traversing using an Iterator
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            s.display();
        }
    }
}