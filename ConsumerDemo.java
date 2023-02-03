import java.util.*;
import java.util.function.Consumer;

import java.util.*;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");
    }
}
