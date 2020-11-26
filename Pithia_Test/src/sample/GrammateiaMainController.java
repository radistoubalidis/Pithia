package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;


public class GrammateiaMainController {



    // O Controller gia to ui ths grammateias
    @FXML
    private ListView<String> aitiseisView;

    public ListView<String> getAitiseisView() {
        return aitiseisView;
    }

    @FXML
    private Label welcomeMessage;

    public Label getWelcomeMessage() {
        return welcomeMessage;
    }


    @FXML
    private Button ypobolhButton;

    public Button getYpobolhButton() {
        return ypobolhButton;
    }

    @FXML
    private Text ypobolhMessage;

    public Text getYpobolhMessage() {
        return ypobolhMessage;
    }
}
