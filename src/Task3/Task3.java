package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
