package ExceptionsListThreadsFiles;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SortingList1 {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
