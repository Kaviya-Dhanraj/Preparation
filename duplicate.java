import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class duplicate{
  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();
    int[] nums ={1,2,4,5,6,2,1};
    List<Integer> duplicate = new ArrayList<>();
    
    // for(int i = 0;i<nums.length;i++){
    //   if( map.containsKey(nums[i])){
    //      duplicate.add(nums[i]);
    //    }
    //   map.put(nums[i],i);
    // }
    // System.out.println(duplicate);

    for(int num : nums){
      if(map.containsKey(num)){
        duplicate.add(num);
      }
      else{
        map.put(num,1);
      }
    }
    System.out.println(duplicate);
  }
}

