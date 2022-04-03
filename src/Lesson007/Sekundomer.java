package Lesson007;

public class Sekundomer {

    private static long start;
    private static long finish;
    private static long result;

    public static void start() {
        start =  System.currentTimeMillis();
    }

    public static void finish() {
        finish = System.currentTimeMillis();
    }

    public static void result() {
        result = finish - start;
        System.out.println("Create ArrayList takes " + result + " ms");
    }
}
