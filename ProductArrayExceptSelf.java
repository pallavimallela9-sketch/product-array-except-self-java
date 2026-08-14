import java.util.Arrays;

class ProductArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Store prefix products
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix products
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] = result[i] * suffix;

            suffix = suffix * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        System.out.println("Original Array: "
                + Arrays.toString(nums));

        int[] result = productExceptSelf(nums);

        System.out.println("Result Array: "
                + Arrays.toString(result));
    }
}
