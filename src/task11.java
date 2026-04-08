public class task11 {
    public static void main(String[] args) {
        int[] nums = {1, 10, 2, 10, 3, 10, 4};
        int[] result = withoutTen(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");

        }
    }

        public static int[] withoutTen(int[] arr) {
            int[] result = new int[arr.length];
            int n = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 10) {
                    result[n] = arr[i];
                    n++;
                }
            }
            return result;
        }
}




