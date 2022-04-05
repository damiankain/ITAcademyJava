package HW_Book_Good_Student;

import java.util.List;

import static HW_Book_Good_Student.Util.generateLL;



public class Main {
    public static void main(String[] args) {
        List <Book> list = generateLL(Util.COUNT);

        Util.printBooksList(list);
    }
}
