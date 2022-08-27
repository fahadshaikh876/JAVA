import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;

import java.sql.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.scene.control.Alert;

public class SignupController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    Connection conn = null;
    PreparedStatement p = null;
    ResultSet rs = null;

    @FXML
    private TextField C;

    @FXML
    private TextField E;

    @FXML
    private TextField N;

    @FXML
    private PasswordField P;

    @FXML
    private Button Signup;

    @FXML
    private TextField U;

    @FXML
    private Button back;

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
    void signup(ActionEvent event) throws IOException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            conn = DriverManager.getConnection("jdbc:mysql://localhost/javaproj", "root", "ijnbhu");

            if (N.getText() != "" && E.getText() != "" && C.getText() != "" && U.getText() != "" && P.getText() != "") {
                String q = String.format("insert into onlinecustomer values ('%d','%s','%s','%s','%s','%s')", 26,
                        N.getText(), E.getText(), C.getText(), U.getText(), P.getText());
                // // // " insert into users (first_name, last_name, date_created, is_admin,
                // // // num_points)"
                // // // + " values (?, ?, ?, ?, ?)";
                PreparedStatement p = conn.prepareStatement(q);
                p = conn.prepareStatement(q);
                // // p.setInt(1, 2);
                // // p.setString(2, N.getText());
                // // p.setString(3, E.getText());
                // // p.setString(3, C.getText());
                // // p.setString(5, U.getText());
                // // p.setString(6, P.getText());

                // p.executeUpdate();

                conn.close();

                // while (rs.next()) {
                // System.out.print(rs.getString(5));
                // System.out.print(rs.getString(6));
                // }
                // if (rs.next()) {
                // System.out.print(rs.getString(6));
                // System.out.print("here");
                Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                // stage.setTitle("bakeshop");
                // stage.setMaximized(true);

                stage.show();

                System.out.println("Connection is opened sucessfully");

            } else {
                System.out.print("noooooooo");
            }

        } catch (

        SQLException ex) {
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
