import java.util.Vector;

public class Intersection {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5}; //nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        int[] nums2 = {9,4,9,8,4};

        Sorting sorting = new Sorting();

//        for (int i = 0; i < nums1.length; i++) {
//           System.out.println(nums1[i]);
//        }

        sorting.quickSort(nums1, 0,  nums1.length-1);
        sorting.quickSort(nums2, 0, nums2.length-1);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }


        Vector<Integer> finalary = new Vector();

        int n1 = 0;
        int n2 = 0;
        while(n1 < nums1.length && n2 < nums2.length ){
            if(nums1[n1] < nums2[n2]){
                n1++;
            } else if(nums2[n2] < nums1[n1]){
                n2++;
            } else {
                finalary.add(nums1[n1]);
                n1++;
                n2++;
            }
        }
        int[] fin = new int[finalary.size()];

        for (int i = 0; i < finalary.size(); i++) {
           fin[i] = finalary.get(i);
        }
//        for (int i = 0; i < fin.length; i++) {
//           System.out.println(fin[i]);
//        }
    }
}
