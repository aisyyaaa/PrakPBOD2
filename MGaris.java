/*
 * Nama File      : MGaris.java
 * Deskripsi      : main class Garis
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 21 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.printGaris();
        G1.getTitikAwal();
        G1.getTitikAkhir();

        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(5, 10);
        
        G1.setTitikAwal(T1);
        G1.setTitikAkhir(T2);
        G1.printGaris();

        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());

        System.out.println("Panjang Garis G1 adalah " + G1.panjangGaris());
        System.out.println("Gradien Garis G1 adalah " + G1.gradienGaris());
        System.out.print("Titik Tengah Garis G1 adalah ");
        G1.tengahGaris().printTitik();

        Garis G2 = new Garis(T1, T2);
        System.out.println("Apakah G1 dan G2 sejajar? " + G1.cekSejajar(G2));
        System.out.println("Apakah G1 dan G2 tegak lurus? " + G1.cekTegakLurus(G2));

        System.out.print("Persamaan Garis G1 : ");
        G1.printPersamaan();

    }
}