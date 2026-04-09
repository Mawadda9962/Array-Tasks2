public class Task15 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2};
        System.out.println(sum28(nums));
    }

    public static Boolean sum28(int[] arr ){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 2){
                sum += arr[i];

            }
            if(sum == 8){
                return true;
            }
        }
        return false;
    }

}
