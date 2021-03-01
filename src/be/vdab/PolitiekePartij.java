package be.vdab;

public class PolitiekePartij {
    private String naam;
    private int aantalLeden;

    public PolitiekePartij(String naam, int aantalLeden) {
        setNaam(naam);
        setAantalLeden(aantalLeden);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null && !naam.isEmpty()) {
            this.naam = naam;
        }
    }

    public int getAantalLeden() {
        return aantalLeden;
    }

    public void setAantalLeden(int aantalLeden) {
        if (aantalLeden>0) {
            this.aantalLeden = aantalLeden;
        }
    }


}
