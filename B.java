import java.util.ArrayList;
import java.util.HashMap;

public class B {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Sai", "active", 555, 4400));
		list.add(new Employee(109, "Rama", "active", 555, 5200));
		list.add(new Employee(107, "John", "active", 222, 2700));
		list.add(new Employee(108, "Shree", "active", 555, 6400));
		list.add(new Employee(106, "Reddy", "inactive", 333, 3400));
		list.add(new Employee(105, "Tanya", "active", 555, 2400));
		list.add(new Employee(104, "Punya", "active", 222, 200));
		list.add(new Employee(103, "Doe", "active", 555, 2600));
        System.out.println("Active Employees: ");
        list.stream().filter(e->e.status=="active").forEach(System.out::println);
        
        System.out.println("Inctive Employees: ");
        list.stream().filter(e->e.status=="inactive").forEach(System.out::println);
        
        System.out.println("Max salary: ");
        System.out.println(list.stream().map(e->e.sal).max(Integer::compare).get());
        
        System.out.println("Min salary: ");
        System.out.println(list.stream().map(e->e.sal).min(Integer::compare).get());

        HashMap<Integer, ArrayList<Employee>> mp = new HashMap<Integer, ArrayList<Employee>>();

        // list.stream().forEach(e->{
        //     mp.getOrDefault(e.getDeptId(), new ArrayList<Employee>()).add(e);
        // });

        list.stream().collect(null)

        System.out.println(list);

    }
}
