public class Proizvod {
    private String naziv;
    private double cijena;

    public Proizvod(String naziv, double cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Proizvod{" +
                "naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }
}
