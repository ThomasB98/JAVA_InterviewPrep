package LinkList;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class singlyLinkList {
    Scanner sc=new Scanner(System.in);
    private node head;

    private node tail;
    private node temp;
    private int size;
    private node prenode;
    private node nextnode;
    singlyLinkList(){
        this.size=0;
    }

    public void get_size(){
        System.out.println(size);
    }

    public void ciruclarToSingle(){
        if (head==null){
            System.out.println("original LinkedList is empty");
        } else if (tail.next==null) {
            System.out.println("Not a Circular Linked List");
        } else {
            tail.next=null;
            Display();
        }
    }

    public void singleLlToCircular() {
        if (head==null){
            System.out.println("original LinkedList is empty");
        }
        else{
            temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            tail=temp;
            temp.next=head;
            System.out.println("last element next point to "+temp.next);
            System.out.println("first element add "+head);
            if (temp.next==head){
                System.out.println("circular Linked-list");
            }
            temp=head;
            do {
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while (temp!=head);
            System.out.print(head.value);

        }
    }

    public void SortZeroOnesTwos(){
        head=null;
        size=0;
        insert_first(0);
        inser_last(1);
        inser_last(2);
        inser_last(0);
        inser_last(1);
        inser_last(2);
        inser_last(0);
        inser_last(0);
        System.out.println("original Linked list");
        Display();

        System.out.println("linked list after sorting");
        node temp1=head;
        int [] arr={0,0,0};
        while (temp1.next!=null){
            arr[temp1.value]++;
            temp1=temp1.next;
        }
        head=null;
        size=0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                inser_last(i);
                arr[i]--;
            }
        }

        System.out.println("Sorted LinkedList:");
        Display();
    }
    public void middleValue(){
        int midd=size/2;
        temp=head;
        for (int i=0;i<midd;i++){
            temp=temp.next;
        }
        System.out.println("Middle value is "+temp.value);
    }

    public void pairSwap(){
        if (head==null){
            System.out.println("Empty LinkedList");
        }else {
            temp=head;
            while(temp!=null & temp.next!=null){
                int v=temp.value;
                temp.value=temp.next.value;
                temp.next.value=v;
                temp=temp.next.next;
            }
            Display();
        }
    }
    public void findUnique(){
        if (head==null){
            System.out.println("Linked List is Empty");
        }
        else {
            HashSet<Integer> uniqueValues=new HashSet<>();
            while (temp!=null){
                uniqueValues.add(temp.value);
                temp=temp.next;
            }
            System.out.println(uniqueValues);
        }
    }

    public void findDublicates(){
        if(head==null){
            System.out.println("Linked List is Empty");
        }
        else {
            HashSet<Integer> uniqueValues=new HashSet<>();
            temp=head;
            Vector<Integer> vec=new Vector<>();
            while (temp!=null){
                if (uniqueValues.contains(temp.value)){
                    vec.add(temp.value);
                }
                else {
                    uniqueValues.add(temp.value);
                }
                temp=temp.next;
            }
            if (vec.isEmpty()){
                System.out.println("no Duplicates found");
            }else {
                System.out.println("Duplicates");
                System.out.println(vec);
            }
        }
    }

    public void reverseLinkedList(){
        nextnode=null;
        temp=head;
        prenode=null;
        tail=head;
        while (temp!=null){
            nextnode=temp.next;
            temp.next=prenode;
            prenode=temp;
            temp=nextnode;
        }
        head=prenode;
    }

    public void findElement(int value){
        temp=head;
        for (int i=0;i<size;i++){
            if(temp.value==value){
                System.out.println("value found");
                System.out.println("at position "+i);
                return;
            }
            temp=temp.next;
        }
        System.out.println("value not available");
    }

    public void Display(){
        if (head==null){
            System.out.println("LinkedList is empty");
        }else {
            temp=head;
            while (temp!=null){
                System.out.print(temp.value+" ->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }

    }

    public void delete_last(){
        if (head==null){
            System.out.println("LinkedList is empty");
        }
        if(size==1){
            delete_first();
        }
        temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public void delete_first(){
        if (head==null){
            System.out.println("LinkedList is empty");
        }
        else {
            head=head.next;
            size--;
        }
    }

    public void deleteAtPosition(int index){
        if(index==size-1){
            delete_last();
            return;
        }
        else if (index==0){
            delete_first();
            return;
        }
        else {
            prenode=null;
            temp=head;
            for(int i=0;i<index;i++){
                if(prenode==null){
                    prenode=head;
                }
                else {
                    prenode=prenode.next;
                }
                temp=temp.next;
            }
            prenode.next=temp.next;
            size--;
        }

    }

    public void inser_last(int value){
        if(head==null){
            insert_first(value);
        }
        else {
            node newnode=new node(value);
            temp=head;
            for (int i=1;i<size;i++){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=null;
            tail=newnode;
            size++;
        }
    }

    public void insert_first(int value){
        if (head==null){
            node newnode=new node(value);
            newnode.next=null;
            head=newnode;
            tail=head;
            size++;
        }else {
            node newnode=new node(value);
            newnode.next=head;
            head=newnode;
            size++;
        }
    }

    public void insert(int value,int index){
        if (index>size+1){
            System.out.println("input valid postiton");
        }
        else {
            if (head==null){
                node newnode=new node(value);
                newnode.next=null;
                head=newnode;
                tail=newnode;
                size++;
            }
            else{
                node newnode=new node(value);
                temp=head;
                for (int i=1;i<index;i++){
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
                size++;
                if (tail==head){
                    temp=head;
                    while (temp!=null){
                        temp=temp.next;
                        tail=temp;
                    }
                }
            }
        }


    }

    private class node{
        private int value;
        private node next;

        public node(int value){
            this.value=value;
            this.next=null;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }
}
