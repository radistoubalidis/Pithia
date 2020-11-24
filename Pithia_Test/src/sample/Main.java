package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    Stage window;
    Scene loginScene,kathigitisScene;


    Foititis correctGrade;


    Kathigitis temp = new Kathigitis("Δελιγιαννης Ιγνατιος","Αλγοριθμοι και Δομες Δεδομενων");
    Foititis [] foitites =  {
            new Foititis(101,"Ραδης Τουμπαλιδης","it101@it.teithe.gr"),
            new Foititis(102 ,"Βασιλης Κωνσταντινιδης","it102@it.teithe.gr"),
            new Foititis(103 ,"Αποστολης Νικιταρας","it103@it.teithe.gr"),
            new Foititis(104 ,"Gerald Culai","it104@it.teithe.gr"),
            new Foititis(105,"Δημοσθενης Σθεναρος","it105@it.teithe.gr")
    };



    Mathima [] mathimata = {
            new Mathima(201,"Μηχανικη Λογισμικου","μπλαμπλαμπλαμλαπμαλπμαλπμαπλμαλπμλπα"),
            new Mathima(202,"Texnologia BD","μπλαμπλαμπλαμλαπμαλπμαλπμαπλμαλπμλπα"),
            new Mathima(203,"Diktya Ypologistwn","μπλαμπλαμπλαμλαπμαλπμαλπμαπλμαλπμλπα"),
    };

    float vathmoi [] = {3,4,0};

    Dilosi diloseis [] = {
            new Dilosi(mathimata,'9',vathmoi,foitites[0]),
            new Dilosi(mathimata,'7',vathmoi,foitites[1]),
            new Dilosi(mathimata,'5',vathmoi,foitites[2])
    };




    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;


        //load main page
        FXMLLoader mainMenu = new FXMLLoader(getClass().getResource("MainPage.fxml"));
        Parent mainMenuRoot = mainMenu.load();
        loginScene = new Scene(mainMenuRoot);


        //load kathigitis page
        FXMLLoader kathigitisMain = new FXMLLoader(getClass().getResource("kathigitisMain.fxml"));
        Parent kathigitisRoot = kathigitisMain.load();
        kathigitisScene = new Scene(kathigitisRoot);



        //login sto susthma
        MainController mainCntrl = mainMenu.getController();
        mainCntrl.getSignInButton().setOnAction(e ->{
            if(mainCntrl.getUsernameInput().getText().equals("radis") && mainCntrl.getPasswordInput().getText().equals("radis")){
                window.setScene(kathigitisScene);
            }
        });

        MainKathigitisController kathiCntrl = kathigitisMain.getController();
        kathiCntrl.getSearchFoititi().setOnAction(e ->{
            String AM = kathiCntrl.getInputAM().getText();
            int AM_real = Integer.parseInt(AM);
            correctGrade = temp.findFoititi(AM_real,foitites);
            kathiCntrl.getOutputFoititi().setText("O foititis pou psaxnetai einai :"+correctGrade.getName());

        });










        window.setTitle("Pithia");
        window.setScene(loginScene);
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
