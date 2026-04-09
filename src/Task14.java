public class Task14 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7, 1};
        System.out.println(sum67(nums));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean skipNum = false;

        for(int i = 0;  i < nums.length; i++){
            if (nums[i] ==6){
                skipNum = true;
            }else if (skipNum && nums[i] == 7){
                skipNum = false;
            }else if (!skipNum){
                sum += nums[i];
            }
        }
        return sum;
    }
}
