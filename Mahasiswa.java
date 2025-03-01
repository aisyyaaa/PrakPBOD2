/*
 * Nama File      : Mahasiswa.java
 * Deskripsi      : berisi atribut dan method dalam class mahasiswa
 * Pembuat        : Mutiara Aisyah Salsabila
 * Tanggal        : 28 Februari 2025
 */

public class Mahasiswa{
    /***************ATRIBUT***************/
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul;
    private int jumlahMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***************METHOD***************/
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    //konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    //selektor dan mutator
    public String getnim(){
        return nim;
    }

    public void setnim(String nim){
        this.nim = nim;
    }

    public String getnama(){
        return nama;
    }

    public void setnama(String nama){
        this.nama = nama;
    } 

    public String getprodi(){
        return prodi;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

    public Dosen dosenwali(){
        return dosenWali;
    }

    public void setdosenwali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //menambahkan MK ke array
    public void addmatkul(MataKuliah mataKuliah){
        if (jumlahMatkul < 50){
            listMatkul [jumlahMatkul] = mataKuliah;
            jumlahMatkul++;
        } else{
            System.out.println("Mata kuliah sudah mencapai batas maksimum");
        }
    }

    //mendapat total SKS
    public int getjumlahsks(){
        int totalsks = 0;
        for(int i = 0; i < jumlahMatkul; i++){
            totalsks += listMatkul[i].getsks();
        } return totalsks;
    }

    //menerapkan jumlah matakuliah
    public int getjumlahmatkul(){
        return jumlahMatkul;
    }

    //menampilkan data mahasiswa
    public void printMhs(){
        System.out.println("NIM :" + nim + "\nNama : " + nama + "\nProgram Studi : " + prodi);
    }

    //menampilkan detail mahasiswa 
    public void printDetailMhs()    {
        System.out.println( "NIM : " + nim + "\nNama : " + nama + "\nProgram Studi : " + prodi);
        System.out.println("Mata Kuliah Yang Diambil : ");
        for (int i = 0; i < jumlahMatkul;i++)   {
        System.out.println("- " + listMatkul[i].getnama() + " (" + listMatkul[i].getsks() + " SKS)");
        }
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getnama() : "Belum ditentukan"));
        System.out.println("Kendaraan : " + (kendaraan != null ? kendaraan.getJenis() : "Belum ditentukan"));
    }
}