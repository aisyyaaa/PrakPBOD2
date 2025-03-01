/*
 * Nama File      : MMahasiswa.java
 * Deskripsi      : main class mahasiswa
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class MMahasiswa{
    public static void main(String[] args){
        Mahasiswa MHS01 = new Mahasiswa();
        MHS01.setnim("24060123120001");
        MHS01.setnama("Ian Najib");
        MHS01.setprodi("Informatika");

        MataKuliah MK03 = new MataKuliah();
        MK03.setnama("PBOA");
        MK03.setsks(4);
        MHS01.addmatkul(MK03);

        MataKuliah MK04 = new MataKuliah();
        MK03.setnama("GKVA");
        MK03.setsks(3);
        MHS01.addmatkul(MK04);

        Dosen DW01 = new Dosen();
        DW01.setnama("Birdie");
        MHS01.setdosenwali(DW01);

        Kendaraan kendaraan = new Kendaraan();
        kendaraan.setJenis("Becak");

        MHS01.printDetailMhs();
        System.out.println("Jumlah SKS : " + MHS01.getjumlahmatkul());
        System.out.println("Jumlah Matakuliah : " + MHS01.getjumlahmatkul());
        System.out.println("\n");
        
        Mahasiswa MHS02 = new Mahasiswa("24060123140119", "Mutiara", "Informatika");
        Dosen DW02 = new Dosen("314098", "Angela", "Informatika");
        MHS02.setdosenwali(DW02);
        MataKuliah MK05 = new MataKuliah("ASAC2025", "ASAC", 3);
        MataKuliah MK06 = new MataKuliah("OAKD2025","OAKD", 3);
        MHS02.addmatkul(MK05);
        MHS02.addmatkul(MK06);

        MHS02.printDetailMhs();
        System.out.println("Jumlah SKS : " + MHS02.getjumlahmatkul());
        System.out.println("Jumlah Matakuliah : " + MHS02.getjumlahmatkul());
    }
}