/*
 * Nama File      : MDosen.java
 * Deskripsi      : main class dosen
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class MDosen{
    public static void main(String[] args){
        Dosen D01 = new Dosen();
        D01.setnip("314158");
        D01.setnama("Suparman");
        D01.setprodi("Informatika");

        System.out.println("NIP: " + D01.getnip());
        System.out.println("Nama: " + D01.getnama());
        System.out.println("Program Studi: " + D01.getnip());

        Dosen D02 = new Dosen("319432", "Marto", "Biologi");
        System.out.println("\nNIP: " + D02.getnip());
        System.out.println("Nama: " + D02.getnama());
        System.out.println("Program Studi: " + D02.getprodi());
    }
}