class BMSThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CSEThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating and starting the first thread
        BMSThread bmsThread = new BMSThread();
        bmsThread.start();

        // Creating and starting the second thread
        CSEThread cseThread = new CSEThread();
        cseThread.start();
    }
}