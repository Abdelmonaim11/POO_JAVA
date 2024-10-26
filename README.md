# TP1 : Arrays and strings
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

This project centers on implementing arrays and strings in Java. It includes multiple exercises that showcase methods for handling student grades, conjugating French verbs, manipulating strings, and counting letter occurrences. The exercises aim to build a strong foundation in fundamental programming concepts. Additionally, they encourage problem-solving skills by tackling common tasks through array and string manipulation.


### Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**

## About The Project

### Exercise 1
In this exercise, you’ll develop a Java program that lets users enter student grades, sort them, and generate useful statistics. These include calculating the average grade, identifying the highest and lowest grades, and counting how many students received a particular grade.
##### Arrays.sort():
The program starts by asking the user to enter the number of students along with each of their grades.
Then, it utilizes the Arrays.sort() method to arrange the grades in ascending order, displaying the sorted list.
### Exercise 2
The Conjugaison class in this Java program is designed to conjugate first-group French verbs ending in "-er" in the present tense. It begins by taking a verb as input and includes arrays for pronouns (such as "Je" and "Tu") and verb endings (like "e" and "es"). The conjuger method checks for spelling changes required for certain verbs, including those ending in "-ger," "-cer," "-yer," "-eler," and "-eter." For example, "-ger" verbs add an "e" before "ons" for the "Nous" form, while "-cer" verbs change "c" to "ç" for the same pronoun. Verbs ending in "-yer" modify "y" to "i" for some pronouns, and those ending in "-eler" and "-eter" may double letters in the stem for most pronouns. If a verb doesn’t belong to the first group, the program notifies the user, ensuring accurate conjugations based on French language rules.
### Exercise 3
The Menu class is a simple Java program that provides a text-based menu system for working with a string (chaine). Depending on the user’s choice, the program allows several options:

- Add a String: Prompts the user to enter a string, which it appends to chaine.
- Display the String: Shows the current content of chaine, or notifies if it's empty.
- Reverse the String: Reverses and displays chaine, or alerts if it's empty.
- Count Words: Counts and displays the number of words in chaine.
- Clear String (Choice 0): Resets chaine to empty.
After each action, the program waits for user input before returning to the main menu, facilitating an interactive experience with string manipulation options.
### Exercise 4
In this final exercise, the program determines how many times each letter appears in the input string. To ensure consistency, it converts the string to lowercase before counting.
- Counting Letters
The program loops through the string, incrementing a counter for each letter found.
- Displaying Results
Once the counting is complete, the program displays the occurrence count for each letter that appears in the string.
## Implementation
  ### ScreenShots
  ##### 1 - Exercise 1:
![image](https://github.com/user-attachments/assets/5b85c20a-6fc9-4133-9e56-9307f6498bda)  ![image](https://github.com/user-attachments/assets/8d5c2279-6ef7-47ae-9bcc-7af0a34b287d)
This image illustrates a program displaying the results of 10 sorted students. It determines the average grade of the class, which is 13.685, as well as the maximum and minimum grades, respectively 19.0 and 9.0. Subsequently, the user entered the grade 17 to determine the number of students who received that grade. The program revealed that only 2 students achieved it.
  ##### 2 - Exercise 2:
  If we input the verb **manger**, we get:
  ![image](https://github.com/user-attachments/assets/755dae2d-906b-4594-b699-0a116e8e9ef6)
  If we input the verb **placer**, we get:
  ![image](https://github.com/user-attachments/assets/2da7cd55-fd7a-4b75-9215-77773e72c5df)
  And for the verb **balayer**, we get:
  ![image](https://github.com/user-attachments/assets/d6a57df9-c46c-496e-a5b8-58eeba9c84fb)
  But if we take the verb **aller**, even though it ends with **er**, it is not a verb of **1er group**.
  ![image](https://github.com/user-attachments/assets/a38e415c-61ca-4d6d-a768-1c1db5140d4f)
   ##### 3 - Exercise 3:
   - Program startup: The program displays the menu with options 1 to 4 and 0 to exit.
   ![image](https://github.com/user-attachments/assets/6a6dfa3e-7ee9-454f-8502-308cab6696ac)
   - Option 1 - Enter a string:
     "Java est un langage de programmation orienté objet, conçu pour être portable"
   - Option 2 - Display the string:
   ![image](https://github.com/user-attachments/assets/a4cd623d-d18f-4c2a-b4cd-2f2883316dc2)
   - Option 3 - Reverse the string:
   ![image](https://github.com/user-attachments/assets/6c16826c-a557-4dfb-b9b3-00fe08fe71ca)
   - Option 4 - Count the words:
   ![image](https://github.com/user-attachments/assets/19ce9112-3dbe-4cc8-a66a-ee35a6318df9)
   Option 0 - Reset the string and restart:
   ![image](https://github.com/user-attachments/assets/96b198fc-43e7-474a-aa79-fe1e836e27b2)







