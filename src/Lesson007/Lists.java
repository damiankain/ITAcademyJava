package Lesson007;

import java.util.ArrayList;
import java.util.LinkedList;


public class Lists {
    // Lists must be static to be visible inside a method
    static ArrayList<SomeObject> arrayList = new ArrayList<>();
    static LinkedList<SomeObject> linkList = new LinkedList<>();

    public static void main(String[] args) {

        genArraylist(10000000); // passing value to method
        removeFirstElementArrayList ();

        genLinklist (10000000); // passing value to method
        removeFirstElementFromLinkedList ();
    }

    private static void genArraylist(int x) { // This method generate Arraylist
        long start = System.currentTimeMillis();
        for (int i = 0; i < x; i++) {
            arrayList.add(new SomeObject());
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Create ArrayList takes " + result + " ms");


    }
    private static void removeFirstElementArrayList () { // Remove first element from ArrayList
        long start = System.currentTimeMillis();
        arrayList.remove(arrayList.get(0));
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Remove first element ArrayList " + result + " ms");

    }


    private static void genLinklist(int x) { // This method generate Linkedlist
        long start = System.currentTimeMillis();
        for (int i = 0; i < x; i++) {
            linkList.add(new SomeObject());
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Create LinkedList takes " + result + " ms");
    }

    private static void removeFirstElementFromLinkedList () { // Remove first element from LinkedList
        long start = System.currentTimeMillis();
        linkList.removeFirst();
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Remove first element ListList " + result + " ms");
    }

}
