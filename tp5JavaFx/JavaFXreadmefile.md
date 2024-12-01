# TP5: JavaFX and database access Documentation
This JavaFX application is designed to manage professors and departments in an educational institution. It offers features for adding, editing, viewing, and deleting professor and department records. The application aims to streamline administrative tasks and ensure efficient data handling. It provides an intuitive interface to facilitate seamless interactions for users managing academic information.

## Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**
- <img src="https://upload.wikimedia.org/wikipedia/commons/0/0a/JavaFX_Logo.png" width="30" height="30"/> &nbsp;&nbsp;**JavaFX**
## Project structure
### Entities Layer
#### Professeur Entity Description
Each professor belongs to a single department. The following data is associated with each professor:
- id_prof: int
- nom: string (last name)
- prenom: string (first name)
- cin: string (national ID number)
- adresse: string (address)
- telephon: string (phone number)
- email: string (email address)
- date_recrutement: date (recruitment date)
#### Department Entity:
A department can contain one or more professors. The following data is associated with each department:
- id_deprat: int
- nom: string (department name)
### Dao Layer Description
The DAO (Data Access Object) layer is responsible for managing the interaction between the application and the database. It provides methods for performing CRUD (Create, Read, Update, Delete) operations on the Departement and Professeur entities.
#### DepartementDao Interface
This interface defines the methods for interacting with the Departement entity:
- void save(Departement departement): Saves a new department to the database.
- List<Departement> findAll(): Retrieves all departments from the database.
- Departement findById(int id): Retrieves a department by its ID.
- void delete(int id): Deletes a department by its ID.
- void update(Departement departement): Updates an existing department.
#### ProfesseurDao Interface
This interface defines the methods for interacting with the Professeur entity:
- List<Professeur> getAll(): Retrieves all professors from the database.
- List<Professeur> findByKeyWord(String keyword): Retrieves professors matching a specific keyword.
- Professeur findById(int id): Retrieves a professor by their ID.
- void save(Professeur professeur): Saves a new professor to the database.
- void delete(int id): Deletes a professor by their ID.
- void update(Professeur professeur): Updates an existing professor.
- void affecterADepartement(int id_prof, int id_depart): Assigns a professor to a department.
##### Implementations
The above interfaces are implemented in their respective classes, where the database interaction is handled using JDBC or another suitable method.
##### ProfesseurTest and DepartementTest
These are console applications used to test the DAO interfaces. They allow for testing various CRUD operations and verifying the functionality of the ProfesseurDao and DepartementDao implementations.
##### SingletonConnection Class
The SingletonConnection class is used to establish a connection with the database. It ensures that only one instance of the database connection exists throughout the application.
              public class SingletonConnection {
                  private static Connection connection;
              
                  static {
                      try {
                          Class.forName("com.mysql.cj.jdbc.Driver");
                          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/etablissement", "root", "");
                      }catch (Exception e){
                          e.printStackTrace();
                      }
                  }
                  public static Connection getConnection(){
                      return connection;
                  }
              }
### Controller Layer Description
The *MainViewController* class handles the main view, which contains a TabPane. It includes methods for switching between the various tabs.
The MainViewController class manages the main interface of the JavaFX application. It handles interactions between the user and the Professeur and Departement entities. This class includes methods for adding, removing, updating, and searching for professors and departments.

Key functionalities:
- **Professor Management**: It handles CRUD operations for professors, including adding, removing, updating, and displaying professor data in a TableView.
- **Department Management**: It also manages departments, allowing users to add, remove, and update department data.
- **Search and Filtering**: The controller enables searching for professors by name and updating their details via a separate interface.
- **Navigation**: It manages the transitions to different forms for adding or updating professors and departments.
- **Department Assignment**: Allows professors to be assigned to departments via a separate dialog interface.
The class integrates the use of ProfesseurDaoImpl and DepartementDaoImpl for data persistence operations and dynamically updates the UI with changes to the data.
### tp5JavaFx Layer Description
##### **HelloApplication Class**:
- Purpose: This class serves as the entry point for the JavaFX application. It extends Application and overrides the start method to set up the primary window (Stage) of the application.
- Functionality:
  -> Loads the FXML file (home.fxml) which defines the layout of the user interface.
  -> Creates a Scene containing the loaded FXML and sets it to the stage.
  -> Displays the application window (Stage) with the title "University Management".

## ScreenShoots
![image](https://github.com/user-attachments/assets/3934a847-aa81-49c7-91fe-83a4a5fdaaaa)

![image](https://github.com/user-attachments/assets/b3ebeff3-7ae7-400f-be1b-4d40abe04496)

![image](https://github.com/user-attachments/assets/72c679b6-7472-46c6-a1e1-bbc7a26a8fd1)

![image](https://github.com/user-attachments/assets/b41b9949-a6e5-4ebf-9da6-0e20f945cd90)

![image](https://github.com/user-attachments/assets/a526e2ef-0bd7-4baf-beba-558d8734745e)

![image](https://github.com/user-attachments/assets/e2322f74-2123-471d-ae58-a59815c1f96e)

![image](https://github.com/user-attachments/assets/f3b82534-8138-4286-8c5f-1053a1d44f1e)

![image](https://github.com/user-attachments/assets/5e39c7a7-5db0-40c8-b587-96ad7a7fe4d7)

![image](https://github.com/user-attachments/assets/2362a9cc-f2c2-4d1e-9220-402badcaf0a5)

![image](https://github.com/user-attachments/assets/eb9d09d6-a752-4428-bb18-3e4f7251807a)

![image](https://github.com/user-attachments/assets/fc26b309-84be-4541-8d0a-64230720ba8a)

![image](https://github.com/user-attachments/assets/fec7dba3-4295-4fb1-8de7-e2a62c9368de)

