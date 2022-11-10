public class RemoveDubpicates {
    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 4, 5, 6};

//        for (int i=0;i<nums.length;i++){
//            nums[]
//        }
        RemoveDubpicates rem = new RemoveDubpicates();
        System.out.println(rem.removeDuplicates(nums));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0) {
            return 0;
        }
//{2, 3, 4, 4, 5, 6};
        int slow = 0;
        int fast = 1;

        while (fast < n) {
            if (nums[fast] != nums[slow]) {
                slow = slow + 1;
                nums[slow] = nums[fast];
            }
            fast = fast + 1;
        }
        return slow + 1;

    }
}
