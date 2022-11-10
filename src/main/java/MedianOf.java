import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.abs;

public class MedianOf {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(getMedian(nums1, nums2));
    }

    private static double getMedian(int[] nums1, int[] nums2) {
        Integer[] n1 = IntStream.of( nums1 ).boxed().toArray( Integer[]::new );
        Integer[] n2 = IntStream.of( nums2 ).boxed().toArray( Integer[]::new );
        Stream<Stream<Integer>> stream = Stream.of(Arrays.stream(n1), Arrays.stream(n2));
        List<Integer> ints = stream.flatMap(e -> e).sorted().collect(Collectors.toList());
        ints.stream().forEach(e-> System.out.print(e + " "));
        int median;
        int len = ints.size();

        System.out.println("");
        if (ints.size() % 2 == 0) {
            int mid1 = abs(len / 2) - 1;
            int mid2 = abs(len / 2);
            //  System.out.println(ints.get(mid1) + ints.get(mid2));
            return ((double) ints.get(mid1) + (double) ints.get(mid2))/2;
        } else {
            int mid = abs(len / 2);
            // System.out.println(ints.get(mid));
            return ints.get(mid);
        }
    }
}
