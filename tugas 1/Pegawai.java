/*
 * Nama File      : Pegawai.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 25 April 2025
 */

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama Pegawai: " + nama + ", Gaji Pokok: Rp " + gajiPokok);
    }
}