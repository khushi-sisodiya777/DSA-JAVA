public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 20, 25, 30, 35 };

        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}