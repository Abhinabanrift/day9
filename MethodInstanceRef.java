import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


class compareTo{
    public int compareAge(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }

   
}

public class MethodInstanceRef {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("dsdf", 8));
        list.add(new Person("asa", 18));
        list.add(new Person("assa", 12));
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("asa");
        list1.add("assa");
        list1.add("dfassa");
        Collections.sort(list, new compareTo()::compareAge);
        list.stream().forEach(System.out::println);

        Collections.sort(list1, String::compareToIgnoreCase);
        list1.stream().forEach(System.out::println);

    }
}
