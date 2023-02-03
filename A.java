import java.util.ArrayList;
import java.util.Arrays;

public class A{
    public static void main(String args[]){
        int[] i = {1,2,3,4};
        System.out.println(Arrays.stream(i).filter(n -> n % 2 == 0).map(n -> n * n).sum());;

    }
}