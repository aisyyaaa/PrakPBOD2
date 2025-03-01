/*
 * Nama File      : MTitik.java
 * Deskripsi      : main class Titik
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik (2,3);
        T3.printTitik(); 

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    
        System.out.println("Letak T1 di kuadran " + T1.getKuadran());
        System.out.println("Jarak T1 dengan pusat =  " + T1.getJarakPusat());
        System.out.println("Jarak T1 dengan suatu titik =  " + T1.getJarak(T3));
        T1.refleksiX();
        System.out.print("T1 setelah refleksi dengan sumbu X : ");
        T1.printTitik();
        T1.refleksiY();
        System.out.print("T1 setelah refleksi dengan sumbu Y : ");
        T1.printTitik();

        Titik T4 = T3.getRefleksiX();
        Titik T5 = T3.getRefleksiY();

        System.out.print("T3 setelah refleksi dengan sumbu X : " );
        T4.printTitik();
        System.out.print("T3 setelah refleksi dengan sumbu Y : " );
        T5.printTitik();
    }
}