// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecondSmallestElement {

    static Integer secondSmallest(int[] arr) {

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        boolean foundSecond = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];

                if (secondMin != Integer.MAX_VALUE) {
                    foundSecond = true;
                }
            }
            else if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
                foundSecond = true;
            }
        }

        return foundSecond ? secondMin : null;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        Integer secondMin = secondSmallest(arr);

        if (secondMin != null) {
            System.out.println("Second smallest element: " + secondMin);
        } else {
            System.out.println("No second smallest distinct element");
        }
    }
}