class table {
    public void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(n + "*i:: " + n * i);
            }
            System.out.println(this);
        }
    }
}

class mythread extends Thread {
    private int x = 0;
    table t = new table();

    mythread(int n) {
        x = n;
    }

    public void run() {
        t.printTable(x);
    }
}

class test {
    public static void main(String[] args) {
        mythread t1 = new mythread(50);
        mythread t2 = new mythread(25);
        t1.start();
        t2.start();

    }
}