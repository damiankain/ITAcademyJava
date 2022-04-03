package Lesson007;

import java.util.ArrayList;
import java.util.LinkedList;

import static Lesson007.SomeObject.getSomeString;


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

    public static void genArraylist(int x) { // This method generate Arraylist
        Sekundomer.start();
        for (int i = 0; i < x; i++) {
            arrayList.add(new SomeObject(getSomeString()));
        }
        Sekundomer.finish();
        Sekundomer.result();
    }

    public static void removeFirstElementArrayList () { // Remove first element from ArrayList
        Sekundomer.start();
        arrayList.remove(arrayList.get(0));
        Sekundomer.finish();
        Sekundomer.result();
    }

    public static void genLinklist(int x) { // This method generate Linkedlist
        Sekundomer.start();
        for (int i = 0; i < x; i++) {
            linkList.add(new SomeObject(getSomeString()));
        }
        Sekundomer.finish();
        Sekundomer.result();
    }

    public static void removeFirstElementFromLinkedList () { // Remove first element from LinkedList
        Sekundomer.start();
        linkList.removeFirst();
        Sekundomer.finish();
        Sekundomer.result();
    }

}
