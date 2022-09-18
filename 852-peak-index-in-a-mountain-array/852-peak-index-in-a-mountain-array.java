class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}