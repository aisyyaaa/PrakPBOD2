/*
 * Nama File      : Pegawai.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 17 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(){
    }

    public Tendik (String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public double getTunjangan() {
        int masaKerja = Period.between(getTMT(), LocalDate.now()).getYears();
        return 0.01 * masaKerja * getGajiPokok();
    }

@Override
public void printInfo() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
    super.printInfo();
    System.out.println("Bidang          : " + bidang);
    System.out.println("Jabatan         : Tendik");
    System.out.println("Masa Kerja      : " + getMasaKerja());
    System.out.println("BUP             : " + getBUP(60).format(formatter)); // Assuming BUP is calculated with a retirement age of 60
    System.out.println("Tunjangan       : " + formatRupiah(getTunjangan()));
}
}
