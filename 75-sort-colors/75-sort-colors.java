class Solution {
    public void sortColors(int[] nums) {
        int v1=0;
        int v2=0;
        int v3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                v1++;
            }
            else if(nums[i]==1)
            {
                v2++;
            }
            else
            {
                v3++;
            }
        }
        //System.out.println(v1+" "+v2+" "+v3);
        for(int i=0;i<v1;i++)
        {
            nums[i]=0;
        }
        for(int i=v1;i<v1+v2;i++)
        {
            nums[i]=1;
        }
        for(int i=v1+v2;i<v1+v2+v3;i++)
        {
            nums[i]=2;
        }
    }
}