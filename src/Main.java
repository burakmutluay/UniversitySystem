import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader root= new FXMLLoader(getClass().getResource("ui/login/login.fxml"));

        Pane pane = root.load();

        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("University Management System");
        primaryStage.show();
    }
}
