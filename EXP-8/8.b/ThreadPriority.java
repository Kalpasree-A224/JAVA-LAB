public class ThreadPriority {
    private static class Worker extends Thread {
        Worker(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName() + " has priority " + getPriority());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread low = new Worker("Low-priority worker");
        Thread high = new Worker("High-priority worker");
        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);
        low.start();
        high.start();
        low.join();
        high.join();
    }
}
