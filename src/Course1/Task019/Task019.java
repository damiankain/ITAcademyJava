package Course1.Task019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2.	Напишите программу, которая будет считать количество часов,
минут и секунд в n-ном количестве суток.
 */
public class Task019 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите необходимое количество суток:");

        int seconds = 60 * 60 * 24;
        int minutes = 60 * 24;
        int hours = 24;

        int day = Integer.parseInt(reader.readLine());

        System.out.println("Это равняется:");
        System.out.println(day * hours + " часов.");
        System.out.println(day * minutes + " минут.");
        System.out.println(day * seconds + " секунд.");
    }
}
