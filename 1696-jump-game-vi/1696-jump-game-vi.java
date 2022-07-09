class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(0);
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[dq.peekFirst()];
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
            if(i-dq.peekFirst()>=k) dq.removeFirst();
        }
        return nums[nums.length-1];
    }
}