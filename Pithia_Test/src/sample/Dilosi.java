package sample;

public class Dilosi {

    Mathima [] mathimata;
    private char akadEksam;
    private float [] vathmos;
    private Foititis foititis;

    public Dilosi(Mathima [] mathimata , char eksam , float [] vathmos , Foititis foititis){
        this.mathimata = mathimata;
        this.akadEksam = eksam;
        this.vathmos = vathmos;
        this.foititis = foititis;
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

    public Foititis getFoititis() {
        return foititis;
    }

    public void setFoititis(Foititis foititis) {
        this.foititis = foititis;
    }
}
