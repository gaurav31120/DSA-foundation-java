// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindAverage {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate total sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Convert to double before division
        double average = (double) sum / arr.length;

        System.out.println("Average: " + average);
    }
}