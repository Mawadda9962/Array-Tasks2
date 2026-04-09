public class Task7 {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 2};
        int[] nums2 = {1, 1, 1};

        System.out.println(modThree(nums1));
        System.out.println(modThree(nums2));
    }


public static boolean modThree(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0 && arr[i+1] % 2 == 0 && arr[i+2] % 2 ==0) {
            return true;
        }
        if (arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] %2 != 0 ) {
            return true;
        }
    }

    return false;
    }
}




