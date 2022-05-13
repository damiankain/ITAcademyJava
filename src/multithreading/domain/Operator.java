package multithreading.domain;

import multithreading.util.Utils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Operator implements Runnable{
    private int operatorID;

    public Operator(int operatorID) {
        System.out.println("Operator " + operatorID + " waiting call");
        this.operatorID = operatorID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return operatorID == operator.operatorID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatorID);
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operator " + operatorID +
                '}';
    }

    @Override
    public void run() {
        while (CallCenter.isIsOpen()) {
            try {
                conversationUserFromQueue();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private void conversationUserFromQueue() throws InterruptedException {
        User user = Utils.getQueue().poll(200, TimeUnit.MILLISECONDS);
        if (user != null) {
            System.out.println("Operator " + operatorID + " conversation with user " + User.getUserID());
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(100);

    }
}