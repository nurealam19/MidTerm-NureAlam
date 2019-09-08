package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        //int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int[] numbers = new int[]{1,2,3,4,6,7,8,10};
        int total_num = 10;
        int expected_num_sum = total_num * ((total_num + 1) / 2);
        int num_sum = 0;
        for (int i: numbers) {
            num_sum += i;
        }
        System.out.print( expected_num_sum - num_sum);
        System.out.print("\n");
    }

    }
