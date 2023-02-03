import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i % 2 == 0;
        Predicate<Integer> p1 = i -> i > 10;
        System.out.println(p.test(10));
        System.out.println(p.and(p1).test(20));
        
        System.out.println(p.or(p1).test(20));
    }
}
