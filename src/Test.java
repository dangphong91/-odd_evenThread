public class Test {
    public static void main(String[] args) {
        Thread odd = new OddThread();
        Thread even = new EvenThread();
        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        even.start();
    }
}
