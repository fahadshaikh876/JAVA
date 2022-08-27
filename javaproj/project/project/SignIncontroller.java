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
import java.sql.*;

public class SignIncontroller {
    private Stage stage;
    private Scene scene;
    private Parent root;
    Connection conn = null;
    PreparedStatement p = null;
    ResultSet rs = null;

    @FXML
    private Button back;

    @FXML
    private PasswordField passfield;

    @FXML
    private Label password;

    @FXML
    private Button signin;

    @FXML
    private Label txt;

    @FXML
    private TextField txtfeild;

    @FXML
    private Label username;

    @FXML
    void backcl(ActionEvent event) throws IOException {
        // dsly.setText(txtFld.getText());
        // txt.setText("");
        // back.setText("fahad");
        Parent root = FXMLLoader.load(getClass().getResource("cntrllrdemo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        // stage.setTitle("bakeshop");

        // stage.setMaximized(true);

        stage.show();

    }

    @FXML
    void signin(ActionEvent event) throws IOException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost/javaproj", "root", "ijnbhu");

            String q = String.format("select * from onlinecustomer where Username = '%s'", txtfeild.getText());

            p = conn.prepareStatement(q);
            rs = p.executeQuery(q);

            System.out.println("sucessfully");
            // while (rs.next()) {
            // System.out.print(rs.getString(5));
            // System.out.print(rs.getString(6));
            // }

            if (rs.next()) {
                // System.out.print(rs.getString(6));
                Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                // stage.setTitle("bakeshop");

                // stage.setMaximized(true);

                stage.show();

                System.out.println("Connection is opened sucessfully");
                // conn.close();

            } else {
                System.out.print("noooooooo");
            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        catch (Exception e) {
            System.out.println("exception occorued: " + e);
        }
    }

}
