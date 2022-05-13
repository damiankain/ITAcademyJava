package multithreading.domain;

import multithreading.util.Utils;

public class CallCenter extends Thread{

    private static boolean isOpen = true;

    public static boolean isIsOpen() {
        return isOpen;
    }
    public static void setIsOpen(boolean isOpen) {
        CallCenter.isOpen = isOpen;
    }

    @Override
    public void run() {
        System.out.println("Callcentre is opened");
        Utils.createQueueOperators();
        Utils.createQueueUsers();
        if (Utils.getQueue().isEmpty()){
            CallCenter.setIsOpen(false);
            System.out.println("Callcentre is closed");
        }
    }

}