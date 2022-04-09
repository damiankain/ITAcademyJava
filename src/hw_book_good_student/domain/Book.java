package hw_book_good_student.domain;

import java.util.Objects;

import static hw_book_good_student.util.Util.getBookTitle;


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
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorPatronymic = authorPatronymic;
    }
    public Book(String title, String author) {
        this.title = title;
        this.authorName = author;

    }

    @Override
    public String toString() {
        return "Book { "
                + title +
                ", authorName '" + authorName +
                "'" +
                '}' + "\n";
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
}
