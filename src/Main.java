import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer [] integers = {1,2,3,4,5,6,7,8,9,10};
       Optional<Integer> maxNum= Arrays.stream(integers).filter(integer -> integer%2==0).map(integer -> integer*integer).max(Integer::compareTo);
        System.out.println(maxNum);



    }
}