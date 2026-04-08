public class task8 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 2};
        int n = 2;
        System.out.println(sameEnds(nums, n));

    }

    public static boolean sameEnds(int[] arr, int n) {

        for(int i = 0; i < n; i++){
            if(arr[0] != arr[arr.length - n + i]){
                return false;

            }
        }

        return true;
    }
}
