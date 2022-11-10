public class Sorting {

    public void quickSort(int[] arr, int low, int high) {
        if(low > high){
            return;
        }
        int pivotindex = partition(arr, low, high);
        quickSort(arr, low, pivotindex-1);
        quickSort(arr, pivotindex+1, high);
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
