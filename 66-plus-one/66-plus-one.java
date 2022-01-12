class Solution {
    public int[] plusOne(int[] digits) {
    int len = digits.length-1;
    if(digits[len]<9) //last digit is less than 9 then simply increment the last one and return
    {
        digits[len]++;
        return digits;    
    }
    while(digits[len]==9 && len>=0)//last digit is 9 
    {
        if(len==0)
        {
            int[] ans = new int[digits.length+1];//we are creating new array with length +1 of the older one
            ans[0]=1;
            digits[0]=0;
            for (int i=0;i<digits.length;i++)
            {
                ans[i+1]=digits[i];
                
            }
            return ans;          
        }
        digits[len]=0;
        len--;
    }
            digits[len]++; //here we are making the elemnt at len position increase by 1, this step is necessary for arrays like [8,9,9]
        return digits;    
    }
}