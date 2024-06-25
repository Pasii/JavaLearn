package threads;

public class DeamonThread extends Thread {

    public DeamonThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        if(Thread.currentThread().isDaemon()) {

            System.out.println(getName()+"is deamon thread");
        } else {
            System.out.println(getName()+"is user thread");
        }


    }

    public static void main(String[] args) {

        DeamonThread t1 = new DeamonThread("t1");
        DeamonThread t2 = new DeamonThread("t2");
        DeamonThread t3 = new DeamonThread("t3");

        //setting user thread t1 to Daemon
        t1.setDaemon(true);
        //starting first 2 threads
        t1.start();
        t2.start();

        //setting user thread t3 to Daemon
        t2.setDaemon(true);
        t3.start();



    }
}
