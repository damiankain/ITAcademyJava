package multithreading;

import multithreading.domain.CallCenter;

public class Main {
    public static void main(String[] args) {
        //Create a call center as a thread and run
        CallCenter callCenter = new CallCenter();
        callCenter.start();
    }
}
