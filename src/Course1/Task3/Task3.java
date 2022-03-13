package Course1.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*3. Напишите метод, который будет проверять является ли число
палиндромом (одинаково читающееся в обоих направлениях).*/

public class Task3 {
    public static void main(String[] args) throws IOException {
       checkPalindrom();

    }

    public static void checkPalindrom() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = reader.readLine();
        String secondLine = new StringBuilder(firstLine).reverse().toString();

        if (secondLine.equals(firstLine)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

    }
}
