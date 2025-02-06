
//     //USING LOOP IT TOOKS LOTS OF TIME COMPLEXITY SO WE USE MAP
//     // for(int i=0;i<nums.length;i++){
//     //   for(int j=i+1;j<nums.length;j++){
//     //     if(target == nums[i] + nums[j]){
//     //       System.out.println("[" + i + "," + j + "]");
//     //     }
//     //   }
//     // }
  
import java.util.HashMap;
import java.util.Map;

 class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                // System.out.println("[" + map.get(complement) + "," + i + "]");
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null; // Return null if no solution is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result= twoSum(nums, target);
        System.out.println(result);
    }
}

