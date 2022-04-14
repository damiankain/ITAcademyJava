package lesson010;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Clicker clicker = new Clicker();
        clicker.start();

        Thread.sleep(50);

        clicker.stopClicking();
        clicker.join();

        System.out.println("Finish!" + clicker.getClick());
    }
}
