public class tak6 {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 4};
        int[] nums2 = {2, 4, 1};

        System.out.println (matchUp(nums1, nums2));
        }
    }
    public static int matchUp(int[] nums1, int[] nums2) {
       int count = 0;

        for (int i = 0; i < nums1.length; i++) {
        if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i] <= 2) {
            count++;
        }
        return count;
    }
}









