package ui.login;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class LoginController {

    @FXML
    private JFXTextField emailField;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    public void initialize(){

    }

    @FXML
    void loadLoginAction(ActionEvent event) {
        System.out.println("hello");
        loadAdminPanel();
        closeStage();
    }

    void loadAdminPanel(){
        String email = emailField.getText();
        String password = passwordField.getText();
        try {
            FXMLLoader root= new FXMLLoader(getClass().getResource("/ui/admin_panel/admin_panel.fxml"));
            Parent parent = root.load();
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("University Management System");
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void closeStage(){
        ((Stage) emailField.getScene().getWindow()).close();
    }


}
