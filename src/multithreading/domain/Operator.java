package multithreading.domain;

import multithreading.util.Utils;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Operator implements Runnable {
    private final int operatorID;

    public int getOperatorID() {
        return operatorID;
    }

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
        return "Operator{" + "operator " + operatorID + '}';
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
        //Take an element from the queue within a certain timeout and remove it
        User user = Utils.getQueue().poll(50, TimeUnit.MILLISECONDS);
        if (user != null) { //If the queue is not empty then execute
            System.out.println("Operator " + getOperatorID() + " conversation with user " + user.getUserID());
        }

        Thread.sleep(500);
    }
}