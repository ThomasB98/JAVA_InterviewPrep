package java_collections.Interfaces;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class interface_Queue {
    public static void main(String[] args) {
        Queue<String> que=new LinkedList<>();
        que.add("Thomas");
        que.add("Raju");
        que.add("Bansod");
        que.add("Suchita");

        Iterator<String> itr=que.iterator();
//        System.out.println(que.remove()+" item Removed");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(que.offer("Teresa"));
    }
}
