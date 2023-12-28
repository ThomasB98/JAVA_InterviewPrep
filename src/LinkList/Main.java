package LinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        singlyLinkList ll=new singlyLinkList();
        int cont=0;

        while (cont==0){
            System.out.println(" ");
            System.out.println("0.Exit");
            System.out.println("1.Insert at first");
            System.out.println("2.Insert at last");
            System.out.println("3.Insert at index");
            System.out.println("4.Display LinkedList");
            System.out.println("5.Delete Last Element");
            System.out.println("6.Delete Last Element");
            System.out.println("7.Delete Element at Position");
            System.out.println("8.LinkedList Size");
            System.out.println("9.Find Element");
            System.out.println("10.Revers LinkedList");
            System.out.println("11.Find Duplicates");
            System.out.println("12.Find Unique Elements");
            System.out.println("13.Middle value of LinkedList");
            System.out.println("14.SingleLinkedList to circularLinkedList");
            System.out.println("15.circularLinkedList to SingleLinkedList");
            System.out.println("16.Pair Swap");
            System.out.println("17.Sort a linked list of 0s, 1s and 2s");
            int choice = sc.nextInt();
            switch (choice){
                case 0:
                    cont=1;
                    break;

                case 1:
                    System.out.println("Input value");
                    int value=sc.nextInt();
                    ll.insert_first(value);
                    break;

                case 2:
                    System.out.println("Input value");
                    int value1=sc.nextInt();
                    ll.inser_last(value1);
                    break;

                case 3:
                    System.out.println("Input value");
                    int value3=sc.nextInt();
                    System.out.println("input index");
                    int pos=sc.nextInt();
                    ll.insert(value3,pos);
                    break;

                case 4:
                    ll.Display();
                    break;

                case 5:
                    ll.delete_first();
                    break;

                case 6:
                    ll.delete_last();
                    break;

                case 7:
                    System.out.println("Input Index(start from 0)");
                    int position=sc.nextInt();
                    ll.deleteAtPosition(position);
                    break;

                case 8:
                    ll.get_size();
                    break;

                case 9:
                    System.out.println("Input value to find");
                    int value5=sc.nextInt();
                    ll.findElement(value5);
                    break;

                case 10:
                    ll.reverseLinkedList();
                    ll.Display();
                    break;

                case 11:
                    ll.findDublicates();
                    break;

                case 12:
                    ll.findUnique();
                    break;

                case 13:
                    ll.middleValue();
                    break;

                case 14:
                    ll.singleLlToCircular();
                    System.out.println("To use other option first convert circular linked-list to single linked-list");
                    System.out.println("select option 15 in case of exit select 0");
                    break;

                case 15:
                    ll.ciruclarToSingle();
                    break;

                case 16:
                    ll.pairSwap();
                    break;

                case 17:
                    ll.SortZeroOnesTwos();
                    break;

                default:
                    System.out.println("input correct option");
            }
        }
    }
}
