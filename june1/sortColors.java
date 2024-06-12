package Leetcode.june1;
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

public class sortColors{

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];

        int i = low-1;
        for(int j = low; j < high; j++){
            if(pivot >= arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
                arr[i+1] = pivot;
                arr[high] = temp;  
                return i+1; 
    }
    public static void Quicksort(int[] arr, int low, int high){
        if(low < high){

            int part = partition(arr, low, high);
                Quicksort(arr, low, part-1);
                Quicksort(arr, part+1, high);

        }
    }
    public static void sortColors1(int[] nums) {
        Quicksort(nums, 0, nums.length-1);
    }
   public static void main(String[] args) {
     int nums[] = {2,0,2,1,1,0};
     sortColors1(nums);
    for(int i =0; i <nums.length; i++){
        System.out.println(nums[i]);
    }
   }
}
