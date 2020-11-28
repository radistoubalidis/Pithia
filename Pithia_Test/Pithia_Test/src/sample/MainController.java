package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

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
    private Button studentButton;

    public Button getStudentButton() {
        return studentButton;
    }


    @FXML
    private Button signInButton;

    public Button getSignInButton() {
        return signInButton;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.getStudentButton().setStyle(
                "-fx-outer-border : transparent;" +  // if you don't want a button border.
                "-fx-inner-border : transparent;" +  // if you don't want a button border.
                "-fx-focus-color: transparent;" +  // if you don't want any focus ring.
                "-fx-faint-focus-color : transparent;"   // if you don't want any focus ring.
                );
    }
}
