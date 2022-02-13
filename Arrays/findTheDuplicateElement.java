// O(N) using hare and tortoise algo(one pointer twice as faster than the other )
class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        do{
            slow=nums[slow];
            fast= nums[nums[fast]];
        }
        while(slow!=fast);
            fast=nums[0];
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
        
        return slow;
    }
}

// O(NlogN) soln(BRUTE FORCE )

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
