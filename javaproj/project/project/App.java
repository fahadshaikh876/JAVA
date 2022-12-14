import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cntrllrdemo.fxml"));

        stage.setScene(new Scene(root));
        // stage.Title("Bakre")
        stage.setTitle("bakeshop");

        stage.setMaximized(true);
        stage.show();
    }
}
