package hw_book_good_student.util;


import hw_book_good_student.domain.Book;
import hw_book_good_student.domain.TitleLists;

import java.util.*;

public class Util implements TitleLists {
    //Constant to generate Linked List
    public static final int LISTSIZE = 20;

    //Constant to remove an element
    public static final int NUMBERREMOVEELEMENT = 7;

    //The method returns a random book title from the list
    public static String getBookTitle() {
        int index = (int) Math.floor(Math.random() * (TITLELIST.length));

        return TITLELIST[index];
    }

    //The method returns a random string according to the specified number of characters
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = new Random().nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    //This Method generates a Linked List
    public static List<Book> generateLinkedList(int LISTSIZE) {
        List<Book> listOfBooks = new LinkedList<>();

        for (int i = 0; i < LISTSIZE; i++) {
            Book book = new Book();
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    //This Method outputs a Linked List to the console
    public static void printBooksLinkedList(List<Book> list) {
        System.out.println(list);
    }

    //This Method outputs a HashSet to the console
    public static void printBooksHashSet(Set<Book> set) {
        System.out.println(set);
    }

    //This method removes an element from the linked list
    public static void removeElementFromLinkedList(List<Book> list) {
        list.remove(NUMBERREMOVEELEMENT);
    }

    //This method prints to the console only elements that begin with vowels.
    public static void printHashSetconsonantlist(Set<Book> set) {
        String s = "БВГДЖЗКЛМНПРСТФХЦЧШЩЬЪ"; //A set of letters in a string for comparison
        for (int i = 0; i < s.length(); i++) { //cycle equal to the length of the string with a set of letters
            int k = s.indexOf(s.charAt(i)); //Get the index of a character in a string
            //Removing elements starting with consonants
            set.removeIf(element -> element.getTitle().charAt(0) == s.toUpperCase().charAt(k));
        }
        System.out.println(set);
    }

    //The method generates a hash set of 25 elements, where 6 elements are identical
    public static HashSet<Book> generateHashSet() {
        HashSet<Book> listOfBooks = new HashSet<>();
        for (int i = 0; i < 19; i++) {
            Book book = new Book();
            listOfBooks.add(book);
        }

        for (int i = 0; i < 6; i++) {
            Book book = new Book("Без названия", "Без автора");
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    public static <Book> void sort(Book[] book) {
        Arrays.sort(book);
    }
}
