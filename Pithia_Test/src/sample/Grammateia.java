package sample;

import java.util.ArrayList;

public class Grammateia implements validateCorrectiveGrade {

    private String name;

    private ArrayList<String> aitiseis;

    public Grammateia(String name, ArrayList<String> aitiseis) {
        this.name = name;
        this.aitiseis = aitiseis;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAitiseis() {
        return aitiseis;
    }

    public void setName(String name) {
        this.name = name;

    }


    //exw kanei kapoies allages stis parametrous
    @Override
    public float getCorrectiveGrade( Mathima mathima, Dilosi correctDilosi, float vathmos) {
        for(int i=0;i<correctDilosi.mathimata.length;i++){
            if(mathima == correctDilosi.mathimata[i]){
                correctDilosi.setIndexVathmos(vathmos,i);
                break;
            }
        }
        for(int i=0;i<correctDilosi.getVathmos().length;i++){
            System.out.println(correctDilosi.getIndexVathmos(i));
        }
        return vathmos;
    }
}


