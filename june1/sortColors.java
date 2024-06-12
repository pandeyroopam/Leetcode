package Leetcode.june1;


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