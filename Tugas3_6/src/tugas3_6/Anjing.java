package tugas3_6;

public class Anjing extends Anabul{
    public Anjing(String nama) {
        super(nama);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " melata dan menggonggong.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
}
