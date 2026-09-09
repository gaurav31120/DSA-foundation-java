// Time Complexity: O(n)
// Space Complexity: O(n)

public class InsertAtEnd {

    static int[] insert(int[] arr, int element) {
        int n = arr.length;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }

        result[n] = element;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int element = 50;

        int[] result = insert(arr, element);

        System.out.print("Array after insertion: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}