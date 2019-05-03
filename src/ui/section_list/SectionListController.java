package ui.section_list;

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

public class SectionListController {
    @FXML
    private JFXTreeTableView<?> tableView;

    @FXML
    private TreeTableColumn<?, ?> idCol;

    @FXML
    private TreeTableColumn<?, ?> cNameCol;

    @FXML
    private TreeTableColumn<?, ?> deptCol;

    @FXML
    private TreeTableColumn<?, ?> instructorCol;

    @FXML
    private TreeTableColumn<?, ?> termCol;

    @FXML
    private TreeTableColumn<?, ?> dayCol;

    @FXML
    private TreeTableColumn<?, ?> startingCol;

    @FXML
    private TreeTableColumn<?, ?> endingCol;

    @FXML
    void loadAddSection(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/add_section/add_section.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Add Section");
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
    void loadEditSection(ActionEvent event) {

    }

}
