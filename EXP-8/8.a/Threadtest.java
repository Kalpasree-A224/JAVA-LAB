public class Threadtest {
    private static class Counter extends Thread {
        private final String label;

        Counter(String label) {
            this.label = label;
        }

        @Override
        public void run() {
            for (int value = 1; value <= 5; value++) {
                System.out.println(label + ": " + value);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread alpha = new Counter("Alpha");
        Thread beta = new Counter("Beta");
        alpha.start();
        beta.start();
        alpha.join();
        beta.join();
    }
}
