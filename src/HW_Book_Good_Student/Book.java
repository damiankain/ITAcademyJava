package HW_Book_Good_Student;


import static HW_Book_Good_Student.Util.getRandomTitle;


public class Book implements TitleList{
    private String title;
    private String author;
    private String authorName;
    private String authorSoname;
    private String authorPatronymic;


    @Override
    public String toString() {
        return "Book { "
                + title +
                ", author '" + author +
                '}'+ "\n";
    }

    public Book() {
        this.title = getRandomTitle();
        this.author = "автор";
    }


}
