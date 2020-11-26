package sample;

import javafx.collections.ObservableList;
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
    private Button refreshStudent;

    public Button getRefreshStudent() {
        return refreshStudent;
    }

    @FXML
    private Button correctGrade_;

    public Button getCorrectGrade_() {
        return correctGrade_;
    }

    @FXML
    public Label welcomeMessagel;

    public Label getWelcomeMessagel() {
        return welcomeMessagel;
    }


    @FXML
    private Label gradeErrorMessage;

    public Label getGradeErrorMessage() {
        return gradeErrorMessage;
    }

    @FXML
    private Label correctGrade_Course;

    public Label getCorrectGrade_Course() {
        return correctGrade_Course;
    }

    @FXML
    private Label outputFoititi;

    public Label getOutputFoititi() {
        return outputFoititi;
    }

    @FXML
    private ListView<String> listOfCourses;

    public ListView<String> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ListView<String> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
}
