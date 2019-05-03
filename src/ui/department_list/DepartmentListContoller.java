package ui.department_list;

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

public class DepartmentListContoller {

    @FXML
    private JFXTreeTableView<?> tableView;
    @FXML
    private TreeTableColumn<?, ?> dptNameCol;

    @FXML
    private TreeTableColumn<?, ?> phoneCol;

    @FXML
    void loadAddDpt(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/add_department/add_department.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Add Department");
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
    void loadEditDpt(ActionEvent event) {

    }
}
