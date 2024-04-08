package pckg_outsource_vecera;

public class Predjelo {
    String naziv;
    String vrsta;
    int kol;



    public Predjelo(String naziv, String vrsta, int kol){
        this.kol = kol;
        this.naziv = naziv;
        this.vrsta = vrsta;
    }
    public void pojediPredjeloGas(){
        System.out.println("Pojedeno - " + getClass().getSimpleName() + " / " + naziv + " / " + "kol: " + kol);
    }

    public int kojaKolicina(){
        return kol;
    }


}
