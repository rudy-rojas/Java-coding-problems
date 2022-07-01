package chapter01.P01_CountCharacters.Solution02;

import java.util.Map;
import java.util.HashMap;

public class Test02HMCompute {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 4);
        map.put('c', 6);

        System.out.println("Map: " + map);

        map.compute('a', (key, value) -> ((value == null) ? 1 : ++value));
        map.compute('d', (key, value) -> ((value == null) ? 1 : value+1));

        System.out.println("New map: " + map);


    }

}
