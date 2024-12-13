public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] tab = {10,4,12,45,111,33,20,13,7,9,-1,4,-40,32,16,44,97,22,1,5,8,90,2};
        Thread thread1 = new Thread(new Sommeur(tab,0,10));
        Thread thread2 = new Thread(new Sommeur(tab,11,17));
        Thread thread3 = new Thread(new Sommeur(tab,18,23));
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("the total sum is "+Sommeur.getSomme());
    }
}