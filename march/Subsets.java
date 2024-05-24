// Given an integer array nums of unique elements, return all possible 
// subsets
// (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

import java.util.*;
public class Subsets{

    public static void helper(List<List<Integer>> list, List<Integer> li, int nums[], int start){
        list.add(new LinkedList<>(li));
        for(int i = start; i < nums.length; i++){
            li.add(nums[i]);
            helper(list, li, nums, i+1);
            li.remove(li.size()-1);
        }
    }

 public static List<List<Integer>> subsets(int nums[]){
    List<List<Integer>> list = new LinkedList<>();
     helper(list, new LinkedList<>(), nums, 0);
     return list;
 }

 public static void main(String[] args){
    int nums[] = {1, 2, 3};
        System.out.println(subsets(nums));
 }
}