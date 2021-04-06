package ExceptionsListThreadsFiles;

import java.util.HashMap;

public class A {
    public static void main(String[] args) {
        HashMap <String, String> list = new HashMap<String, String>();
        list.put("A", "First");
        list.put("B", "Second");
        list.put("C", "Third");
        System.out.println(list.get("B"));
    }
}
