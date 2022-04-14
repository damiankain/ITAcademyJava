package hw_book_good_student;

import hw_book_good_student.domain.Book;
import hw_book_good_student.domain.Student;
import hw_book_good_student.domain.User;
import hw_book_good_student.util.Util;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************* Task 1 *******************");

        //Call to generate a list of 20 books
        List<Book> listOfBookLLTask1 = Util.generateLinkedList(Util.LISTSIZE20);
        Util.printBooksLinkedList(listOfBookLLTask1); //Print the list of books
        Util.removeElementFromLinkedList(listOfBookLLTask1); // remove the element #7
        Util.printBooksLinkedList(listOfBookLLTask1);//Print the list of books

        System.out.println("******************* Task 2 *******************");

        //The method generates a hash set of 25 elements, where 6 elements are identical
        HashSet<Book> listOfBookHS = Util.generateHashSet ();

        //This Method outputs a HashSet to the console
        Util.printBooksHashSet(listOfBookHS);

        //This method prints to the console only elements that begin with vowels.
        Util.printHashSetVowelslist(listOfBookHS);

        //This Method outputs a HashSet to the console
        Util.printBooksHashSet(listOfBookHS);

        System.out.println("******************* Task 3 *******************");

        List<Book> listOfBookLLTask3 = Util.generateLinkedList(Util.LISTSIZE25);

        //Sort the list of books by the parameter of the author's last name
        Util.sort(listOfBookLLTask3, Util.authorSurname);
        Util.printBooksLinkedList(listOfBookLLTask3);//Printing a list of books by author's name

        //Sort the list of books by the author's name parameter
        Util.sort(listOfBookLLTask3, Util.authorName);
        Util.printBooksLinkedList(listOfBookLLTask3); //Printing a list of books by author's last name

        //Sort the list of books by the parameter of the middle name of the author
        Util.sort(listOfBookLLTask3, Util.authorPatronymic);
        Util.printBooksLinkedList(listOfBookLLTask3);//Print the list of books by author's middle name

        System.out.println("******************* Task 4 *******************");

        //Generate a list of students
        TreeSet<Student> listOfStudent = Util.generateTreeSetStudents(20);
        Util.printBooksLinkedListStudents(listOfStudent);//Print the list of students

        //Remove every second student from the TreeSet
        Util.removeElementFromStudentList(listOfStudent);
        Util.printBooksLinkedListStudents(listOfStudent);//Print the list of students

        System.out.println("******************* Task 5 *******************");


       /* List<User> listOfUser = Util.generateFriendList();
        System.out.println(listOfUser);*/




    }
}
