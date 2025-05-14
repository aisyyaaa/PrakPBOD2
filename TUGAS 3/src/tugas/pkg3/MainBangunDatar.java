package tugas.pkg3;

public class MainBangunDatar {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> persegi = new BangunDatarGenerik<>(new Persegi(5));
        BangunDatarGenerik<PersegiPanjang> pp = new BangunDatarGenerik<>(new PersegiPanjang(4, 6));
        BangunDatarGenerik<Segitiga> segitiga = new BangunDatarGenerik<>(new Segitiga(3, 3, 3));
        BangunDatarGenerik<Lingkaran> lingkaran = new BangunDatarGenerik<>(new Lingkaran(2));

        System.out.println("--- Persegi ---");
        persegi.printInfo();
        System.out.println("--- Persegi Panjang ---");
        pp.printInfo();
        System.out.println("--- Segitiga ---");
        segitiga.printInfo();
        System.out.println("--- Lingkaran ---");
        lingkaran.printInfo();
    }
}
