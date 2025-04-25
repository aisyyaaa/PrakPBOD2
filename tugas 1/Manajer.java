/*
 * Nama File      : Manajer.java
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 25 April 2025
 */


public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: Rp " + (tunjangan));
        System.out.println("Total Gaji: Rp " + (gajiPokok + tunjangan));
    }
}

/*
2. Manfaat polimorfisme pada kasus ini adalah memungkinkan untuk menyimpan 1 preferensi 
tipe (pegawai) untuk menyimpan objek dari subclass sehingga kode menjadi lebih sederhana, 
saat ingin menambahkan subclass lagi tidak perlu merombak seluruh main class. Selain itu, 
method tampilData() akan menyesuaikan dengan tipe objek aktual sehingga tidak perlu casting manual.
3. Jika tidak menggunakan polimorfisme maka harus membuat arrayList khusus untuk setiap tipe, 
dan juga harus melakukan perulangan terpisah untuk setiap jenis subclass. 
 */