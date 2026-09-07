// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindMaximum {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        // Assume first element is maximum
        int max = arr[0];

        // Find larger element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}