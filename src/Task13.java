public class Task13 {
    public static void main(String[] args) {
        int[] nums={4, 5, 10, 6};
        System.out.println(bigDif(nums));
    }

    public static int  bigDif(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for( int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }
}
