// Time Complexity: O(n)
// Space Complexity: O(n)

public class InsertAtIndex {

    static int[] insert(int[] arr, int index, int element) {
        int n = arr.length;
        int[] result = new int[n + 1];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        result[index] = element;

        for (int i = index; i < n; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int index = 2;
        int element = 25;

        int[] result = insert(arr, index, element);

        System.out.print("Array after insertion: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}