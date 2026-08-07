 
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 3, 56, 2, 34, 65};
        int n = arr.length;
        int i = 0;

        for(int j = n - 1; i < j; --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
        }

        for(int var6 = 0; var6 < n; ++var6) {
            System.out.print(arr[var6] + " ");
        }

    }
}
