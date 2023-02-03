import java.util.function.BiConsumer;

public class biConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 20);
        BiConsumer<Double, Double> biConsumer1 = (a, b) -> System.out.println(a + b);
        biConsumer1.accept(10.5, 20.5);
    }
}
