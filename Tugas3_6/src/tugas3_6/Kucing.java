package tugas3_6;

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata dengan lincah.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}