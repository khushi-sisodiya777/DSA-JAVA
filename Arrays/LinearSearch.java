package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,65,87,4,5,8};
        int target = 41;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag = true;
                break;
            }
        }
        if(flag==true) {
            System.out.println("target exits in array at index ");
            System.out.print("target exist in array");
        }
        else
        {
            System.out.println("target missing");
        }

    }
}
