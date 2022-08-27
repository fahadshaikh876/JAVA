import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.*;

import java.sql.*;

public class menucontroller {
    public static ArrayList<Pair<String, Integer>> lsr = new ArrayList<Pair<String, Integer>>();
    // Pair<String, double> tuple = new Pair();
    // ArrayList<Pair> araay = new ArrayList();
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private ImageView b;

    @FXML
    private ImageView c;

    @FXML
    private ComboBox<?> i;

    @FXML
    private ImageView m;

    @FXML
    private Button o;

    @FXML
    private Button s;

    @FXML
    void sc1(ActionEvent event) throws IOException {
        // dsly.setText(txtFld.getText());
        // txt.setText("");
        // back.setText("fahad");
        // araay.add(new tuple("break",3.5));
        lsr.add(new Pair<String, Integer>("Bread", 3));

        // Parent root = FXMLLoader.load(getClass().getResource("signupdemo.fxml"));
        // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // scene = new Scene(root);
        // stage.setScene(scene);
        // // stage.setTitle("bakeshop");
        // // stage.setMaximized(true);
        // stage.show();
        System.out.print("hello");

    }

    @FXML
    void co(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Shoppingcart.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        // stage.setTitle("bakeshop");
        // stage.setMaximized(true);

        stage.show();

    }

}
