class Solution {
    public int maximumSwap(int num) {
        
       char[] charArray = Integer.toString(num).toCharArray();
        int[] maxSoFar=new int[charArray.length];
        int[] indexes=new int[charArray.length];
        Arrays.fill(maxSoFar,Integer.MIN_VALUE);
        Arrays.fill(indexes,-1);
        
        for(int i=charArray.length-2;i>=0;i--)
        {
            int currentValue=Integer.valueOf(charArray[i]-'0');
            int nextValue=Integer.valueOf(charArray[i+1]-'0');
            if(maxSoFar[i+1]>=currentValue)
            {
                maxSoFar[i]=maxSoFar[i+1];
                indexes[i]=indexes[i+1];
                
            }
            else if(nextValue >=currentValue)
            {
                maxSoFar[i]=nextValue;
                indexes[i]=i+1;
            }
        }
        for(int i=0;i<charArray.length;i++)
        {
            int currentValue=Integer.valueOf(charArray[i]-'0');
            if(currentValue < maxSoFar[i])
            {
                swap(charArray,i,indexes[i]);
                return Integer.valueOf(new String(charArray));
            }
        }
        return num;
    }
    public static void swap(char[] charArray,int i,int j)
    {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}