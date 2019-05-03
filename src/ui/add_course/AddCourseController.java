package ui.add_course;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AddCourseController {

    @FXML
    private JFXTextField coursenameField;

    @FXML
    private JFXTextField dptField;

    @FXML
    private JFXTextField instructorField;

    @FXML
    private JFXTextField sectionDayField;

    @FXML
    private JFXTimePicker strttimeField;

    @FXML
    private JFXTimePicker endingTimeField;


    @FXML
    void addStudent(ActionEvent event) {

    }

    @FXML
    void closeWindow(ActionEvent event) {

    }
}
