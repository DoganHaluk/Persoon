package be.vdab;

class Persoon {
    private String voornaam;
    private String familienaam;

    public Persoon(String voornaam, String familienaam) {
        setVoornaam(voornaam);
        setFamilienaam(familienaam);
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam){
        if (voornaam != null && !voornaam.isEmpty()) {
            this.voornaam = voornaam;
        }else{
            throw new NaamException("Voornaam mag niet leeg zijn");
        }
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam){
        if (familienaam != null && !familienaam.isEmpty()) {
            this.familienaam = familienaam;
        } else{
            throw new NaamException("Achternaam mag niet leeg zijn");
        }
    }

    @Override
    public String toString() {
        return voornaam + " " + familienaam;
    }
}
