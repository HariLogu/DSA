import java.util.Arrays;

public class insertion {
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 &&(arr[j]<arr[j-1]); j--) {
//                    usually we use the e;lements for swapping
//                    but here we swap the indexes
                    swap(arr,j,j-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,-23,-4,2,4,-99};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
