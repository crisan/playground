package cl.crisan.playground.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("chico", 100);
        mapa.put("mediano", 200);
        mapa.put("grande", 300);

        for(Map.Entry<String, Integer> e: mapa.entrySet()) {
            System.out.println("key: " + e.getKey() + " - value: " + e.getValue());
        }
    }
}
