/*
 * Nama File      : Garis.java
 * Deskripsi      : berisi atribut dan method dalam class garis
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 21 Februari 2025
 */

public class Garis{
    /***************ATRIBUT***************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /***************METHOD***************/
    //Konstruktor dengan titik awal (0,0) dan titik akhir (1,1).
    garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    //Konstruktor garis dengan parameter titik awal dan titik akhir
    garis(titikAwal,titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //mengembalikan titik awal
    Titik getTitikAwal(){
        return titikAwal;
    }

    //mengembalikan titik akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }

    //set titik awal dengan titik baru
    void setTititkAwal(Titik T){
        titikAwal = T;
    }

    //set titik akhir dengan titik baru
    void setTititkAkhir(Titik T){
        titikAkhir = T;
    }

    //atribut static counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    //menghitung panjang garis
    double panjangGaris(){
         return Math.sqrt(Math.pow((titikAwal.getAbsis()-titikAkhir.getAbsis()), 2) + Math.pow((titikAwal.getOrdinat()-titikAkhir.getOrdinat()),2));
    }

    //mencari gradien garis
    double gradienGaris(){
        return (titikAwal.getOrdinat()-titikAkhir.getOrdinat())/(titikAwal.getAbsis()-titikAkhir.getAbsis());
    }

    //mencari titik tengah garis
    Titik tengahGaris(){
        return new Titik((titikAwal.getAbsis()+titikAkhir.getAbsis())/2 , (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    //cek apakah garis tersebut sejajar dengan sebuah garis lain
    boolean cekSejajar(Garis G){
        return gradienGaris() == G.gradienGaris();
    }

    //cek apakah garis tersebut tegak lurus dengan sebuah garis lain
    boolean cekTegakLurus(Garis G){
        return gradienGaris() * G.gradienGaris() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    void printGaris() {
        System.out.print("Titik awal : " );
        titikAwal.printTitik();
        System.out.print("Titik akhir : ");
        titikAkhir.printTitik();
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c
    void printPersamaan(){
        double c = titikAwal.getOrdinat() - (titikAwal.getAbsis() * gradienGaris());
        System.out.print("y = " + gradienGaris() + ".x + ");
        System.out.println(c);
    }

    //end class Garis
}