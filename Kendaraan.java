/*
 * Nama File      : Kendaraan.java
 * Deskripsi      : berisi atribut dan method dalam class kendaraan
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class Kendaraan{
    /***************ATRIBUT***************/
    private String plat;
    private String jenis;

    /***************METHOD***************/
    //konsruktor
    public Kendaraan(){
        this.plat = "";
        this.jenis = "";
    }

    public Kendaraan (String plat, String jenis){
        this.plat = plat;
        this.jenis = jenis;
    }

    //selektor
    public String getPlat(){
        return plat;
    }

    public String getJenis(){
        return jenis;
    }

    //mutator
    public void setPlat(String plat){
        this.plat = plat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}