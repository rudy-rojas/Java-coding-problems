package chapter01.P01_CountCharacters.Solution02;

import java.util.Map;
import java.util.HashMap;

public class TestHMCompute {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Rudy");
        map.put("Address", "Cochabamba");
        System.out.println("Map= " + map);

        map.compute("Name", (k, value) -> value.concat(" Rojas"));
        map.compute("Address", (ksdfsdfsdf2, value) -> value.concat(" - Bolivia"));

        System.out.println("NEW MAP= " + map);

    }

}
