import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ex2 {
   

    public static void main(String[] args) {
        Gap g = s->{
            ArrayList<String> l = new ArrayList<String>();
            Collections.addAll(l, s.split("", 0));
            return String.join(" ", l);
        };
        System.out.println(g.gap("company"));
    }

}
