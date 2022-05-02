package streams.Thread;

class SomeThread extends Thread {

    public void run () {
        for ( int i = 0; i < 10; i++)
            System.out.println("Number - " + i);
    }
}

public class Main {
    public static void main(String[] args) {
        SomeThread test = new SomeThread();
        test.start(); // .run() - запустит синхронно .start() многопоточно

        SomeThread test1 = new SomeThread();
        test1.start();
        //потоки можно создавать без дополнительного класса
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for ( int i = 0; i < 10; i++)
                    System.out.println("Number - " + i);
            }
        });
        t1.start();
    }
}
