public class task9 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};

        for (int i =0; i < nums.length; i++ ) {
            System.out.println(shiftLeft(nums));
        }
    }


    public static int[] shiftLeft(int[] arr) {
        int[] arr = new int[nums];
        int first = arr[0];

        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = arr[i + 1];
        }
            arr[arr.length -1] = first;
        return arr;
    }
}

