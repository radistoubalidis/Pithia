package sample;

public class Grammateia implements validateCorrectiveGrade{

    private String name ;

    public Grammateia(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCorrectiveGrade(int AM, Mathima mathima) {

    }
}
