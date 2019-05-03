package ui.course_list;

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

public class CourseListController {
    @FXML
    private JFXTreeTableView<?> tableView;

    @FXML
    private TreeTableColumn<?, ?> cNameCol;

    @FXML
    private TreeTableColumn<?, ?> descCol;

    @FXML
    private TreeTableColumn<?, ?> termCol;

    @FXML
    private TreeTableColumn<?, ?> creditCol;

    @FXML
    void loadAddCourse(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/add_course/add_course.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Add Course");
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
    void loadEditCourse(ActionEvent event) {

    }

}
