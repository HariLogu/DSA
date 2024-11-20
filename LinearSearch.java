public class LinearSearch {

//    method for linear search and return index

    static int linearSearch(int[] arr,int element){

//        check if the arr is empty

        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }


//    method for linear search and return check whether
//    true or false(present or not)

    static boolean linearSearchEle(int[] arr,int element){

    //        check if the arr is empty

        if(arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr={1,2,4,5,6,7,8,99};
        System.out.println(linearSearch(arr,99));
        System.out.println(linearSearchEle(arr,99));

    }
}
