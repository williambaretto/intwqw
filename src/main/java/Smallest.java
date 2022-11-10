public class Smallest {

    public static void main(String[] args) {
        int[] A = {2, 3, 7, 6, 8, -1, -10, 15};
        Sorting smallest = new Sorting();
        smallest.quickSort(A, 0, A.length - 1);

        for (int i = 0; i < A.length; i++) {
            System.out.print(" " + A[i]);
        }

        int res = smallest(A);
        System.out.println(" result " + res);
    }

    private static int smallest(int[] a) {
        int k = 1;
        int nextsmall=-1;
        for(int j=0;j<a.length;j++){
            if(a[j]>0 && a[j] >= 2){
             nextsmall = a[j]-1;
             break;
            }
        }
        System.out.println("nextsmall " + nextsmall);


        for (int i = 0; i < a.length; i++) {
            if (nextsmall < a[i]) {
                break;
            } else if (a[i] == nextsmall) {
                nextsmall = a[i] + 1;
            }
        }
        return nextsmall;


//        while (k < a.length) {
//            if(small+1 != a[k]){
//                small =  small+1;
//                break;
//            }
//            k++;
//
//        }
//        System.out.println(small);

    }

    public void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int pivotindex = partition(arr, low, high);
        quickSort(arr, low, pivotindex - 1);
        quickSort(arr, pivotindex + 1, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotindex = low;
        for (int i = low; i <= high - 1; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pivotindex);
                pivotindex++;
            }
        }
        swap(arr, pivotindex, high);
        return pivotindex;
    }

    private void swap(int[] arr, int low, int i) {
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;
    }


}
