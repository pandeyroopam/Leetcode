// You are given an array nums of positive integers and a positive integer k.

// A subset of nums is beautiful if it does not contain two integers with an absolute difference equal to k.

// Return the number of non-empty beautiful subsets of the array nums.

// A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums. Two subsets are different if and only if the chosen indices to delete are different.

import java.util.LinkedList;
import java.util.List;

public class BeautifulSubset {


    public static int helper(int[] nums, int k, List<Integer> list,int count, int index){
       
        // it is not base condition
        // This condition only check if the list is satisfying the condition or not
        if(list.size() == 1) count++;
        else if(list.size() > 1){
            int i = 0;
          for( ; i<list.size()-1; i++){
            int ans = list.get(list.size()-1) - list.get(i);
            if(Math.abs(ans) == k){
                return count;
            }
          }
           if(i == list.size()-1)    count ++;
        }
        for(int i = index; i < nums.length; i++){
            list.add(nums[i]);
             count = helper(nums, k, list, count, i+1);
            list.remove(list.size()-1);
        }
          return count;
    }

    public static int beautifulSubsets(int[] nums, int k) {
        return helper(nums, k, new LinkedList<>(), 0, 0);
    }

    public static void main(String[] args){
        int arr[] = {2, 4, 6};
        int k = 2;
        System.out.println(beautifulSubsets(arr, k));
    }
}
