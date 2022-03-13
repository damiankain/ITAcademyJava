package Course1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
что сила тяжести равна 16% от силы тяжести на Земле. */

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свой вес:");

        double myWeight = Double.parseDouble(reader.readLine());
        double weightOnMoon = myWeight * 0.16;

        System.out.println("Ваш вес на Луне:");
        System.out.println(weightOnMoon);
        }
}
