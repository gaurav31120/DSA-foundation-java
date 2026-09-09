// Time Complexity: O(n)
// Space Complexity: O(1)

public class CheckSortedArray {

    static boolean isSorted(int[] arr) {

        // Compare each element with the next
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        boolean sorted = isSorted(arr);

        System.out.println("Array is sorted: " + sorted);
    }
}