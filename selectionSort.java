import java.util.Arrays;

public class selection {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max1=start;
        for (int i = start; i <=end; i++) {
            if(arr[i]>arr[max1]){
                max1=i;
            }
        }
        return max1;
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length- i -1;
            int MaxIndex= getMaxIndex(arr,0,last);
            swap(arr,MaxIndex,last);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,22,78,34};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
