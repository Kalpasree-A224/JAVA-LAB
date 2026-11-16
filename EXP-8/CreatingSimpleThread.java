public class CreatingSimpleThread {
    private static class MessageThread extends Thread {
        private final String message;

        MessageThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            for (int count = 1; count <= 3; count++) {
                System.out.println(message + " (" + count + ")");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread first = new MessageThread("First thread");
        Thread second = new MessageThread("Second thread");
        first.start();
        second.start();
        first.join();
        second.join();
    }
}
