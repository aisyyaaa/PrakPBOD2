/*
 * Nama File      : Petani.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 23 Maret 2025
 */

class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, String tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani ++;
    }
    
    public String getAsalKota() {
        return asalKota;
    }
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }
    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 1;
    }
}