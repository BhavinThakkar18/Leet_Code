class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //nearest next greater element
        int[] ans=new int[temperatures.length];
        Stack<Integer> st = new Stack<Integer>();
        int[] map = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i])
            {
                Integer topIdx = st.pop();
                int diff=i-topIdx;
                map[topIdx]=diff;
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            Integer topIdx= st.pop();
            map[topIdx]=0;
        }
        return map;
    }
}