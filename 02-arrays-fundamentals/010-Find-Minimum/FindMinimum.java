// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindMinimum {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        // Assume first element is minimum
        int min = arr[0];

        // Find smaller element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}