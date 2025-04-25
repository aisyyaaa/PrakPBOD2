/*
 * Nama File      : Programmer.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 25 April 2025
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total Gaji: Rp " + (gajiPokok + bonus));
    }
}