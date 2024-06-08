package Leetcode.june;
// Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

import java.util.HashMap;

// A good subarray is a subarray where:

// its length is at least two, and
// the sum of the elements of the subarray is a multiple of k.
// Note that:

// A subarray is a contiguous part of the array.
// An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

// Constraints:

// 1 <= nums.length <= 10^5
// 0 <= nums[i] <= 10^9
// 0 <= sum(nums[i]) <= 2^31 - 1
// 1 <= k <= 2^31 - 1

public class continuousSubarray {

    public static void main(String[] args) {
        int arr[] = {23,2,4,6,6};
        System.out.println(checkSubarraySum(arr, 7));
    }


    // this code is exceeding the timelimit because it is using double loop


    // public static boolean checkSubarraySum(int[] nums, int k) {
    //     int n = nums.length;
    //     for(int i = 0; i < n-1; i++){
    //         int ans = 0;
    //         for(int j = i+1; j >= 0; j--){
    //                 ans += nums[j];
    //                 if(j < i+1){
    //                 if(ans % k == 0)
    //                 return true;
    //             }    
    //         } 
            
    //     }
    
    //     return false;
    // }
    public static boolean checkSubarraySum(int[] nums, int k) {
       int prefixSum = 0;
        int n = nums.length;
       HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 0);
        for(int i = 0; i < n; i++){
            prefixSum =  (prefixSum + nums[i]) % k;
        if(map.containsKey(prefixSum)){
            if(i+1 - map.get(prefixSum) >= 2)
            return true;
        }else{  
           map.put(prefixSum, i+1);
        }
        }

        return false;
    }
}

