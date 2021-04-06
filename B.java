package ExceptionsListThreadsFiles;

    class B extends Thread {
        public void run() {
            System.out.println("Hello");
        }

        public static void main(String[] args) {
            ExceptionsListThreadsFiles.
                    B object = new B();
            object.start();
        }
    }
