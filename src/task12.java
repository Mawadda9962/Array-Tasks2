public class task12 {
    public static void main(String[] args) {
        String[] result = fizzBuzz(1, 16);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

     public static String[] fizzBuzz(int start, int end){
        int size = end - start;
        String[] newArr = new String[size];

        for(int i = 0; i < size; i++){
            int num = start + i;

            if (num % 15 == 0){
                newArr[i]  = "FizzBizz";
            }else if(num % 3 == 0){
                newArr[i] = "Fizz";
            }else if(num % 5 == 0){
                newArr[i] = "Buzz";
            }
        }

        return newArr;
        }
    }



