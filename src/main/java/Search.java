public class Search {

    public int  binarySearch(int[] arr, int low, int high, int value ){
        int mid = (low +high) /2;
        if(low > high){
            return -1;
        }
        int midvalue = arr[mid];
        if(arr[mid] == value){
            return mid;
        }
        if(value < arr[mid] ){
           return  binarySearch(arr, low, mid-1, value);
        } else {
           return binarySearch(arr, mid+1, high, value);
        }
    }


}
