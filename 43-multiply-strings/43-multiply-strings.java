class Solution {
    public String multiply(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] res = new int[l1+l2];
        
        int i=l2-1;
        int pf=0; //powerfactor;
        if(num1.equals("0")||num2.equals("0")) return "0";
        while(i>=0)
        {
            int ival=num2.charAt(i)-'0';
            i--;
            int j=l1-1;
            int k = res.length-1-pf;
            int carry=0;
            while(j>=0 || carry!=0)
            {
                int jval = j>=0 ? num1.charAt(j) -'0':0;
                j--;
                int product = ival*jval+carry+res[k];
                res[k]=product%10;
                carry=product/10;
                k--;
            }
            pf++;
        }
        //managing leading zero
        String ans="";
        boolean f=false;
        for(int val:res)
        {
            if(val==0 && f==false)
            {
                continue;
            }
            else
            {
                ans+=val;
                f=true;
            }
        }
        return ans;
    }
}