//https://leetcode.com/problems/missing-number

// use 0 as a blank space and consider array range from [1, n]
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int ans = 0;
        while(i < nums.length){
            int correct_index = nums[i] - 1;
            if(correct_index == -1 || nums[i] == nums[correct_index]){
                if(nums[i] == 0) ans = i + 1;
                i++;
            }else{
                swap(i, correct_index, nums);
            }
        }
        return ans;
    }
    
    void swap(int f, int s, int[] nums){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }
}
