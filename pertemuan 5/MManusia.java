/*
 * Nama File      : MManusia.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 23 Maret 2025
 */

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198308282060418002");
        Pengusaha pel = new Pengusaha("Adhy", "01-01-2000", "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Temblang", 500000, "Wonogiri");
        PNS p2 = new PNS("Panji", "01-04-2010", "Jl. Panorama 111", 10000000, "198804212010418002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("===============================\n");

        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pel = " + pel.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("===============================\n");

        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pel = " + pel.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("===============================\n");

        p1.cetakInfo();
        System.out.println("===============================\n");
        pel.cetakInfo();
        System.out.println("===============================\n");
        pt1.cetakInfo();
    }
}