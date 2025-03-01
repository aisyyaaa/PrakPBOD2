/*
 * Nama File      : Garis.java
 * Deskripsi      : Atribut dan method dalam class garis
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class Garis{
    /***************ATRIBUT***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /***************METHOD***************/
    //konstruktor dengan parameter
    public Garis(Titik P1, Titik P2){
        titikAwal = P1;
        titikAkhir = P2;
        counterGaris++;
    }

    //konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis(){
        this(new Titik(0,0),new Titik(1,1));
    }

    //mengembalikan titik awal
    public Titik getTitikAwal(){
        return titikAwal;
    }

    //mengembalikan titik akhir
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    //set titik awal dengan titik baru
    public void setTitikAwal(Titik T){
        titikAwal = T;
    }

    //set titik akhir dengan titik baru
    public void setTitikAkhir(Titik T){
        titikAkhir = T;
    }

    //atribut static counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    //menghitung panjang garis
    public double panjangGaris(){
         return Math.sqrt(Math.pow((titikAwal.getAbsis()-titikAkhir.getAbsis()), 2) + Math.pow((titikAwal.getOrdinat()-titikAkhir.getOrdinat()),2));
    }

    //mencari gradien garis
    public double gradienGaris(){
        return (titikAwal.getOrdinat()-titikAkhir.getOrdinat())/(titikAwal.getAbsis()-titikAkhir.getAbsis());
    }

    //mencari titik tengah garis
    public Titik tengahGaris(){
        return new Titik((titikAwal.getAbsis()+titikAkhir.getAbsis())/2 , (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2);
    }

    //cek apakah garis tersebut sejajar dengan sebuah garis lain
    public boolean cekSejajar(Garis G){
        return gradienGaris() == G.gradienGaris();
    }

    //cek apakah garis tersebut tegak lurus dengan sebuah garis lain
    public boolean cekTegakLurus(Garis G){
        return gradienGaris() * G.gradienGaris() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.print("Titik awal : " );
        titikAwal.printTitik();
        System.out.print("Titik akhir : ");
        titikAkhir.printTitik();
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c
    public void printPersamaan(){
        double c = titikAwal.getOrdinat() - (titikAwal.getAbsis() * gradienGaris());
        System.out.print("y = " + gradienGaris() + ".x + ");
        System.out.println(c);
    }

    //end class Garis
}