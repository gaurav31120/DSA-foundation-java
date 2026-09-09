// Time Complexity: O(n)
// Space Complexity: O(1)

public class RotateArray {

    static int[] rotate(int[] arr) {

        if (arr.length == 0) {
            return arr;
        }

        int last = arr[arr.length - 1];

        // Shift elements one position to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] rotated = rotate(arr);

        System.out.print("Rotated array: ");

        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}