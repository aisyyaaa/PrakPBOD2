/*
 * Nama File      : MKendaraan.java
 * Deskripsi      : main class Kendaraan
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class MKendaraan{
    public static void main(String[] args){
        Kendaraan K01 = new Kendaraan();
        K01.setPlat("H 415 Y");
        K01.setJenis("Mobil");

        System.out.println("Plat Nomor : " + K01.getPlat());
        System.out.println("Jenis Kendaraan : " + K01.getJenis());

        Kendaraan K02 = new Kendaraan("H 41 S","Truk");
        System.out.println("Plat Nomor : " + K02.getPlat());
        System.out.println("Jenis Kendaraan : " + K02.getJenis());
    }
}