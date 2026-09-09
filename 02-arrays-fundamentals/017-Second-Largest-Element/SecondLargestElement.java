// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecondLargestElement {

    static Integer secondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

                if (secondMax != Integer.MIN_VALUE) {
                    foundSecond = true;
                }
            }
            else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
                foundSecond = true;
            }
        }

        return foundSecond ? secondMax : null;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        Integer secondMax = secondLargest(arr);

        if (secondMax != null) {
            System.out.println("Second largest element: " + secondMax);
        } else {
            System.out.println("No second largest distinct element");
        }
    }
}