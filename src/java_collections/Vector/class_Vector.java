package java_collections.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class class_Vector {
    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);

        System.out.println(vec);
        vec.remove(4);
        System.out.println(vec.get(2));

        System.out.println(vec.contains(3));

        System.out.println("useing Enumeration");

        Enumeration<Integer> enm=vec.elements();

        while (enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}
