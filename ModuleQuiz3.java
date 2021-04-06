package ExceptionsListThreadsFiles;

import java.util.concurrent.RunnableFuture;

public class ModuleQuiz3 {
    static class B implements Runnable {
        @Override
        public void run() {
            System.out.println("B");
        }
    }
    static class A extends Thread {
        @Override
        public void run() {
            super.run();
            System.out.println("A");
            Thread t = new Thread(new B());
            t.start();
        }

        public static void main(String[] args) {
            A object = new A();
            object.start();
        }
    }
}
