// Time Complexity: O(n)
// Space Complexity: O(n)

public class DeleteFromIndex {

    static int[] delete(int[] arr, int index) {
        if (arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n - 1];

        int i = 0;

        while (i < index) {
            result[i] = arr[i];
            i++;
        }

        while (i < n - 1) {
            result[i] = arr[i + 1];
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = 2;

        int[] result = delete(arr, index);

        System.out.print("Array after deletion: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}