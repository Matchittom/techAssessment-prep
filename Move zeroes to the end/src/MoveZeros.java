import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int insertPos = 0;

        // Step 1: shift all non-zero values to the front, in order
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Step 2: fill everything after insertPos with zero
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeros(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]

        int[] b = {0, 0, 0};
        moveZeros(b);
        System.out.println(Arrays.toString(b)); // [0, 0, 0]

        int[] c = {4, 2, 1};
        moveZeros(c);
        System.out.println(Arrays.toString(c)); // [4, 2, 1] — no zeros, unchanged
    }
}