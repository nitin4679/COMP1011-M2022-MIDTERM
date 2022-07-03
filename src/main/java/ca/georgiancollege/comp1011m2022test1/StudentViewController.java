package ca.georgiancollege.comp1011m2022test1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {

    @FXML
    private TableView<Student> tableView;

    @FXML
    private TableColumn<Student, Integer> studentNumCol;

    @FXML
    private TableColumn<Student, String> firstNameCol;

    @FXML
    private TableColumn<Student, String> lastNameCol;

    @FXML
    private TableColumn<Student, String> telephoneCol;

    @FXML
    private TableColumn<Student, String> addressCol;

    @FXML
    private TableColumn<Student, String> provinceCol;

    @FXML
    private TableColumn<Student, Integer> avgGradeCol;

    @FXML
    private TableColumn<Student, String> majorCol;

    @FXML
    private CheckBox ontarioCheckBox;

    @FXML
    private Label numOfStudentsLabel;

    @FXML
    private CheckBox honourRollCheckBox;

    @FXML
    private ComboBox<String> areaCodeComboBox;

    @FXML
    private void applyFilter()  {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentNumCol.setCellValueFactory(new PropertyValueFactory<>("student"));
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory((new PropertyValueFactory<>("lastName")));
        telephoneCol.setCellValueFactory((new PropertyValueFactory<>("telephone")));
        addressCol.setCellValueFactory((new PropertyValueFactory<>("address")));
        provinceCol.setCellValueFactory((new PropertyValueFactory<>("province")));
        avgGradeCol.setCellValueFactory((new PropertyValueFactory<>("avgGrade")));
        majorCol.setCellValueFactory((new PropertyValueFactory<>("major")));
        tableView.getItems().addAll(DBManager.getStudentFromDb());

        areaCodeComboBox.getItems().add("All");
    }
}
