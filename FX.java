
import javax.swing.ButtonGroup;

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
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        Button l1 = new Button();
        // btn.setPrefSize(120,30);

        btn.setText("Say 'Hello World'");
        l1.setText("fahad");
        
        GridPane gridPane = new GridPane();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        l1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!");
                Button b1 = new Button();
                b1.setText("heheheh");
                gridPane.add(b1,2,2,1,1);
                
            }
        });

        gridPane.add(btn, 0, 0, 1, 1);
        gridPane.add(l1, 1, 1, 1, 1);

        StackPane root = new StackPane();
        // root.getChildren().addAll(btn,l1);
        // root.getChildren().add(btn);

        root.getChildren().add(gridPane);
        primaryStage.setScene(new Scene(root, 300, 650));
        primaryStage.show();
    }
}
