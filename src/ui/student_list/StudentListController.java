package ui.student_list;

import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class StudentListController {

    @FXML
    private JFXTreeTableView<?> tableView;

    @FXML
    private TreeTableColumn<?, ?> idCol;

    @FXML
    private TreeTableColumn<?, ?> nameCol;

    @FXML
    private TreeTableColumn<?, ?> emailCol;

    @FXML
    private TreeTableColumn<?, ?> gpaCol;

    @FXML
    private TreeTableColumn<?, ?> mentorCol;

    @FXML
    private TreeTableColumn<?, ?> passCol;

    @FXML
    void loadAddStudent(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/add_student/add_student.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Add Student");
            stage.setScene(new Scene(pane));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    void loadDeleteAction(ActionEvent event) {

    }

    @FXML
    void loadEditStudent(ActionEvent event) {

    }
}
