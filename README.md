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
  ![Alt text]("E:\enset-logo (1)")

