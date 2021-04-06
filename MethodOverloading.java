package MoreOnClasses;

public class MethodOverloading {
    public void doSomething() {
        System.out.println("MethodOverloading");
    }

    public static void main(String[] args) {
        System.out.println(args);
    }

    public void doSomething(String b) {
    }
}
class B {
public static void main(String[]args){
    MethodOverloading object = new MethodOverloading();
    object.doSomething("B");
        }
        }
