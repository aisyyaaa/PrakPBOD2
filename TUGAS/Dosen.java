/*
 * Nama File      : Dosen.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 17 Maret 2025
 */

import java.time.LocalDate;

public class Dosen extends Pegawai{
    private String Fakultas;
    public Dosen (){
    }

    public Dosen(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT, double gajiPokok, String Fakultas){
        super(NIP, nama, tanggal_lahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas(){
        return Fakultas;
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + Fakultas);
    }
}
