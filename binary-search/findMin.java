class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if(nums[start] <= nums[end]) return nums[start];
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid < nums.length - 1 && nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if(mid > 0 && nums[mid - 1] > nums[mid]) return nums[mid];
            
            if(nums[end] > nums[mid]) end = mid;
            else start = mid + 1;
        }
        return -1;
    }
}
