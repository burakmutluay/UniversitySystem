package ui.admin_panel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AdminPanelController {

    @FXML
    public void initialize(){

    }

    @FXML
    void loadAcademics(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/academic_list/academic_list.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Academics");
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loadCourses(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/course_list/course_list.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Courses");
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loadDepartments(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/department_list/department_list.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Departments");
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void loadProjects(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/project_list/project_list.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Projects");
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loadSections(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/section_list/section_list.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Sections");
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void loadStudents(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/student_list/student_list.fxml"));
            Pane pane = loader.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Students");
            stage.setScene(new Scene(pane));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
