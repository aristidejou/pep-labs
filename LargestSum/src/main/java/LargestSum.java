
import java.util.List;
import java.util.stream.Collectors;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        List<Integer> s = nums.stream().sorted().collect(Collectors.toList());     
int i=s.size();
i=s.get(i-1)+s.get(i-2);
        return i;
    }
}