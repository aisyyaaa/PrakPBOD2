/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihamedium;

/**
 *
 * @author sal
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");

    if (!isAdaPeluru()) {
        System.out.println("Peluru Habis");
        return;
    }

    for (int i = 0; i < jumlah; i++) {
        if (isAdaPeluru()) {
            System.out.println(senjata.getBunyi());
            senjata.setPeluru(senjata.getPeluru() - 1);
        } else {
            System.out.println("Gagal tembak, Peluru Habis");
        }
    }
    System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        if (senjata.getMenusuk()) {
            System.out.println("Menusuk dengan bayonet!");
        } else {
            System.out.println("Tidak ada bayonet terpasang!");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
