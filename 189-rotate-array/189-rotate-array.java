class Solution {
    public void rotate(int[] nums, int k) {
    k = k % nums.length;
    // [7,6,5,4,3,2,1] reverse the entire array
    // [5,6,7,4,3,2,1] reverse the first k elements
    // [5,6,7,1,2,3,4]  reverse the  k to rest of the eliments
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1); 
    }
    public void reverse(int[] nums,int right, int left)
    {
        while(right < left)
        {
            int temp= nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right++;
            left--;
        }
    }
}