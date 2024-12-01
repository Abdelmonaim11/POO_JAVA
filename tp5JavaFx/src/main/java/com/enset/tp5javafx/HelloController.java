package com.enset.tp5javafx;

import com.enset.dao.ProfesseurDaoImpl;
import com.enset.entities.Professeur;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;


public class HelloController implements Initializable{
    ProfesseurDaoImpl professeurDao = new ProfesseurDaoImpl();
//    @FXML
//    private Label welcomeText;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        System.out.println("Hello from initializable");
//    }

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application Monaim!");
//    }
//
//    @FXML
//    protected void printHi(MouseEvent event) {
//        System.out.println("Hi to you Monaim, enjoy coding with JavaFX");
//    }

//    @FXML
//    private TextField inputname;
//
//    @FXML
//    private Text nameout;
//
//    @FXML
//    void showinputname(MouseEvent event) {
//       nameout.setText(inputname.getText());
//        System.out.println(inputname.getText());
//    }
//@FXML
//private RadioButton female;
//
//    @FXML
//    private ToggleGroup gender;
//
//    @FXML
//    private Text genderOut;
//
//    @FXML
//    private RadioButton male;
//
//    @FXML
//    void getGender(MouseEvent event) {
//        if(gender.getSelectedToggle().equals(male)){
//            genderOut.setText(male.getText());
//            System.out.println("Your gender is : "+male.getText());
//        }else{
//            genderOut.setText(female.getText());
//            System.out.println("Your gender is : "+female.getText());
//        }
//
//    }

//    @FXML
//    private Slider slider;
//
//    @FXML
//    private Text textSlider;
//
//    @FXML
//    void updateText(MouseEvent event) {
//        textSlider.setText(String.valueOf((int)slider.getValue()));
//    }
    //List View-------------------------
//@FXML
//private ListView<String> listNames;
//
//    @FXML
//    private TextField name;
//
//    @FXML
//    void addName(MouseEvent event) {
//        listNames.getItems().add(name.getText());
//    }
//
//    @FXML
//    void removeName(MouseEvent event) {
//        int selectedId = listNames.getSelectionModel().getSelectedIndex();
//        listNames.getItems().remove(selectedId);
//    }
    //Spiner ------------------------
//@FXML
//private Spinner<Integer> numberSpinner;
//
//SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1);
//
//    @FXML
//    private Text textSpinner;
//
//    @FXML
//    void getNumber(MouseEvent event) {
//         int number = numberSpinner.getValue();
//         textSpinner.setText(String.valueOf(number));
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        numberSpinner.setValueFactory(svf);
//    }
//@FXML
//private Text textPress;
//@FXML
//void show(KeyEvent event) {
//   if(event.getCode() == KeyCode.ENTER){
//       textPress.setVisible(false);
//   }
//    if(event.getCode() == KeyCode.SPACE){
//        textPress.setVisible(true);
//    }
//
//}
    //Date Picker --------------
//@FXML
//private DatePicker datePicker;
//
//
//    @FXML
//    void getDate(MouseEvent event) {
//        LocalDate time = datePicker.getValue();
//        System.out.println(time);
//    }
    //ChoiceBox
//@FXML
//private ChoiceBox<String> choice;
//
//
//
//    @FXML
//    void getChoice(MouseEvent event) {
//         String choosenLanguage = choice.getSelectionModel().getSelectedItem();
//        System.out.println(choosenLanguage);
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        choice.getItems().addAll("Java", "JavaScript", "TypeScript", "PHP", "Python");
//    }
    //Color Picker----------
//@FXML
//private Button btn;
//
//    @FXML
//    private ColorPicker color;
//
//
//    @FXML
//    void getColor(MouseEvent event) {
//        Color clr = color.getValue();
//        btn.setTextFill(clr);
//    }
//@FXML
//private ChoiceBox<String> choiceBox;
//
//    @FXML
//    private Text text;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        choiceBox.getItems().addAll("One", "Two","Three", "Four", "Five", "Six");
//        choiceBox.setOnAction(actionEvent -> text.setText(choiceBox.getValue()));
//    }
    //Change Stages
//@FXML
//private Button btnNext;
//
//    @FXML
//    void goNext(MouseEvent event) throws IOException {
//        Stage stage = (Stage) btnNext.getScene().getWindow();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("stage2.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Stage2!");
//        stage.setScene(scene);
//    }
    //Table View-----------------IMPORTANTTTTTTTTTTTTTTTTTTTTT
//@FXML
//private TableColumn<Professeur, String> adresse;
//
//    @FXML
//    private TableColumn<Professeur, String> cin;
//
//    @FXML
//    private TableColumn<Professeur, Date> date;
//
//    @FXML
//    private TableColumn<Professeur, String> email;
//
//    @FXML
//    private TableColumn<Professeur, Integer> id;
//
//    @FXML
//    private TableColumn<Professeur, String> nom;
//
//    @FXML
//    private TableColumn<Professeur, String> prenom;
//
//    @FXML
//    private TableView<Professeur> table;
//
//    @FXML
//    private TableColumn<Professeur, String> telephon;
//
//
//    ObservableList<Professeur> profs = FXCollections.observableArrayList(
//            professeurDao.getAll()
//    );
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//    id.setCellValueFactory(new PropertyValueFactory<>("id_prof"));
//    nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
//    prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
//    cin.setCellValueFactory(new PropertyValueFactory<>("cin"));
//    adresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));
//    telephon.setCellValueFactory(new PropertyValueFactory<>("telephon"));
//    email.setCellValueFactory(new PropertyValueFactory<>("email"));
//    date.setCellValueFactory(new PropertyValueFactory<>("date_recrutement"));
//    table.setItems(profs);
//    }
    //ALERT---------------------------
//@FXML
//void showDialog(ActionEvent event) {
//   Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//   alert.setTitle("Alert!!!!");
//   alert.setContentText("This is an Alert!!!");
//    Optional<ButtonType> result = alert.showAndWait();
//    if (result.isEmpty()){
//        System.out.println("Alert Closed");
//
//    } else if (result.get()== ButtonType.OK) {
//        System.out.println("OK!");
//
//    }else if (result.get() == ButtonType.CANCEL){
//        System.out.println("Never!!!");
//    }
//}
    //Ajouter Professeur
@FXML
private TextField adresseInput;

    @FXML
    private TableColumn<Professeur, String> adrssProf;

    @FXML
    private TextField cinInput;

    @FXML
    private TableColumn<Professeur, String> cinProf;

    @FXML
    private DatePicker dateInput;

    @FXML
    private TableColumn<Professeur, Date> dateProf;

    @FXML
    private TextField emailInput;

    @FXML
    private TableColumn<Professeur, String> emailProf;

    @FXML
    private TextField idInput;

    @FXML
    private TableColumn<Professeur, Integer> idProf;

    @FXML
    private TextField nomInput;

    @FXML
    private TableColumn<Professeur, String> nomProf;

    @FXML
    private TextField prenomInput;

    @FXML
    private TableView<Professeur> tableProfs;

    @FXML
    private TableColumn<Professeur, String> prenomProf;

    @FXML
    private TableColumn<Professeur, String> teleProf;

    @FXML
    private TextField telephonInput;

    ObservableList<Professeur> profs = FXCollections.observableArrayList(
          professeurDao.getAll()
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idProf.setCellValueFactory(new PropertyValueFactory<>("id_prof"));
        nomProf.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomProf.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        cinProf.setCellValueFactory(new PropertyValueFactory<>("cin"));
        adrssProf.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        teleProf.setCellValueFactory(new PropertyValueFactory<>("telephon"));
        emailProf.setCellValueFactory(new PropertyValueFactory<>("email"));
        dateProf.setCellValueFactory(new PropertyValueFactory<>("date_recrutement"));
        tableProfs.setItems(profs);
    }
    @FXML
    void addProf(MouseEvent event) {
        LocalDate time = dateInput.getValue();
        java.sql.Date sqlDate = java.sql.Date.valueOf(time);
      Professeur professeur = new Professeur(Integer.parseInt(idInput.getText()), nomInput.getText(),prenomInput.getText(), cinInput.getText(), adresseInput.getText(), telephonInput.getText(), emailInput.getText(), sqlDate);
      professeurDao.save(professeur);
      profs.add(professeur);

    }
    @FXML
    void removeProf(MouseEvent event) {
        Professeur selectedProf = tableProfs.getSelectionModel().getSelectedItem();
        professeurDao.delete(selectedProf.getId_prof());
        profs.remove(selectedProf);
    }
    @FXML
    void rowClicked(MouseEvent event) {
        Professeur selectedProf = tableProfs.getSelectionModel().getSelectedItem();
        idInput.setText(String.valueOf(selectedProf.getId_prof()));
        nomInput.setText(String.valueOf(selectedProf.getNom()));
        prenomInput.setText(String.valueOf(selectedProf.getPrenom()));
        cinInput.setText(String.valueOf(selectedProf.getCin()));
        adresseInput.setText(String.valueOf(selectedProf.getAdresse()));
        telephonInput.setText(String.valueOf(selectedProf.getTelephon()));
        emailInput.setText(String.valueOf(selectedProf.getEmail()));
        java.util.Date date = selectedProf.getDate_recrutement();
        // Use Calendar to extract year, month, and day
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Create LocalDate
        LocalDate localDate = LocalDate.of(year, month, day);
        dateInput.setValue(localDate);
        idInput.setDisable(true);
    }
    @FXML
    void updateProf(ActionEvent event) {
        Professeur selectedProf = tableProfs.getSelectionModel().getSelectedItem();
        int id = Integer.parseInt(idInput.getText());
        String nom = nomInput.getText();
        String prenom = prenomInput.getText();
        String cin = cinInput.getText();
        String adresse = adresseInput.getText();
        String telephon = telephonInput.getText();
        String email = emailInput.getText();
        LocalDate localDate = dateInput.getValue();
        java.util.Date dateRecrutement = java.sql.Date.valueOf(localDate);
        Professeur updatedProf = new Professeur(id, nom, prenom, cin, adresse, telephon, email, dateRecrutement);
        professeurDao.update(updatedProf);
        int selectedIndex = tableProfs.getSelectionModel().getSelectedIndex();
        tableProfs.getItems().set(selectedIndex, updatedProf);
    }


}