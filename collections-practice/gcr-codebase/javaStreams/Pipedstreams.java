package javaStreams;

import java.io.*;

class WriterThread extends Thread {

    PipedOutputStream pos;

    WriterThread(PipedOutputStream p) {
        pos = p;
    }

    public void run() {

        try {

            pos.write("Hello From Thread".getBytes());
            pos.close();

        } catch (IOException e) {
        }
    }
}

class ReaderThread extends Thread {

    PipedInputStream pis;

    ReaderThread(PipedInputStream p) {
        pis = p;
    }

    public void run() {

        try {

            int ch;

            while ((ch = pis.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
        }
    }
}

public class Pipedstreams {

    public static void main(String[] args) throws Exception {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        new WriterThread(pos).start();
        new ReaderThread(pis).start();
    }
}
