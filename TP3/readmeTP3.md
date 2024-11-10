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
