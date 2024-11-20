public class BinarySearch {
    // s - start
    // e - end
    // m - mid
    // t - target
    static int BinarySearch(int[] arr,int t){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==t){
                return m;
            }
            if(arr[m]<t){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(BinarySearch(arr,5));
    }
}
