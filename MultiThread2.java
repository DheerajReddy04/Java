class MultiThread2 implements Runnable {
    public void run() {
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        MultiThread2 m1 = new MultiThread2();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}