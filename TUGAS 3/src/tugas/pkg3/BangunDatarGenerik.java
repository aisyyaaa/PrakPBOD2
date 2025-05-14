package tugas.pkg3;

public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;
    public BangunDatarGenerik(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public void printInfo() {
        System.out.println("Luas: " + bangunDatar.getLuas());
        System.out.println("Keliling: " + bangunDatar.getKeliling());
    }

    public T getBangunDatar() {
        return bangunDatar;
    }
}
