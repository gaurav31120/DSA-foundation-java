// Time Complexity: O(n)
// Space Complexity: O(n)

public class ShiftElementsRight {

    static int[] shift(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[arr.length];

        result[0] = 0;

        // Shift elements one position right.
        for (int i = 0; i < arr.length - 1; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int[] result = shift(arr);

        System.out.print("Array after shifting right: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    // Output:
    // Array after shifting right: 0 10 20 30 40
}