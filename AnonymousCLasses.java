package MoreOnClasses;

public abstract class AnonymousCLasses {
    public static <AnonymousCLassesm> void main(String[] args) {
        AnonymousCLasses m = new AnonymousCLasses() {
            @Override
            public void start() {
                System.out.println("Hi");
            }
        };
    }

    public abstract void start();
}



