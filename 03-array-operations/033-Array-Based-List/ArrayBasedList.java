// Time Complexity:
// add()     → O(n) worst case, O(1) amortized
// get()     → O(1)
// set()     → O(1)
// remove()  → O(n)
// size()    → O(1)
// isEmpty() → O(1)
//
// Space Complexity: O(n)

public class ArrayBasedList {

    private int[] data;
    private int size;

    ArrayBasedList() {
        data = new int[2];
        size = 0;
    }

    void add(int value) {
        if (size == data.length) {
            resize();
        }

        data[size] = value;
        size++;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];

        // Copy existing elements.
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    int get(int index) {
        checkIndex(index);
        return data[index];
    }

    void set(int index, int value) {
        checkIndex(index);
        data[index] = value;
    }

    int remove(int index) {
        checkIndex(index);

        int removed = data[index];

        // Shift elements left after removal.
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;

        return removed;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public static void main(String[] args) {
        ArrayBasedList list = new ArrayBasedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, 25);

        System.out.println("Element at index 1 after set: " + list.get(1));

        int removed = list.remove(0);

        System.out.println("Removed element: " + removed);
        System.out.println("Element at index 0 after removal: " + list.get(0));
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
    }

    // Output:
    // Element at index 1: 20
    // Element at index 1 after set: 25
    // Removed element: 10
    // Element at index 0 after removal: 25
    // Size: 2
    // Is empty: false
}