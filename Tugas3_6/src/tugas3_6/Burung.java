package tugas3_6;

public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " terbang di udara.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit!");
    }
}