import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap("9545647548", "78647324", "Andi", 
            LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, 
            "Fakultas Sains dan Matematika");
        dt.printInfo();

        System.out.println();

        DosenTamu dtm = new DosenTamu("123456789", "DT-789", "Budi", 
            LocalDate.of(1985, 8, 10), LocalDate.of(2020, 2, 15), 7000000, 
            "Fakultas Teknik", LocalDate.of(2026, 12, 1));
        dtm.printInfo();

        System.out.println();

        Tendik tendik = new Tendik("567890", "Siti", LocalDate.of(1985, 4, 15), 
            LocalDate.of(2015, 7, 1), 6000000, "Administrasi");
        tendik.printInfo();
    }
}