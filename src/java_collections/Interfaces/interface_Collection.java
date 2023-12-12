package java_collections.Interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class interface_Collection {
    public static void main(String[] args) {
        Collection<String> cs=new ArrayList<>();

        cs.add("apple");
        cs.add("kiwi");
        cs.add("banana");
        cs.add("manago");

        System.out.println(cs.contains("kiwi"));

        System.out.println(cs.size());

        System.out.println(cs.isEmpty());
        System.out.println(cs.remove("kiwi"));
        Iterator<String> iterator= cs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection<Integer> ci=new ArrayList<>();

        ci.add(1);
        ci.add(2);
        ci.add(3);

        ci.add(4);

        Iterator<Integer> iter= ci.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
