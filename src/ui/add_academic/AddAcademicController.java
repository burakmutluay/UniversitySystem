package ui.add_academic;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddAcademicController {

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
    private JFXTextField officeField;

    @FXML
    private JFXTextField dptField;

    @FXML
    void addAcademic(ActionEvent event) {

    }

    @FXML
    void closeWindow(ActionEvent event) {

    }
}
