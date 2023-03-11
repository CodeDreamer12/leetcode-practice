class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>target){
                ans=0;
                break;
            }
            else if((i<nums.length-1) && (nums[i]<target && nums[i+1]>target) ){
                ans=i+1;
                break;
            }
            else if(i==nums.length-1 && nums[i]<target){
                ans=i+1;
                break;
            }

        }
      return ans;  
    }
}
