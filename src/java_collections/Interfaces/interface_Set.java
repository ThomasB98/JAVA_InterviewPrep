package java_collections.Interfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class interface_Set {
    public static void main(String[] args) {
        Set<String> ls=new HashSet<>();

        Set<String> ls2=new HashSet<>();

        ls.add("apple");
        ls.add("banana");
        ls.add("mango");
        ls.add("kiwi");

        ls2.add("Citrus");
        ls2.add("Stone fruit");
        ls2.add("Berries");
        ls2.add("Melons");

        Set<String> cls=new HashSet<>();

        cls.addAll(ls);
        cls.addAll(ls2);

        Set<String> cls2=new HashSet<>();
        cls2.add("Citrus");
        cls2.add("Stone fruit");
        cls2.add("apple");
        cls2.add("banana");

        System.out.println(cls2.addAll(ls2));
        System.out.println(ls2);
        System.out.println(cls2);

        System.out.println(cls2.containsAll(ls));
        System.out.println(cls2.containsAll(ls2));

        Set<String> emptySet=new HashSet<>();
        System.out.println(emptySet.isEmpty());

        System.out.println(cls2.hashCode());

        System.out.println(cls2.equals(ls2));

        Iterator<String> itr = cls2.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }

        String[] str=cls2.toArray(new String[cls2.size()]);
    }
}
