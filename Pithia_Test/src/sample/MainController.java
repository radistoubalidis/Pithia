package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField usernameInput;

    public TextField getUsernameInput() {
        return usernameInput;
    }

    @FXML
    private PasswordField passwordInput;

    public PasswordField getPasswordInput() {
        return passwordInput;
    }

    @FXML
    private Button signInButton;

    public Button getSignInButton() {
        return signInButton;
    }




}
