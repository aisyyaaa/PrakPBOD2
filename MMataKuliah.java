/*
 * Nama File      : MMataKuliah.java
 * Deskripsi      : main class mata kuliah
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class MMataKuliah{
    public static void main(String[] args){
        MataKuliah MK01 = new MataKuliah();
        MK01.setidMatkul("PBOD24");
        MK01.setnama("PBOD");
        MK01.setsks(4);

        System.out.println("ID Mata Kuliah : " + MK01.getidMatkul());
        System.out.println("Nama : " + MK01.getnama());
        System.out.println("Jumlah SKS : " + MK01.getsks());
        
        System.out.println("\n");

        MataKuliah MK02 = new MataKuliah("PBOE24", "PBOE", 4);
        System.out.println("ID Mata Kuliah : " + MK02.getidMatkul());
        System.out.println("Nama : " + MK02.getnama());
        System.out.println("Jumlah SKS : " + MK02.getsks());
    }
}