package sample;

public class Mathima {

    private int kodikos ;
    private String title;
    private String perigrafh;

    public Mathima(int kodikos,String title,String perigrafh){
        this.kodikos = kodikos;
        this.title = title;
        this.perigrafh = perigrafh;
    }


    public Mathima(){}

    public int getKodikos() {
        return kodikos;
    }

    public void setKodikos(int kodikos) {
        this.kodikos = kodikos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerigrafh() {
        return perigrafh;
    }

    public void setPerigrafh(String perigrafh) {
        this.perigrafh = perigrafh;
    }



    public String toString(){
        return "Kwdikos Mathimatos:"+kodikos+"\nTitlos Mathiamtos:"+title;
    }
}
