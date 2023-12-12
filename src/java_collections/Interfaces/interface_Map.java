package java_collections.Interfaces;

import java.util.HashMap;
import java.util.Map;

public class interface_Map {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();

        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);

        System.out.println(mp);
        System.out.println(mp.get("a"));

        System.out.println(mp.containsKey("b"));
        System.out.println(mp.containsValue(7));

        mp.remove("e");
        System.out.println(mp);

        System.out.println(mp.keySet());
        System.out.println(mp.values());

        System.out.println(mp.entrySet());
    }
}
