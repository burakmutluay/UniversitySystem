package ui.add_student;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddStudentController {

    @FXML
    private JFXTextField nameField;

    @FXML
    private JFXRadioButton checkboxFemale;

    @FXML
    private JFXRadioButton checkboxMale;

    @FXML
    private JFXTextField emailField;

    @FXML
    private JFXPasswordField passField;

    @FXML
    private JFXTextField mentorField;

    @FXML
    private JFXTextField dptField;

    @FXML
    void addStudent(ActionEvent event) {

    }

    @FXML
    void closeWindow(ActionEvent event) {

    }

}
