import java.util.*;

public class example_03 {
    public static void main (String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
        map1.putIfAbsent(1, "один");
        map2.putIfAbsent(1, "qwerty");
        map3.putIfAbsent(1, "ytrewq");
    }
}
