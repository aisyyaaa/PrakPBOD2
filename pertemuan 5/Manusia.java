/*
 * Nama File      : Manusia.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 23 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;


    public Manusia(String nama, String tglMulaiKerja,  String alamat, double pendapatan) {
        this.nama = nama;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.tglMulaiKerja = LocalDate.parse(tglMulaiKerja, formatter);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns ++;
    }

    // Selector dan mutator
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama;
    }

    public LocalDate getTglMulai() {
        return tglMulaiKerja; 
    }
    public void settgl_mulai_kerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja= tglMulaiKerja; 
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    
    public int hitungMasaKerja () {
        return (int) ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }
    public static int getCounterMns() {
        return counterMns;
    }
    public void cetakInfo() {
        System.out.println("nama: " + nama);
        System.out.println("tanggal mulai: " + tglMulaiKerja);
        System.out.println("alamat: " + alamat);
        System.out.println("pendapatan: " + pendapatan);
    }
}