// split the num and dind the sum and prod then the diffrence

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
        return prod-sum;
    }
}
