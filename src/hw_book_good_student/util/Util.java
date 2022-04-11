package hw_book_good_student.util;

import hw_book_good_student.domain.Book;
import hw_book_good_student.domain.Student;
import hw_book_good_student.domain.TitleLists;
import hw_book_good_student.domain.User;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Util implements TitleLists {
    //Constant to generate Linked List for task 1
    public static final int LISTSIZE20 = 20;

    //Constant to generate Linked List for task 3
    public static final int LISTSIZE25 = 25;

    //Constant to remove an element for task 1
    public static final int NUMBERREMOVEELEMENT = 7;
    //private static final Object User = gen;

    //Variable for generation
    public static int INDEXBOOK = 0;
    public static int INDEXUSER = 0;

    public static String authorName;
    public static String authorSurname;
    public static String authorPatronymic;

    //Method to generate book index from array
    public static int getRandomIndexBook() {
        INDEXBOOK = (int) Math.floor(Math.random() * (TITLELIST.length));
        return INDEXBOOK;
    }

    public static int getRandomIndex() {
        INDEXUSER = (int) Math.floor(Math.random() * (USERNAME.length));
        return INDEXUSER;
    }

    //The method returns a random book title from the list
    public static String getBookTitle() {
        getRandomIndexBook();
        return TITLELIST[INDEXBOOK];
    }

    //The method generates the corresponding author name for the book
    public static String getBookAuthorName() {
        return NAMEAUTHORLIST[INDEXBOOK];
    }

    //The method generates the corresponding author surname for the book
    public static String getBookAuthorSurname() {
        return SURNAMEAUTHORLIST[INDEXBOOK];
    }

    //The method generates the corresponding author patronymic for the book
    public static String getBookAuthorPatronymic() {
        return PATRONYMICAUTHORLIST[INDEXBOOK];
    }

    public static String getUserName() {
        getRandomIndex();
        return USERNAME[INDEXUSER];
    }

    public static String getUserSurname() {
        getRandomIndex();
        return USERSURNAME[INDEXUSER];
    }

    // ДОДЕЛАТЬ, НЕ РАБОТАЕТ
    /*public static List<User> generateFriendList(int i) {
        List <User> listOfUser = new ArrayList<>();
        if(i != 0) {
            for (int j = 0; j < i; j++) {
                listOfUser.add(new User());
            }return listOfUser;
        } else {


            return generateFriendList(i-1);
        }
    }*/


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
    public static List<Book> generateLinkedList(int LISTSIZE20) {
        List<Book> listOfBooks = new LinkedList<>();

        for (int i = 0; i < LISTSIZE20; i++) {
            Book book = new Book();
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    public static TreeSet<Student> generateTreeSetStudents(int count) {
        TreeSet<Student> listOfStudent = new TreeSet<>();

        for (int i = 1; i < count; i++) {
            listOfStudent.add(new Student(i));
        }
        return listOfStudent;
    }

    //This Method outputs a Linked List to the console
    public static void printBooksLinkedList(List<Book> list) {
        System.out.println(list);
    }

    public static void printBooksLinkedListStudents(TreeSet<Student> list) {
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

    //The method removes every even object
    public static void removeElementFromStudentList(TreeSet<Student> list) {
        int listSize = list.size();
        for (int i = 1; i <= listSize;i++) {
            if (i % 2 != 0) {
                list.remove(new Student(i));
            }
        }
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
            Book book = new Book("Без названия", "Без автора", "Без фамилии", "Без отчества");
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    //The method sorts the collection by the first name, last name or patronymic parameter
    public static void sort(List<Book> book, String value) {
        if (value == authorName) {
            Collections.sort(book, new Book.ComparatorAuthorName());
        }
        if (value == authorSurname) {
            Collections.sort(book, new Book.ComparatorAuthorSurname());
        }
        if (value == authorPatronymic) {
            Collections.sort(book, new Book.ComparatorAuthorPatronymic());
        }
    }

}
