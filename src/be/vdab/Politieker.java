package be.vdab;

public class Politieker extends Persoon{
    private PolitiekePartij partij;

    public Politieker(String voornaam, String familienaam, PolitiekePartij partij) {
        super(voornaam, familienaam);
        this.partij = partij;
    }

    public PolitiekePartij getPartij() {
        return partij;
    }

    public void setPartij(PolitiekePartij partij) {
        this.partij = partij;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + "Politieke Partij='" + partij.getNaam() + '\'' + ", Aantal Leden=" + partij.getAantalLeden();
    }
}
