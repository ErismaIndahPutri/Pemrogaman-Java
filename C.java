package ExceptionsListThreadsFiles;

    class C implements Runnable {
        @Override
        public void run() {
            System.out.println("Bye");
        }
    }
    class App {
        public static void main(String[] args) {
            Thread ob = new Thread(new C());
            ob.start();
        }
    }

