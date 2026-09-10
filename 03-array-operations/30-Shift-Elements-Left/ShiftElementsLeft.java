// Time Complexity: O(n)
// Space Complexity: O(n)

public class ShiftElementsLeft {

    static int[] shift(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[arr.length - 1];

        // Copy elements one position to the left.
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int[] result = shift(arr);

        System.out.print("Array after shifting left: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    // Output:
    // Array after shifting left: 20 30 40 50
}