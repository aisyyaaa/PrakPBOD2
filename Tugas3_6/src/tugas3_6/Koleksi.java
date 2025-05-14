package tugas3_6;

public class Koleksi<T> {
    private T[] wadah;
    private int nbelm;

    @SuppressWarnings("unchecked")
    public Koleksi(int kapasitas) {
        wadah = (T[]) new Object[kapasitas];
        nbelm = 0;
    }

    public void add(T item) {
        if (nbelm < wadah.length) {
            wadah[nbelm++] = item;
        } else {
            System.out.println("Koleksi penuh!");
        }
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        }
        return null;
    }

    public int getSize() {
        return nbelm;
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            T item = getIsi(i);
            if (item instanceof Anabul) {
                Anabul a = (Anabul) item;
                System.out.println("Nama: " + a.getNama());
                a.bersuara();
                a.gerak();
                System.out.println("---");
            }
        }
    }
}