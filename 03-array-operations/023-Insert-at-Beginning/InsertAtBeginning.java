// Time Complexity: O(n)
// Space Complexity: O(n)

public class InsertAtBeginning {

    static int[] insert(int[] arr, int target) {
        int n = arr.length;
        int[] result = new int[n + 1];

        result[0] = target;

        for (int i = 0; i < n; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 5;

        int[] result = insert(arr, target);

        System.out.print("Array after insertion: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}