package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;


public class Main extends Application {


    Stage window;
    Scene loginScene,kathigitisScene,kathigitisCorrectGradeScene,grammateiaMainScene;


    // ΒΟΗΘΗΤΙΚΕΣ ΜΕΤΑΒΛΗΤΕΣ
    Foititis correctGrade;
    Dilosi correctDilosi;




    // DATA

    Grammateia grammateia = new Grammateia("Δεσπινα Παπαδολπουλου",new ArrayList<String>());


    Kathigitis deli = new Kathigitis("Δελιγιαννης Ιγνατιος","Αλγοριθμοι και Δομες Δεδομενων");

    Kathigitis [] kathigites = {
      new Kathigitis("Σιδηροποθλος Αντωνης","Λειτουργικα Συστηματα"),
      new Kathigitis("Ουγιαρογλου Στεφανος","μπαμπαμπαμπαμπαμπα"),
      new Kathigitis("Κεραμοπουλος Ευκλιδης","μπλπαμλπαμλαπμαλπαμλπαμλπ")
    };


    public ArrayList<Mathima> mathimataList = new ArrayList<Mathima>();
    public ArrayList<Dilosi> diloseisList = new ArrayList<Dilosi>();

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
            new Mathima(204,"Σχεδιαση Λειτουργικων Συστηματων","μπλαμπλαμλπαμλαπμαλπαμλπαμλπαμλπαμλαπμαλπ"),
            new Mathima(205,"ADSE","μπλαμλπαμλπαμλαπαμλπαμλπαμλπαπαμλπαμλπαμλπααμλπαμπλ"),
            new Mathima(206,"Γραφικα Υπολογιστων","μμλπαμλπαμαλπαμλπαμλπμλαπαμλπαμλπαμλπαμαλπαμλπαμλπαμλαπαμλπαμλπαμλπαμλαπαμλπαμλπ")
    };


     float[]  vathmoi = {4,4,3,3,3,3};
     float[]  vathmoi_null = {0,0,0,0,0,0};

    Dilosi [] diloseis = {
            new Dilosi(foitites[0],mathimata,'9', vathmoi),
            new Dilosi(foitites[1],mathimata,'7', vathmoi),
            new Dilosi(foitites[2],mathimata,'7',vathmoi ),
            new Dilosi(foitites[3],mathimata,'7',vathmoi ),
            new Dilosi(foitites[4],mathimata,'5',vathmoi_null)
    };

    // END OF DATA



    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;



        //  DATA

        for(int i =0 ; i< diloseis.length;i++){
            diloseisList.add(diloseis[i]);
        }

        for(int i=0 ;i < mathimata.length ; i++){
            mathimataList.add(mathimata[i]);
        }

        grammateia.getAitiseis().add("from:"+kathigites[0].getName()+",in:"+mathimata[4].getTitle()+",for:"+foitites[0].getName()+",Grade:"+8.6);
        grammateia.getAitiseis().add("from:"+kathigites[0].getName()+",in:"+mathimata[4].getTitle()+",for:"+foitites[1].getName()+",Grade:"+6.2);
        grammateia.getAitiseis().add("from:"+kathigites[0].getName()+",in:"+mathimata[4].getTitle()+",for:"+foitites[2].getName()+",Grade:"+9.1);
        grammateia.getAitiseis().add("from:"+kathigites[2].getName()+",in:"+mathimata[1].getTitle()+",for:"+foitites[1].getName()+",Grade:"+7.5);
        grammateia.getAitiseis().add("from:"+kathigites[2].getName()+",in:"+mathimata[1].getTitle()+",for:"+foitites[2].getName()+",Grade:"+6.89);
        // END OF DATA


        //load main page
        FXMLLoader mainMenu = new FXMLLoader(getClass().getResource("MainPage.fxml"));
        Parent mainMenuRoot = mainMenu.load();
        loginScene = new Scene(mainMenuRoot);


        //load kathigitis page
        FXMLLoader kathigitisMain = new FXMLLoader(getClass().getResource("kathigitisMain.fxml"));
        Parent kathigitisRoot = kathigitisMain.load();
        kathigitisScene = new Scene(kathigitisRoot);

        //load gramateia page
        FXMLLoader grammateiaMain = new FXMLLoader(getClass().getResource("grammateiaMain.fxml"));
        Parent grammateiaMainRoot = grammateiaMain.load();
        grammateiaMainScene = new Scene(grammateiaMainRoot);

        //load correct grade from kathigitis
        FXMLLoader kathigitisCorrectGrade = new FXMLLoader(getClass().getResource("kathigitisCorrectiveGrade.fxml"));
        Parent kathiCorrectGradeRoot = kathigitisCorrectGrade.load();
        kathigitisCorrectGradeScene = new Scene(kathiCorrectGradeRoot);





        //login sto susthma
        MainController mainCntrl = mainMenu.getController();
        mainCntrl.getSignInButton().setOnAction(e ->{
            if(mainCntrl.getUsernameInput().getText().equals("kathigitis") && mainCntrl.getPasswordInput().getText().equals("kathigitis")){
                window.setScene(kathigitisScene);
            }else if(mainCntrl.getUsernameInput().getText().equals("grammateia") && mainCntrl.getPasswordInput().getText().equals("grammateia")){
                window.setScene(grammateiaMainScene);
                GrammateiaMainController grammCntrl = grammateiaMain.getController();
                populateGrammateiaMain(grammCntrl,grammateia.getName());
            }
        });


        // ΥΛΟΠΟΙΗΣΗ ΤΟΥ findFoititi
        MainKathigitisController kathiCntrl = kathigitisMain.getController();
        kathiCntrl.getSearchFoititi().setOnAction(e ->{
            String AM = kathiCntrl.getInputAM().getText();
            int AM_real = Integer.parseInt(AM);
            //System.out.println(AM_real);
           correctGrade = deli.findFoititi(AM_real,foitites);
            kathiCntrl.getOutputFoititi().setText("O foititis pou psaxnetai einai o "+correctGrade.getName());
            correctDilosi =deli.findDilosiFoititi(correctGrade,diloseis);
            ArrayList<String> courses = correctDilosi.getCoures();
            for(String course : courses){
                kathiCntrl.getListOfCourses().getItems().add(course);
            }
        });




        //ylopoihsh tou createCorrectiveGrade
        KathigitisCorrectiveGradeController kathiCorrectCntrl = kathigitisCorrectGrade.getController();

        kathiCntrl.getCorrectGrade_().setOnAction(e ->{

            if(kathiCntrl.getListOfCourses().getSelectionModel().getSelectedItem().length()>0)
            {
                String titlos_mathimatos = kathiCntrl.getListOfCourses().getSelectionModel().getSelectedItem();
                window.setScene(kathigitisCorrectGradeScene);
                kathiCorrectCntrl.getSelectedItem().setText("Epileksate to mathima "+titlos_mathimatos+" kai ton foitith "+correctGrade.getName());
                checkButton(kathiCorrectCntrl,titlos_mathimatos);
            }
        });


        //ylopoihsh getCorrectiveGrade
        GrammateiaMainController grammCntrl = grammateiaMain.getController();
        grammCntrl.getYpobolhButton().setOnAction(e ->{
            String selectedAitisi = grammCntrl.getAitiseisView().getSelectionModel().getSelectedItem();
            String [] firstSplit = selectedAitisi.split(",");
            String [] onomaFoititi =  firstSplit[2].split(":");
            String [] onomaMathimatos = firstSplit[1].split(":");
            String [] grades = firstSplit[3].split(":");
            float newGrade = Float.parseFloat(grades[1]);
            //System.out.println(onomaFoititi[1]+","+onomaMathimatos[1]);
            Mathima diorthMathima = findMathimaFromList(onomaMathimatos[1],mathimataList);
            Dilosi diotrhDilosi = findDilosiFromList(onomaFoititi[1], diloseisList);

            //if(diorthMathima != null && diotrhDilosi != null)   System.out.println(diotrhDilosi.getFoititis()+"\nΝΕΟΣ ΒΑΘΜΟΣ\n"+diorthMathima.getTitle()+":"+newGrade);

            grammateia.getCorrectiveGrade(diorthMathima,diotrhDilosi,newGrade);
            grammCntrl.getNewGradeSaved().setText("O neos bathmos "+newGrade+" tou foititi "
                    +diotrhDilosi.getFoititis().getName()+" sto mathima "+diorthMathima.getTitle()+" apothikeutike!");
        });



        //refresh ta mathimata gia allon foititi
        kathiCntrl.getRefreshStudent().setOnAction(e ->{
            kathiCntrl.getOutputFoititi().setText("Εισαγεται νεο ΑΜ φοιτητη");
            kathiCntrl.getInputAM().setText("");
            kathiCntrl.getInputAM().setPromptText("AM");
            kathiCntrl.getListOfCourses().getItems().clear();
        });






        // block kwdika gia na kleisei h efarmogh
        window.setTitle("Pithia");
        window.setScene(loginScene);
        window.show();




    }


    public static void main(String[] args) {
        launch(args);
    }


    //methodos pou ekteleitai otan o kathigitis thelei na balei kainourio bathmo
    private void checkButton(KathigitisCorrectiveGradeController kathiCorrectCntrl,String titlos_mathimatos){
        kathiCorrectCntrl.getYpobolhButton().setOnAction(e ->{
            if(kathiCorrectCntrl.getNewGrade().getText().isEmpty()){
                kathiCorrectCntrl.getYpobolhMessage().setText("PARAKALW EISAGETAI NEO BATHMO");
            }else{
                float newGrade = Float.parseFloat(kathiCorrectCntrl.getNewGrade().getText());
                kathiCorrectCntrl.getYpobolhMessage().setText("ΕΠΙΤΥΧΙΑ! ΣΤΑΛΘΗΚΕ ΑΙΤΗΣΗ ΣΤΗΝ ΓΡΑΜΜΑΤΕΙΑ");
                deli.CreateCorrectiveGrade(correctGrade, titlos_mathimatos,newGrade,grammateia);
            }
        });
    }


    // methodos pou ekteleitai otan fortvnetai to ui gia thn grammateia
    private void populateGrammateiaMain(GrammateiaMainController grammCntrl,String name){
        grammCntrl.getWelcomeMessage().setText("Welcome κ. "+name);
        for(String aitisi : grammateia.getAitiseis()){
            grammCntrl.getAitiseisView().getItems().add(aitisi);

        }

    }

    private Dilosi findDilosiFromList(String  onomaFoititi ,ArrayList<Dilosi> diloseisList){
        Dilosi diorthDilosi = null;
        for(Dilosi d : diloseisList){
            if(d.getFoititis().getName().equals(onomaFoititi)){
                diorthDilosi = d ;
                //System.out.println(diorthDilosi.getFoititis());
                break;
            }
        }

        //System.out.println(diorthDilosi.getFoititis());
        return  diorthDilosi;
    }

    private Mathima findMathimaFromList(String  titlosMathimatos,ArrayList<Mathima> mathimataList) {
        Mathima diorthMathima = null;
        for(Mathima m : mathimataList){
            if(m.getTitle().equals(titlosMathimatos)){
                diorthMathima = m ;
                //System.out.println(diorthMathima.getTitle());
            }
        }

        //System.out.println(diorthMathima.getTitle());
        return  diorthMathima;
    }


}




