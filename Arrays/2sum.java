// this soln is in o(N^20 comp 
// the optimised requires hashing

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] idx= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    idx[0]=i;
                    idx[1]=j;
                }
            }
        }
        return idx;
       
    }
}
