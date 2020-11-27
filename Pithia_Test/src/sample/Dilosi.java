package sample;



import java.util.ArrayList;


public class Dilosi {

    Mathima [] mathimata;
    private char akadEksam;
    private float [] vathmos;
    private Foititis foititis;

    public Dilosi(Foititis foititis , Mathima [] mathimata , char eksam , float [] vathmoi ){
        this.mathimata = mathimata;
        this.akadEksam = eksam;
        this.vathmos = vathmoi;
        this.foititis = foititis;
    }

    public Dilosi(){}


    // alaksa auto pou epistrefei h getCourses
    public ArrayList<String> getCoures(){
        ArrayList<String> courses = new ArrayList<>();
        for(Mathima mathima : mathimata){
            courses.add(mathima.getTitle());
        }
        return courses;
    }


    public char getAkadEksam() {
        return akadEksam;
    }

    public void setAkadEksam(char akadEksam) {
        this.akadEksam = akadEksam;
    }

    public float [] getVathmos() {
        return vathmos;
    }

    public void setVathmos(float  [] vathmos) {
        this.vathmos = vathmos;
    }

    public void setIndexVathmos(float newGrade,int i){this.vathmos[i] = newGrade;}

    public float getIndexVathmos(int i ){ return vathmos[i];}

    public Foititis getFoititis() {
        return foititis;
    }

    public void setFoititis(Foititis foititis) {
        this.foititis = foititis;
    }


    public String toString(){
        return this.foititis.toString() +"\n"+this.mathimata.toString()+this.vathmos.toString();
    }
}
