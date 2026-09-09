// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

public class MergeTwoArrays {

    static int[] merge(int[] first, int[] second) {

        int n = first.length;
        int m = second.length;

        int[] result = new int[n + m];

        int k = 0;

        // Copy first array
        for (int i = 0; i < n; i++) {
            result[k++] = first[i];
        }

        // Copy second array
        for (int j = 0; j < m; j++) {
            result[k++] = second[j];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6};

        int[] result = merge(first, second);

        System.out.print("Merged array: ");

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}