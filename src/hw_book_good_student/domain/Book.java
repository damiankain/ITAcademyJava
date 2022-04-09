package hw_book_good_student.domain;

import hw_book_good_student.util.Util;

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


    public Book() {
        this.title = getBookTitle();
        this.authorName = getAuthorName();
        this.authorSurname = getAuthorSurname();
        this.authorPatronymic = getAuthorPatronymic();
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
    public int compareTo(Book book) {
        return title.compareTo(book.getTitle());
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
}
