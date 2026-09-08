class Solution {
    public int dig(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            sum+=d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n, fast=n;
        while(fast!=1){//unhappy cond
            slow=dig(slow);
            fast=dig(fast);
            fast=dig(fast);
            if(slow==fast && (fast!=1 || slow!=1)){
                return false;
            }
        }
        return true;
    }
}