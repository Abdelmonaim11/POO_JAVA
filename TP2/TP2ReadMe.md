# TP2 - Concepts POO
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
This project focuses on key OOP principles in Java, including inheritance, polymorphism, abstract classes, and interfaces, through practical applications. The exercises cover different scenarios: managing a library system, calculating salaries in a company, handling computer orders in a store, and managing a product list with a console-based menu. Each exercise involves creating classes with specific attributes and behaviors, utilizing inheritance to extend base classes, and implementing polymorphism with overridden methods. The final exercise introduces an interface for managing product collections, demonstrating how Java interfaces and lists work together in a simple menu-driven application.

### Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**

## About The Project
### Exercise 1: Library Management System
In this exercise, you’ll create a simple library system in Java. Start by defining a **Personne** class with basic attributes (name, email, etc.), then extend it to create two subclasses: **Adherent** for library members and **Auteur** for authors. Each subclass redefines a display method to show unique details. Additionally, a **Livre**  class stores the author and book details. Finally, a **main** method creates an Adherent and a Livre instance to demonstrate how inherited attributes and methods are used in practice.
### Exercise 2: Employee Salary Management System
Here, you will use an abstract class **Employe** with an abstract method for calculating salaries, which subclasses are required to implement. The **Ingénieur** and **Manager** classes inherit from Employe, each with a specific salary calculation method (15% and 20% increases, respectively). In the main method, instances of Ingénieur and Manager are created to showcase how polymorphism allows different implementations of the salary calculation for each type of employee.
### Exercise 3: Computer Store Order Management
This exercise introduces aggregation and composition by defining classes like **Ordinateur**, Catégorie, **Commande**, **LigneCommande**, and **Client**. You’ll implement methods to add and remove items, search for products by price, and manage customer orders with order lines. The main method sets up a small example order to test how different objects and relationships work together to represent a store’s inventory and order system.
### Exercise 4: Product Collection Management with Interfaces
The final exercise focuses on interfaces and collection management by creating a **Produit** class for products and an **IMetierProduit** interface to define methods for adding, retrieving, finding, and deleting products. The **MetierProduitImpl** class implements this interface, managing a list of products. In the main method, you’ll create a console menu allowing the user to interact with the list, demonstrating how interfaces help organize and manage collections in Java applications.

## Implementation
  ### ScreenShots
  #### 1 - Exercise 1:
  ![image](https://github.com/user-attachments/assets/0d2e99f8-12fd-4e84-a2c8-a2b5bb4faf23)
  This execution displays the information of a library member and a book with its author, using specific afficher() methods for each entity. The details include the member number, name, email, and age for the library member, as well as the ISBN, book title, and author information. The program runs without errors, effectively illustrating inheritance and composition in Java.
  
  #### 2 - Exercise 2:
  ![image](https://github.com/user-attachments/assets/034f49fe-9820-4469-838b-f52bee72f5ce)
  It displays the information of an engineer and a manager, including their names, first names, emails, phone numbers, and base salaries. For the engineer "Mohamed Ahmed," the salary after a 15% increase is 16,675.0, and for the manager "Wilfried Zaha," the salary after a 20% increase is 30,000.0. The program ends with an exit code of 0, indicating successful execution.
  ### 3 - Exercise 3:
  ![image](https://github.com/user-attachments/assets/939cfa12-0c77-4fe9-aa08-bb4917e94ae7)
  
  ### 4 - Exercise 4:
  ![image](https://github.com/user-attachments/assets/cacd0487-fa16-4832-bac4-047c2107a18a)
  
  Here, the option chosen by the user is selected, and initially, we will choose option 3 to enter products into the list.
  
  ![image](https://github.com/user-attachments/assets/2a1ab147-89a8-4e46-9788-67e14a15effc)
  
  After entering some products, we can perform other tasks. If we choose option 1, we can display all the products in our list, as shown in the image below.
  
  ![image](https://github.com/user-attachments/assets/1e960174-df09-4aed-99cf-416278ead084)
  
  
We can also search for a product using a keyword (either the product name or part of it). If we enter "DELL," we get all products with "DELL" in their names, as shown in the image below.

![image](https://github.com/user-attachments/assets/b81ed730-264b-415b-b62e-0489b1f962bb)

We can also retrieve a product by its ID. For example, if we enter ID=3, we retrieve the product with an ID equal to 3.

![image](https://github.com/user-attachments/assets/8244c2c6-9a3f-4778-ad1a-4524e8ae18e9)

We can also perform the task of deleting a product by entering its ID.


![image](https://github.com/user-attachments/assets/3d96a9a0-11ae-47fc-b9be-da507dfcd506)







