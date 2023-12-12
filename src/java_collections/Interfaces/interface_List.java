package java_collections.Interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class interface_List {
    public static void main(String[] args) {
        List<String> li=new ArrayList<String>();
        li.add("thomas");
        li.add("raju");
        li.add("Bansod");

        System.out.println(li.get(0));

        System.out.println(li.contains("raju"));

        System.out.println(li.size());
        System.out.println(li.remove(0));
        System.out.println(li.indexOf("Bansod"));
        li.add(0,"thomas");

        ListIterator<String> itr=li.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
