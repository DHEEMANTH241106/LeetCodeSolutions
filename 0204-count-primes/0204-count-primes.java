class Solution {
    public int countPrimes(int n) {
        if(n==1 || n==0)return 0;
        int cnt=0;
        boolean prime[]=new boolean[n];
        for(int i=2;i<n;i++){
            prime[i]=true;
        }
        for(int i=2;i<=n/i;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i])cnt++;
        }
        // for(int i=2;i<n;i++){
        //     int fcnt=0;
        //     for(int j=2;j<=Math.sqrt(i);j++){
        //         if(i%j==0)fcnt++;
        //     }
        //     if(fcnt==0)cnt++;
        // }
        return cnt;
    }
}