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
    public void CreateCorrectiveGrade(Foititis foititis, String mathima,float vathmos,Grammateia grammateia) {
        String from=this.name;
       grammateia.getAitiseis().add("from:"+from+",in:"+mathima+",for:"+foititis.getName()+",Grade:"+vathmos);

    }


    public Foititis findFoititi(int AM,Foititis [] foitites){
        Foititis temp = null;

        for(int i=0;i<foitites.length;i++){
            if(AM == foitites[i].getAM()){
                temp = foitites[i];
            }
        }
        return temp;
    }

    public Dilosi findDilosiFoititi(Foititis correctGrade,Dilosi [] diloseis){
        Dilosi temp = null;

        for(int i=0; i<diloseis.length ; i++){
            if(correctGrade == diloseis[i].getFoititis()){
                temp = diloseis[i];
            }
        }
        return temp;
    }

}
