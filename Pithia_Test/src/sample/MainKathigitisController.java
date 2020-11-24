package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;




public class MainKathigitisController {

    @FXML
    private TextField inputAM;

    public TextField getInputAM() {
        return inputAM;
    }

    @FXML
    private Button searchFoititi;

    public Button getSearchFoititi() {
        return searchFoititi;
    }

    @FXML
    private Label outputFoititi;

    public Label getOutputFoititi() {
        return outputFoititi;
    }

    @FXML
    private ListView<Mathima> listOfCourses;

    public ListView<Mathima> getListOfCourses() {
        return listOfCourses;
    }
}
