// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountEvenOdd {

    static void countEvenOdd(int[] arr) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 42, 18};

        countEvenOdd(arr);
    }
}