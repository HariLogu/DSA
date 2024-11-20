package Recursion.Arrays;

public class BinSearchByRecursion {
//    we can use recursion in replace for iteration
//    in recursion we should know which variables should we pass as arguments and also
//    which variables we can declare in the body of the function.
//    if a recursive function call needs that updated variable we can pass it as argument
//    otherwise we can declare it in the body
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
//            it is more important that we have to return the call
            return search(arr,target,mid+1,end);
        }
        else{
            return search(arr,target,start,mid-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,55,66,899};
        int target=626;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
