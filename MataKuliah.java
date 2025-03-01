/*
 * Nama File      : MataKuliah.java
 * Deskripsi      : berisi atribut dan method dalam class mata kuliah
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class MataKuliah{
    /***************ATRIBUT***************/
    private String idMatkul;
    private String nama;
    private int sks;

    /***************METHOD***************/
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor
    public String getidMatkul() {
        return idMatkul;
    }

    public String getnama() {
        return nama;
    }

    public int getsks() {
        return sks;
    }

    //mutator
    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setsks(int sks) {
        this.sks = sks;
    }
}