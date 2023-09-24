import java.util.Arrays;

public class LC2293 { // Min Max Game

  public static int minMaxGame (int[] nums1){
    int[] nums = nums1;
    if (nums.length == 1)
      return Integer.valueOf(nums[0]);
    while(nums.length>1){
        int[] newNums = new int[nums.length/2];
      for (int i = 0; i < nums.length/2; i++){
          if (i % 2 == 0){
            newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
          } else {
          newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
          }
        }
        nums = newNums;
    }

    return nums[0];
    
  }

  public static void main(String[] args) {
    int[] ints = new int[]{9,8,7,6};
    int results = minMaxGame(ints);
    System.out.println("The result is: " + results);
    
  }
}
