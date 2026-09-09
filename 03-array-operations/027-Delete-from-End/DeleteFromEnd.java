// Time Complexity: O(n)
// Space Complexity: O(n)

public class DeleteFromEnd {

    static int[] delete(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            result[i] = arr[i];
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