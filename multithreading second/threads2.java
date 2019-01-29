import java.io.*;

class printTable extends Thread {
    public int n = 0;

    printTable(int x) {
        n = x;
    }

    public void run() {
        try {

            for (int i = 0; i <= 100; i++) {
                System.out.println("table of " + n + " :: " + (n * i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void start2(int x) {
        n = x;
        start();

    }

    public int ab() {
        return activeCount();
    }

}

class threads2 {

    public static void main(String[] args) throws IOException {
        printTable p1 = new printTable(4);
        p1.start2(9);
        printTable p2 = new printTable(5);
        p2.start2(12);
        System.out.println(p1.ab());
        ;
    }
}