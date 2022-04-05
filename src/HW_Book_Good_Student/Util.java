package HW_Book_Good_Student;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Util implements TitleList{
    public static final int COUNT = 20;

    public static String getRandomTitle() {
        String[] title = TITLELIST;
        int index = (int) Math.floor(Math.random() * (TITLELIST.length));

        return title[index];
    }

    public static String getRandomString(int length){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < length; i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static List<Book> generateLL(int count) {
        List<Book> listOfBook = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            Book book = new Book();
            listOfBook.add(book);
        }
        return listOfBook;
    }

    public static void printBooksList(List<Book> list) {
        System.out.println(list);
    }
}
