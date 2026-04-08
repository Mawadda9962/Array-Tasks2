public class task2 {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 5, 4, 4};
        System.out.println(sum13(numbers));
    }


    public static int sum13(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {
                continue;
            }else {
                sum += arr[i];
            }
        }

        return sum;
    }

}
