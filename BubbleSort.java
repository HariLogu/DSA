import java.util.Arrays;

public class bubble {
    static void bubbleSort(int[] arr){
        boolean swapped;
//        here the pass will be considered as i
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
//            here j always starts with the first index not in 0th
//            the con. i.e.,for every pass finish last element
//            will be sorted correctly(biggest num) so we don't have
//            to sort it for further pass so we omit it
//            ex if i=0;j's con. 5-0=5(it means in first pass
//            there are 5 steps)
//            if i=1; j's con. 5-1=4(it means in 2nd pass
////            there are 4 steps because the last ele is sorted)
//            if i=2; j's con. 5-2=3(and so on.)
//            if i=3; j's con. 5-3=2
//            if i=4; j's con. 5-4=1
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
//    in this sort we have reduced the space and time complexity
//    from O(n**2) to O(n)
    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
