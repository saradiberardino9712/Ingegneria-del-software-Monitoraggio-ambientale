package FrontController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class GestioneAreaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane txtdataora;

    @FXML
    private Button btnHome;

    @FXML
    void Home(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtdataora != null : "fx:id=\"txtdataora\" was not injected: check your FXML file 'area.fxml'.";
        assert btnHome != null : "fx:id=\"btnHome\" was not injected: check your FXML file 'area.fxml'.";

    }
}
