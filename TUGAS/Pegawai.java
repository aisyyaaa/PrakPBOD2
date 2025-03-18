/*
 * Nama File      : Pegawai.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 17 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;
import java.text.NumberFormat;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(){
    }

    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggal_lahir(){
        return tanggal_lahir;
    } 

    public void setTanggal_lahir(LocalDate tanggal_lahir){
        this.tanggal_lahir = tanggal_lahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public String getFormattedDate(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, new Locale("id", "ID")) + " " + date.getYear();
    }

    public String getMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public LocalDate getBUP(int usiaPensiun) {
        LocalDate bup = tanggal_lahir.plusYears(usiaPensiun);
        return LocalDate.of(bup.getYear(), bup.getMonth().plus(1).getValue(), 1);
    }

    public String formatRupiah(double amount) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(amount);
    }

    public void printInfo() {
        System.out.println("NIP             : " + NIP);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + getFormattedDate(tanggal_lahir));
        System.out.println("TMT             : " + getFormattedDate(TMT));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));
    }
}
