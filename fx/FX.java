
import javax.swing.ButtonGroup;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.layout.*;

public class FX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome to he bakeshop");
        Button signin = new Button();
        Button signup = new Button();
        signin.setPrefSize(120,30);

        signin.setText("Sign In");
        signup.setText("fahad");
        
        GridPane gridPane = new GridPane();
        signin.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sign In");
            }
        });

        signup.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
           FX1 fx1 = new FX1();
           fx1.start(primaryStage);
                
            }
        });
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(signin, 0, 0, 1, 1);
        gridPane.add(signup, 1, 1, 1, 1);
        gridPane.setHgap(10);
gridPane.setVgap(10);
    

        StackPane root = new StackPane();
        // root.getChildren().addAll(signin,signup);
        // root.getChildren().add(signin);

        root.getChildren().add(gridPane);
        primaryStage.setScene(new Scene(root, 300, 650));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
