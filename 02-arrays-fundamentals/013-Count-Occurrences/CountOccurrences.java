// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountOccurrences {

    static int countOccurrences(int[] arr, int target) {

        int count = 0;

        // Count every matching element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40};
        int target = 10;

        int count = countOccurrences(arr, target);

        System.out.println("Occurrences: " + count);
    }
}