// Time Complexity: O(n)
// Space Complexity: O(1)

public class MoveZeros {

    static int[] moveZeros(int[] arr) {

        int j = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill remaining positions with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int[] result = moveZeros(arr);

        System.out.print("Array after moving zeros: ");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}