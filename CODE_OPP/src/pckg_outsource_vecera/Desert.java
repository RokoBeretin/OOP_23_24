package pckg_outsource_vecera;

public class Desert {

    private String naziv;
    private int kol;


    public Desert(String naziv, int kol){
        this.kol = kol;
        this.naziv = naziv;
    }

    public void infoDesert(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", kol=" + kol +
                '}';
    }
}
