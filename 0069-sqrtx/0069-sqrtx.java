class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
        if(x==1 || x==0)return x; 
        int low=0,high=x/2,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
           if(mid==0||mid<=x/mid){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}