package Course1.Task011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*11. Напишите программу с тремя переменными целого типа.
Определить какое из них наибольшее.*/
public class Task011 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое целое число:");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе целое число:");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите третье целое число:");
        int c = Integer.parseInt(reader.readLine());

        maxNumber(a, b, c);
    }

    public static void maxNumber (int a, int b, int c) {
        if(a > b){
            System.out.println("Наибольшее число: " + (a > c ? a : c));
        } else {
            System.out.println("Наибольшее число: " + (b > c ? b : c));
        }
    }
}
