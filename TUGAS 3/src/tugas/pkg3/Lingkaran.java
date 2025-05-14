package tugas.pkg3;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double getJejari() {
        return jejari;
    }

    public void setJejari(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double getLuas() {
        return 3.14 * jejari * jejari;
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * jejari;
    }
}
