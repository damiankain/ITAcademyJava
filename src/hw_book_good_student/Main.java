package hw_book_good_student;

import hw_book_good_student.domain.Book;
import hw_book_good_student.util.Util;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> listOfBookLL = Util.generateLinkedList(Util.LISTSIZE);
        Util.printBooksLinkedList(listOfBookLL);
        Util.removeElementFromLinkedList(listOfBookLL); // remove the element #7
        Util.printBooksLinkedList(listOfBookLL);


        //The method generates a hash set of 25 elements, where 6 elements are identical
        HashSet<Book> listOfBookHS = Util.generateHashSet ();

        ////This Method outputs a HashSet to the console
        Util.printBooksHashSet(listOfBookHS);
        //
        //This method prints to the console only elements that begin with vowels.
        Util.printHashSetconsonantlist(listOfBookHS);


        //sort(book);
    }
}
