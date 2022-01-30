class Solution {
    public int findSpecialInteger(int[] arr) {
       int[] freq = new int[100001];
       int ans=0;
       for(int i=0;i<arr.length;i++)
       {
           freq[arr[i]]+=1;
       }
       for(int i=0;i<100001;i++)
       {
           double prob=(double) freq[i]/arr.length;
           if(prob>0.25d)
           {
               ans=i;
               break;
           }
       }
       return ans;
    }
}