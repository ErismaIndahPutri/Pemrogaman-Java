package MoreOnClasses;

public class AnonymousClasses1 {
    public void print() {
        System.out.println("A");
    }
}
class AnonymousClasses2 {
    public static void main(String[] args) {
        A object = new A();
        {
            System.out.println("Hello");
        }
    };
    }
