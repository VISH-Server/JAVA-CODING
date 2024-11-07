import java.util.HashMap;
public class MAJORITY 
{
 public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int n = nums.length;
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > n / 2) {
                return num;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {3,1,3,3,2};
        int majorityElement = findMajorityElement(array);
        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }   
}
