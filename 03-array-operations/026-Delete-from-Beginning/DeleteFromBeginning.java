// Time Complexity: O(n)
// Space Complexity: O(n)

public class DeleteFromBeginning {

    static int[] delete(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i + 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        int[] result = delete(arr);

        System.out.print("Array after deletion: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}