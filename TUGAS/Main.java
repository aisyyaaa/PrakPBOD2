/*
 * Nama File      : Main.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 17 Maret 2025
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap("4629104839", "78647324", "Diandra", 
            LocalDate.of(1990, 5, 5), LocalDate.of(2013, 1, 1), 6000000, 
            "Fakultas Sains dan Matematika");
        dt.printInfo();

        System.out.println();

        DosenTamu dtm = new DosenTamu("165930281", "DT-789", "Nurul", 
            LocalDate.of(1985, 8, 10), LocalDate.of(2020, 6, 4), 8000000, 
            "Fakultas Teknik", LocalDate.of(2026, 12, 1));
        dtm.printInfo();

        System.out.println();

        Tendik tendik = new Tendik("265920", "Briana", LocalDate.of(1985, 6, 19), 
            LocalDate.of(2015, 7, 1), 7000000, "Administrasi");
        tendik.printInfo();
    }
}
