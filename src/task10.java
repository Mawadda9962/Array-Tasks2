public class task10 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 4, 7};
        int[] result = post4(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

    public static int[] post4(int[] arr) {
        int lastIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastIndex = i;
            }
        }

        int size = arr.length - lastIndex - 1;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = arr[lastIndex + 1 + i];
        }

        return result;
    }
}
