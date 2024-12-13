public class Talkative implements Runnable{
    private int number;
    public Talkative(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Time"+(i+1)+" "+number);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Talkative(7));
        Thread thread2 = new Thread(new Talkative(17));
        Thread thread3 = new Thread(new Talkative(27));
        Thread thread4 = new Thread(new Talkative(37));
        Thread thread5 = new Thread(new Talkative(47));
        Thread thread6 = new Thread(new Talkative(57));
        Thread thread7 = new Thread(new Talkative(67));
        Thread thread8 = new Thread(new Talkative(77));
        Thread thread9 = new Thread(new Talkative(87));
        Thread thread10 = new Thread(new Talkative(97));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }
}
