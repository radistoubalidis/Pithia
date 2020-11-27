package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class KathigitisCorrectiveGradeController {


    @FXML
    private TextField newGrade;

    public TextField getNewGrade() {
        return newGrade;
    }

    @FXML
    private Text ypobolhMessage;

    public Text getYpobolhMessage() {
        return ypobolhMessage;
    }

    @FXML
    private Button ypobolhButton;

    public Button getYpobolhButton() {
        return ypobolhButton;
    }

    @FXML
    private Label selectedItem;

    public Label getSelectedItem() {
        return selectedItem;
    }
}
