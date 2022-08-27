import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;

public class cntrllr {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button SignIn;

    @FXML
    private Button SignUp;

    @FXML
    private Label Title;

    @FXML
    void signin(ActionEvent event) throws IOException {
        // dsly.setText(txtFld.getText());
        // txt.setText("");
        // back.setText("fahad");
        Parent root = FXMLLoader.load(getClass().getResource("signindemo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        // stage.setTitle("bakeshop");
        // stage.setMaximized(true);
        stage.show();
        // System.out.print("hello");

    }

    @FXML
    void signup(ActionEvent event) throws IOException {
        // dsly.setText(txtFld.getText());
        // txt.setText("");
        // back.setText("fahad");
        Parent root = FXMLLoader.load(getClass().getResource("signupdemo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        // stage.setTitle("bakeshop");
        // stage.setMaximized(true);
        stage.show();
        // System.out.print("hello");

    }

}
