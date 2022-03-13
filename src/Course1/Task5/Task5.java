package Course1.Task5;
/*5. Вывести на  экран все нечетные цифры от 1 до 15
(используйте остаток от деления)*/
public class Task5 {
    public static void main(String[] args) {
        for (int i = 0; i <16; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
