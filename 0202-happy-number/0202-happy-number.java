class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
            if(n==0 && sum==1)return true;
            else if(n==0 && sum!=4){
                n=sum;
                sum=0;
            }
            else if(n==0 && sum==4)return false;
        }
        return false;
    }
}