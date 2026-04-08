public class task1 {
    public static void main(String[] args) {

        int[] numbers = {2, 1, 2, 3, 4};
        System.out.println(countEvens(numbers));
    }


    public static int countEvens(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

}






