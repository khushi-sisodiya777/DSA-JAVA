public class SimpleArray {
    public static void main(String[] args) {
        // 1. Declare and initialize an array directly
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Access and print a specific element
        System.out.println("The first element is: " + numbers[0]);
        System.out.println("The last element is: " + numbers[4]);

        // 3. Change an element's value
        numbers[1] = 99;

        // 4. Print all elements using a simple loop
        System.out.print("All array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}