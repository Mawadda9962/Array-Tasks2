public class task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4};
        System.out.println(luckly13(numbers));
    }


    public static boolean luckly13(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3) {
                return false;
            }
        }
            return true;
        }
    }

