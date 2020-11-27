package sample;

public class Foititis {

    private int AM;
    private String name;
    private String email;

    public Foititis(int am,String name,String email){
        this.AM = am;
        this.name = name;
        this.email = email;
    }

    public Foititis(){}



    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.name+","+this.AM+","+this.email;
    }





}
