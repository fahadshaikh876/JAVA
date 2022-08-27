import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class cntrllr {

    @FXML
    private Label dsly;

    @FXML
    private Button sub;

    @FXML
    private TextField txtFld;

    @FXML
    void btnsubClicked(ActionEvent event) {
        dsly.setText(txtFld.getText());

    }

}
