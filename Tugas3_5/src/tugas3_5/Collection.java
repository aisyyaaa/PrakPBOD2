package tugas3_5;

public class Collection<T> {
    private T[] wadah;       // Array penampung elemen
    private int capacity;    // Kapasitas maksimum array
    private int count;       // Jumlah elemen saat ini

    @SuppressWarnings("unchecked")
    public Collection(int capacity) {
        this.capacity = capacity;
        this.wadah = (T[]) new Object[capacity];
        this.count = 0;
    }

    public T getAt(int index) {
        if (index >= 0 && index < count) {
            return wadah[index];
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public void setAt(int index, T newVal) {
        if (index >= 0 && index < count) {
            wadah[index] = newVal;
            return;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(T element) {
        if (!isFull()) {
            wadah[count++] = element;
        } else {
            throw new RuntimeException("Collection is full");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[count - 1] = null;
            count--;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void showAll() {
        System.out.print("Isi koleksi: ");
        for (int i = 0; i < count; i++) {
            System.out.print(wadah[i] + " ");
        }
        System.out.println();
    }
}
