// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindSum {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Add each element to sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}