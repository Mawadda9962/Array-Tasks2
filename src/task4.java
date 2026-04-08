public class task4 {
    public static void main(String[] args) {
        int n = 5;
        int[] result = fizzArray(n);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "");
        }
    }
        public static int[] fizzArray(int n) {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            return arr;
        }
    }
