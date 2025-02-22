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
    //konstruktor dengan parameter
    Garis(Titik P1, Titik P2){
        titikAwal = P1;
        titikAkhir = P2;
        counterGaris++;
    }

    //konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    Garis(){
        this(new Titik(0,0),new Titik(1,1));
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
    void setTitikAwal(Titik T){
        titikAwal = T;
    }

    //set titik akhir dengan titik baru
    void setTitikAkhir(Titik T){
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