class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
            
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            swap(nums, i, j);  
        }
        reverse(nums, i+1, nums.length-1);
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--; 
        }
    }// TC:O(n), SC:O(1)
}