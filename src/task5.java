public class task5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4};
        System.out.println(no14(numbers));
    }

    public static boolean no14(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && arr[i] == 4) {
                return false;
            }
        }
        return true;
    }
}

