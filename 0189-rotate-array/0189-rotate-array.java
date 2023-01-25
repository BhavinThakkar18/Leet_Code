class Solution {
    public void rotate(int[] list, int k) {
        k%=list.length;
        Stack<Integer> stack = new Stack<>();
        int copy=k;
        int i=list.length-1;
        while(copy>0)
        {
            stack.push(list[i]);
            i--;
            copy--;
        }
        for(int j=list.length-(k+1);j>=0;j--)
        {
            list[j+k]=list[j];
        }
        int p=0;
        while(!stack.isEmpty())
        {
            list[p]=stack.pop();
            p++;
        }
    }
}