package hw_book_good_student.domain;

import java.util.Comparator;
import java.util.Objects;

import static hw_book_good_student.util.Util.*;


public class Book implements TitleLists, Comparable<Book> {
    private String title;
    private String authorName;
    private String authorSurname;
    private String authorPatronymic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    public Book() {
        this.title = getBookTitle();
        this.authorName = getBookAuthorName();
        this.authorSurname = getBookAuthorSurname();
        this.authorPatronymic = getBookAuthorPatronymic();
    }

    public Book(String title, String author, String authorSurname, String authorPatronymic) {
        this.title = title;
        this.authorName = author;
        this.authorSurname = authorSurname;
        this.authorPatronymic = authorPatronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title)
                && Objects.equals(authorName, book.authorName)
                && Objects.equals(authorSurname, book.authorSurname)
                && Objects.equals(authorPatronymic, book.authorPatronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
                authorName,
                authorSurname,
                authorPatronymic);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                '}' + "\n";
    }

    public static class ComparatorAuthorName implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorName().compareTo(o2.getAuthorName());
        }
    }

    public static class ComparatorAuthorSurname implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorSurname().compareTo(o2.getAuthorSurname());
        }
    }

    public static class ComparatorAuthorPatronymic implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic());
        }
    }

    @Override
    public int compareTo(Book book) {
        return Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthorName)
                .thenComparing(Book::getAuthorSurname)
                .thenComparing(Book::getAuthorPatronymic)
                .compare(this, book);
    }
}
