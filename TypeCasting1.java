package MoreOnClasses;

public class TypeCasting1 {
    public void print() {
        System.out.println("A");
    }
}
class b extends TypeCasting1 {
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        TypeCasting1 object = new b();
        b b = (b) object;
    }
}
