# TP3 - Exception Handling
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">Overview</a>
      <ul>
        <li><a href="#built-with">Technologies Used</a></li>
      </ul>
    </li>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Exercise 1 </a></li>
        <li><a href="#built-with">Exercise 2 </a></li>
        <li><a href="#built-with">Exercise 3 </a></li>
        <li><a href="#built-with">Exercise 4 </a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Implementation</a>
      <ul>
        <li><a href="#prerequisites">Screenshots</a></li>
      </ul>
    </li>
   
    
  </ol>
</details>

## Overview
The goal of these exercises is to learn how to create and handle custom exceptions in Java to improve error management and program reliability. By defining specific exceptions for different error cases—such as exceeding a speed limit, attempting an invalid square root, or entering an out-of-range grade—these exercises show how to address particular issues in a program’s logic. This approach allows developers to provide clear, targeted error messages and enables structured error handling, which enhances code clarity and robustness.

### Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**
## About The Project
### Exercise 1: TropViteException
Create a TropViteException that triggers when a vehicle's speed exceeds 90. The Vehicule class tests this by calling testVitesse(), which throws the exception if the speed is too high, illustrating how to manage limits with custom exceptions.
### Exercise 2: RacineCarreeException
Define a RacineCarreeException to handle cases where a square root calculation is attempted on a negative number. The Calculateur class includes a testRacineCarree() method that throws the exception for invalid inputs, showing error management in mathematical operations.
### Exercise 3: RacineCarreeException
Implement a NoteInvalideException to catch out-of-range grades in a grading system. The Evaluateur class has a verifierNote() method that throws the exception if a grade falls outside 0-20, demonstrating error handling for input validation.
## Implementation
  ### ScreenShots
   #### 1 - Exercise 1
   This Exercise 1 illustrates exception handling by checking if a vehicle's speed exceeds 90 km/h. We define a 
   TropViteException class, a custom exception class that inherits from Exception, with a constructor that takes an 
   integer. When this exception is thrown, it generates a message indicating it is a TropViteException.
   
                       public class TropViteException extends Exception{
                        public TropViteException(int number){
                           super("C'est une exception de type TropViteException. Vitesse en cause : " +number);
                        }
                    }

  And a Vehicule class that includes an empty constructor and a method that throws TropViteException if the speed exceeds 
  90 km/h.

                          public class Vehicule {
                            public Vehicule(){
                        
                            }
                            public static void testVitesse(int number) throws TropViteException {
                                if (number > 90) throw new TropViteException(number);
                        
                            }
                        
                            public static void main(String[] args) throws TropViteException {
                                Vehicule vehicule = new Vehicule();
                                testVitesse(20);
                                testVitesse(100);
                            }
                        }

![image](https://github.com/user-attachments/assets/522e03ec-17de-45cf-bbf8-bb833379ebd7)

#### 2 - Exercise 2
In this exercise, a custom exception is used to check if an integer is negative before calculating its square root. If the integer is negative, the program throws a RacineCarreeException.
                            public class RacineCarreeException extends Exception{
                                public RacineCarreeException(int number){
                                    super("C'est une exception de type RacineCarreeException. Nombre négatif : " + number);
                                }
                            }

We have a custom exception class RacineCarreeException that inherits from Exception. When an exception is thrown with this class, it generates a message like: “This is a RacineCarreeException. Negative number: -5” in this case. Additionally, there is a Calculateur class with a testRacineCarree(int number) method. If number is less than 0, this method throws a RacineCarreeException and includes throws RacineCarreeException in its signature, as it does not handle the exception itself.
                                public class Calculateur {
                                    public Calculateur(){
                                
                                    }
                                    public static void testRacineCarree(int number) throws RacineCarreeException {
                                        if (number < 0) throw new RacineCarreeException(number);
                                    }
                                
                                    public static void main(String[] args) {
                                
                                            Calculateur calculateur = new Calculateur();
                                        try {
                                            testRacineCarree(-5);
                                            testRacineCarree(25);
                                        } catch (RacineCarreeException e) {
                                            System.out.println("Détectée erreurs : " + e.getMessage());
                                        }
                                
                                    }
                                }

In the main method, a try-catch block is used to catch the exception during calls to testRacineCarree. After calling testRacineCarree with -5 as the parameter, this method throws the exception, and execution moves directly to the catch block, which captures the exception and displays an error message.
![image](https://github.com/user-attachments/assets/53920aa6-bca7-49f5-a5f4-baf6305152f1)

#### 3 - Exercise 3
The goal of this exercise is the same: to customize exceptions. The NoteValideException is used to capture cases where a grade is outside the allowed range (0 to 20).
                                public class NoteInvalideException extends Exception{
                                    public NoteInvalideException(int number){
                                        super("Exception de type NoteInvalideException. Note invalide : " + number);
                                    }
                                }

We have an Evaluateur class that contains a method verifierNote. This method checks if the grade is outside the 0 to 20 range. If it is, it throws a NoteInvalideException to indicate that the grade is invalid. In the main method, two calls to verifierNote are made, with one call triggering the exception because -1 is outside the allowed range of 0 to 20.
                                            public class Evaluateur {
                                                public Evaluateur(){
                                            
                                                }
                                                public static void verifierNote(int number) throws NoteInvalideException {
                                                    if (number<0 || number>20) throw new NoteInvalideException(number);
                                                }
                                            
                                                public static void main(String[] args) {
                                                    Evaluateur evaluateur = new Evaluateur();
                                                    try {
                                                        verifierNote(-1);
                                                        verifierNote(16);
                                                    }catch (NoteInvalideException e){
                                                        e.getMessage();
                                                    }
                                                }
                                            }

The exceptions thrown are captured in the catch block, which calls e.getMessage() to retrieve the error message. This allows the program to display the specific message associated with the exception.
