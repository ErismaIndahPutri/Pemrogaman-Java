package ExceptionsListThreadsFiles;

import java.io.IOException;

public class Throw {
    public static void main(String[] args) {

    }

    public void Do(int x) throws IOException {
        if (x < 0) {
            throw new IOException();
        }
    }
}