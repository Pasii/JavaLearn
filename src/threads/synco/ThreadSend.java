package threads.synco;

public class ThreadSend extends Thread {

    private String message;
    Sender sender;

    ThreadSend(String m, Sender obj) {
        message = m;
        sender = obj;
    }

    public void run() {

        //only one thread can send a message at a time
        synchronized (sender) {
            sender.send(message);
        }
    }
}


