/*
 * Nama File      : Titik.java
 * Deskripsi      : berisi atribut dan method dalam class titik
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 21 Februari 2025
 */

public class Titik {
    /***************ATRIBUT***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor unruk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    Titik(double absis, double ordinat) { // tanpa this --> double x, double y
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengecek kuadaran dari sebuah titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        }else if (absis < 0 && ordinat > 0){
            return 2;
        }else if (absis < 0 && ordinat < 0){
            return 3;
        }else if (absis > 0 && ordinat < 0) {
            return 4;
        }else{
            return -1;
        }
    }

    //menghitung jarak titik dari pusat
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    //menghitung jarak 2 titik
    double getJarak(Titik T) {
        return Math.sqrt(Math.pow((absis-T.absis), 2) + Math.pow((ordinat-T.ordinat),2));
    }

    //refleksi dengan sumbu X
    void refleksiX(){
        ordinat = ordinat * -1;
    }

    //refleksi dengan sumbu Y
    void refleksiY(){
        absis = absis * -1;
    }

    //getrefleksi sumbu X
    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    //getrefleksi sumbu Y
    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }

    // void printCounterTitik() {
    //     System.out.println(this.counterTitik);
    // }



} //end class Titik