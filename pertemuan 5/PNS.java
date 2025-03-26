/*
 * Nama File      : PNS.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 23 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }
    
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return super.hitungMasaKerja() + 9;
    }   
}