public class task9 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int[] result = shiftLeft(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] shiftLeft(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int first = arr[0];// storing the first element
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first; //seting the last element of new array as same as the first element of the originsl arr

        return arr;
    }
}
