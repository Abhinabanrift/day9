import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.add(5);

        Function<Integer, Integer> f = i -> i * i;
        list.stream().map(x->x*x).forEach(System.out::println);
        
    }
}
