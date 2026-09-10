// Time Complexity: O(n) amortized for add()
// Space Complexity: O(n)

public class ImplementDynamicArray {

    private int[] data;
    private int size;

    ImplementDynamicArray() {
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        return data[index];
    }

    int size() {
        return size;
    }

    int capacity() {
        return data.length;
    }

    public static void main(String[] args) {
        ImplementDynamicArray dynamicArray = new ImplementDynamicArray();

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        System.out.println("Element at index 0: " + dynamicArray.get(0));
        System.out.println("Element at index 1: " + dynamicArray.get(1));
        System.out.println("Element at index 2: " + dynamicArray.get(2));
        System.out.println("Size: " + dynamicArray.size());
        System.out.println("Capacity: " + dynamicArray.capacity());
    }

    // Output:
    // Element at index 0: 10
    // Element at index 1: 20
    // Element at index 2: 30
    // Size: 3
    // Capacity: 4
}