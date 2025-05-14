package tugas3_6;

public class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " sedang bergerak...");
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara...");
    }
}
