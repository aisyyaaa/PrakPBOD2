package tugas3_5;

public class GenericCollection {
    public static void main(String[] args) {
        Collection<Character> koleksiHuruf = new Collection<>(10);

        // Menambahkan huruf ke koleksi
        try {
            koleksiHuruf.add('A');
            koleksiHuruf.add('I');
            koleksiHuruf.add('C');
            koleksiHuruf.add('C');
            koleksiHuruf.add('Y');
            koleksiHuruf.add('A');
            koleksiHuruf.add('Y');
            koleksiHuruf.add('Y');
            koleksiHuruf.add('Y');
            koleksiHuruf.add('Z');
        } catch (RuntimeException e) {
            System.out.println("Error saat menambahkan: " + e.getMessage());
        }

        koleksiHuruf.showAll();

        // Mengubah elemen indeks ke-2 jadi 'Z'
        try {
            koleksiHuruf.setAt(2, 'Z');
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error saat mengedit: " + e.getMessage());
        }

        koleksiHuruf.showAll();

        // Mengambil elemen indeks ke-1
        try {
            char x = koleksiHuruf.getAt(1);
            System.out.println("Elemen pada indeks 1: " + x);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error saat mengambil isi: " + e.getMessage());
        }

        // Menghapus elemen indeks ke-0
        try {
            koleksiHuruf.delete(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error saat menghapus: " + e.getMessage());
        }

        koleksiHuruf.showAll();
        System.out.println("Jumlah elemen saat ini: " + koleksiHuruf.getCount());
    }
}