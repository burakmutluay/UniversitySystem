package ui.project_list;

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

public class ProjectListController {
    @FXML
    private JFXTreeTableView<?> tableView;

    @FXML
    private TreeTableColumn<?, ?> idCol;

    @FXML
    private TreeTableColumn<?, ?> nameCol;

    @FXML
    private TreeTableColumn<?, ?> dptNameCol;

    @FXML
    private TreeTableColumn<?, ?> budgetCol;

    @FXML
    private TreeTableColumn<?, ?> descCol;

    @FXML
    private TreeTableColumn<?, ?> academicCol;

    @FXML
    void loadAddProject(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/add_project/add_project.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Add Project");
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
    void loadEditProject(ActionEvent event) {

    }
}
