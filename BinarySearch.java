//in these bina search the arrays will be sorted alrrady
//either in ascending or in descending order,we have to find the
//by checking any two elements whether fist is smaller than second
// or not
public class BinarySearch {
//    find the middle index
    static int Middle(int[] arr){
        return arr.length/2;
    }
//    finding the target index
    static int find(int[] arr,int target){
        int middle=Middle(arr);
        if(target>arr[middle]){
            for (int i = middle; i < arr.length; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
        }
        else if(target<arr[middle]){
            for (int i = 0; i < middle; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
        }
        else if(target==arr[middle]){
            return middle;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,5,6,9,12,18,22,44,77,99};

        System.out.println(find(arr,22));
    }
}
