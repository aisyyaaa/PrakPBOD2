package tugas3_6;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksi = new Koleksi<>(10);

        koleksi.add(new Kucing("Oyen"));
        koleksi.add(new Anjing("Doggy"));
        koleksi.add(new Burung("Bejo"));
        koleksi.add(new Kucing("Milo"));
        koleksi.add(new Burung("Caca"));
        koleksi.add(new Anjing("Max"));
        koleksi.add(new Burung("Rio"));
        koleksi.add(new Kucing("Kitty"));
        koleksi.add(new Anjing("Bruno"));
        koleksi.add(new Burung("Jeremy"));
        koleksi.add(new Burung("Tweety")); //Tidak muncul karena index ke 10

        System.out.println("--- Koleksi Anabul ---");
        koleksi.showAll();
    }
}
