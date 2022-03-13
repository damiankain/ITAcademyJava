package Course1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
