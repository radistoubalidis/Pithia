package sample;

public class Kathigitis implements CorrectiveGrade{

    private String name ;
    private String speciality;

    public Kathigitis(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    @Override
    public void CreateCorrectiveGrade(int AM, Mathima Mathima , float newGrade) {
        // code 
    }


    public Foititis findFoititi(int AM,Foititis [] foitites){
        Foititis temp = null;

        for(int i=0;i<foitites.length;i++){
            if(AM == foitites[i].getAM()){
                temp = foitites[i];
                break;
            }
            break;
        }
        return temp;
    }

}
