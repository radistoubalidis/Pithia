package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentSignedController {


    @FXML
    private ListView<String> dilosiView;

    @FXML
    private  Label studentMessage ;

    public Label getStudentMessage() {
        return studentMessage;
    }

    public ListView<String> getDilosiView() {
        return dilosiView;
    }


}
