class Solution {
    public int[] plusOne(int[] digits) {
        // String s="";
        // for(int i=0;i<digits.length;i++){
        //     s+=digits[i];
        // }
        // int n=Integer.parseInt(s);
        // n+=1;
        // String st=String.valueOf(n);
        // int[] digit=new int[st.length()];
        // for(int i=0;i<st.length();i++){
        //     digit[i]=st.charAt(i)-'0';
        // }
        // System.out.println(st);
        // return digit;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int digit[]=new int[digits.length+1];
        digit[0]=1;
        return digit;
    }
}