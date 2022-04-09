package hw_book_good_student;

import hw_book_good_student.domain.Book;
import hw_book_good_student.util.Util;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("******************* Task 1 *******************");
        //List<Book> listOfBookLLTask1 = Util.generateLinkedList(Util.LISTSIZE20);
        //Util.printBooksLinkedList(listOfBookLL);
        //Util.removeElementFromLinkedList(listOfBookLL); // remove the element #7
        //Util.printBooksLinkedList(listOfBookLL);

        System.out.println("******************* Task 2 *******************");
        //The method generates a hash set of 25 elements, where 6 elements are identical
        //HashSet<Book> listOfBookHS = Util.generateHashSet ();

        ////This Method outputs a HashSet to the console
        //Util.printBooksHashSet(listOfBookHS);
        //
        //This method prints to the console only elements that begin with vowels.
        //Util.printHashSetconsonantlist(listOfBookHS);
        System.out.println("******************* Task 3 *******************");
        List<Book> listOfBookLLTask3 = Util.generateLinkedList(Util.LISTSIZE25);

        Util.sortAuthorSurname(listOfBookLLTask3);
        Util.printBooksLinkedList(listOfBookLLTask3);

        Util.sortAuthorName(listOfBookLLTask3);
        Util.printBooksLinkedList(listOfBookLLTask3);

        Util.sortAuthorPatronymic(listOfBookLLTask3);
        Util.printBooksLinkedList(listOfBookLLTask3);

    }
}
