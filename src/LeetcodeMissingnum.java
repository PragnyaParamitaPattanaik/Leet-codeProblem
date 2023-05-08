public class LeetcodeMissingnum {
    public static void main(String[] args) {
     int nums[]={1,0,3};
     System.out.println(MissingNumber(nums));
    }

    public static int MissingNumber(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
            sum = sum + nums[i];

            int actualSum = (nums.length * (nums.length + 1))/ 2;
            int missingNumber = actualSum - sum;

            return missingNumber;


    }

}
