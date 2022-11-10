public class SumNums {

    public void findTwoNumbers(int[] arr, int value) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    break;
                }
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] usingSort(int[] arr, int n){
        int pos1 = 0;
        int pos2 = arr.length -1;
        int[] result = new int[2];
        while(pos1 < pos2){
            int sum = arr[pos1] + arr[pos2];
            if( sum == n){
                result[0] = arr[pos1];
                result[1] = arr[pos2];
                break;
            } else if (sum > n){
                --pos2;
            } else {
                ++pos1;
            }
        }
        System.out.println(result[0] + " " + result[1]);
        return result;
    }
}
