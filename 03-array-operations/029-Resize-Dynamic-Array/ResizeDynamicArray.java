// Time Complexity: O(n)
// Space Complexity: O(n)

public class ResizeDynamicArray {

    static int[] resize(int[] arr, int capacity) {
        int[] result = new int[capacity];

        // Copy elements that fit in the new array.
        int elementsToCopy = Math.min(arr.length, capacity);

        for (int i = 0; i < elementsToCopy; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int capacity = 5;

        int[] result = resize(arr, capacity);

        System.out.print("Resized array: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    // Output:
    // Resized array: 10 20 30 0 0
}