# TP7 - Threads
In this practical session, we explored the concepts of multithreading and concurrency in Java. The exercise provided an opportunity to understand how threads operate, particularly through extending the Thread class or implementing the Runnable interface. Additionally, we examined the role of the synchronized keyword in managing conflicts that arise when multiple threads access and update shared resources.
## Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**
## Exercise 1
We developed a class named Talkative, which contains a static integer variable, number. This class implements the Runnable interface, requiring the implementation of the run method, which defines the behavior of the thread upon execution. The class is structured as follows:

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
                              }
In the main method, we created 10 instances of the Talkative class, each associated with a distinct number, and initialized them as separate threads:

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
However, upon execution, the output displayed the same number repeatedly for all threads, as shown below:
 ```
                                                Time1 87
                                                Time2 87
                                                Time3 87
                                                Time1 77
                                                Time1 27
                                                Time2 27
                                                Time1 97
                                                Time1 47
                                                Time1 7
                                                Time1 17
                                                Time1 57
                                                Time1 67
                                                Time2 67
                                                Time3 67
                                                Time1 37
                                                Time4 87
                                                Time2 77
                                                Time3 27
                                                Time2 97
                                                Time2 47
                                                Time2 7
                                                Time2 17
                                                Time2 57
                                                Time4 67
                                                Time2 37
                                                ...
```





This occurred because the number variable is static, meaning it is shared across all instances of the Talkative class. Each thread was modifying the same variable, leading to the observed behavior.
## Exercise 2
For the second exercise, we implemented a Sommeur class, designed to calculate the sum of elements within a specified range of an array. The class uses three attributes:
- int[] tab to store the array,
- int debut and int fin to define the range for summation,
- A static variable somme to store the cumulative result.
The Sommeur class is implemented as follows:
```
                                    public class Sommeur implements Runnable{
                                        private int[] tab;
                                        private int debut, fin;
                                        private static int somme;
                                        Sommeur(int[] tab, int debut, int fin){
                                             this.tab = tab;
                                             this.debut = debut;
                                             this.fin = fin;
                                        }
                                        @Override
                                        public void run() {
                                            for (int i = debut; i < fin; i++) {
                                                synchronized (Sommeur.class){
                                                    somme += tab[i];
                                                }
                                            }
                                        }
                                        public static int getSomme(){
                                            return Sommeur.somme;
                                        }
                                    }
```
In the main method, an array tab was initialized with sample values, and three threads of the Sommeur class were created to calculate sums for different parts of the array:
```
                                      public class Main {
                                          public static void main(String[] args) throws InterruptedException {
                                              int[] tab = {10,4,12,45,111,33,20,13,7,9,-1,4,-40,32,16,44,97,22,1,5,8,90,2};
                                              Thread thread1 = new Thread(new Sommeur(tab,0,10));
                                              Thread thread2 = new Thread(new Sommeur(tab,11,17));
                                              Thread thread3 = new Thread(new Sommeur(tab,18,23));
                                              thread1.start();
                                              thread2.start();
                                              thread3.start();

                                          }
                                      }
```
To ensure the threads complete their execution before printing the result, we used the join method:
```
                                              thread1.join();
                                              thread2.join();
                                              thread3.join();
                                            
```
Finally, the cumulative sum was printed:
```
                              System.out.println("the total sum is "+Sommeur.getSomme());
```
Output:
```
                                          the total sum is 523
```
This approach demonstrated the effective use of the synchronized keyword to handle shared resources across multiple threads.
