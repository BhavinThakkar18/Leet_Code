class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int freq=1;
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==majority)
           {
               freq++;
           }
           else
           {
              freq-=1;
              if(freq==0)
              {
                  majority=nums[i];
                  freq=1;
              }
           }
        }
        return majority;
    }
}