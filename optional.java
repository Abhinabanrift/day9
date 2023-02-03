import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        String[] str = new String[20];
        Optional<String[]> optional = Optional.ofNullable(str);
        optional.ifPresent(System.out::println);
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("empty"));
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1.hashCode());

        Optional<String> optional2 = Optional.of("hello");
        optional2 = Optional.ofNullable(null);
        System.out.println(optional2.hashCode());
        System.out.println(optional2.get());
        
        System.out.println(optional2.orElse("world"));
        System.out.println(optional2.orElseGet(() -> "world"));
        System.out.println(optional2.orElseThrow(RuntimeException::new));
    }
}
    
