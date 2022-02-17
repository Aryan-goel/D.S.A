
// o(nLogn) naieve approach
//optimised below
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int count=1;
        int longest=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    count++;
                }else{
                    longest=Math.max(longest,count);
                    count=1;
                    
                }
            }
        }
        return Math.max(longest,count);
    }
}



//optimized
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int streak=1;
                while(set.contains(curr+1)){
                    curr+=1;
                    streak+=1;
                }
                longest=Math.max(longest,streak);
            }
        }
        return longest;
    }
}
