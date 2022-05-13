package multithreading.util;

import multithreading.domain.Operator;
import multithreading.domain.User;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Utils {

    static int CAPACITY_QUEUE= 20;
    static int COUNT_OPERATORS = 4;
    static int COUNT_USERS = 30;

    public static BlockingQueue<User> queue = new LinkedBlockingQueue<>(CAPACITY_QUEUE);

    public static BlockingQueue<User> getQueue() {
        return queue;
    }
    public static void createQueueOperators () {
        for (int i = 1; i < COUNT_OPERATORS+1; i++) {
            new Thread(new Operator(i)).start();
        }
    }
    public static void createQueueUsers () {

        for (int i = 1; i < COUNT_USERS+1; i++) {
            try {
                queue.offer(new User(i), 300, TimeUnit.MILLISECONDS);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Oh my God, something wrong!");
            }
        }
    }
}