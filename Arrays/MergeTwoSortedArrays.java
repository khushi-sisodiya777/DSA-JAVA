package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String [] args){
    int[] a = {2,5,6,9,20};
    int[] b = {1,3,4,5,7,8};
    int[] c = new int[a.length+b.length];
    for(int ele : c) System.out.println(ele+ " ");
    merge(c,a,b);
    for(int ele : c) System.out.print(ele+ " ");
    System.out.println();
    }
    public static void merge(int[] c,int[] a, int[] b){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){ // a ka aaray khatam bacha hua b ka element lo
            while(j<b.length){
                c[k++] = b[j++];
            }
        }
        else if(j<b.length){ // b ka aaray khatm bacha hua a ka element lo
            while(i<a.length){
                c[k++] = a[i++];
            }
        }
    }

}