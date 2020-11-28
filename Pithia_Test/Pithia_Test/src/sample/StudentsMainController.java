package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StudentsMainController {

    @FXML
    private TextField inputAM;

    public TextField getInputAM() {
        return inputAM;
    }



    @FXML
    private  Button studentSignIn;

    public Button getStudentSignIn() {
        return studentSignIn;
    }
}
