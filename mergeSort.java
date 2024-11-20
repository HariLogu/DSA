package Recursion.Arrays;

import java.util.Arrays;
//
//by TWO POINTER METHOD
public class mergeSort {
    public static void main(String[] args) {
        int[] arr={4,2,6,1};
        arr=MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] MergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
//        here we have initialized the variables i,j and k
        int i=0;
        int j=0;
        int k=0;
//        lets create a new array of length of sum of two indivi
//        array.
        int[] mix=new int[first.length+second.length];
//        if i or j exceeds the length of array program terminates
        while(i<first.length && j<second.length){
//            finding the smallest element
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
//            after adding element we should step to the another
//            place in the mixed array.
            k++;
        }

//        these valuations are for the remaining elements
//        in the array
//        for ex first.length=3,second.length=5 means the remain
//        two in second array
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
//    we can use this method or we can avoid creating two
//    new arrays and manipulating the original ones by indices
}
