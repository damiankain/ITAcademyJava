package multithreading.domain;

import multithreading.util.Utils;

public class CallCenter extends Thread {

    private static boolean isOpen = true; //Variable for specifying the call center working hours

    public static boolean isIsOpen() {
        return isOpen;
    }
    public static void setIsOpen(boolean isOpen) {
        CallCenter.isOpen = isOpen;
    }
    @Override
    public void run() {
        System.out.println("Callcentre is opened"); //Call center start message
        Utils.createThreadOperators(); //Creating Operator Threads
        Utils.createQueueUsers(); //Create and add users to the queue
        if (Utils.getQueue().isEmpty()) { //If the customer queue is empty, the call center exits
            CallCenter.setIsOpen(false); //Change the running time variable to false
            System.out.println("Callcentre is closed"); //Call center end message
        }
    }

}