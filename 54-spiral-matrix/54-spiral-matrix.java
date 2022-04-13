class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0;
        int r=matrix[0].length;
        int t=0;
        int b=matrix.length;
        List<Integer> ans=new ArrayList<Integer>();
        int count=0;
        int temp=0;
        while(l<r && t<b)
        {
            //left->right [1,2,3] l=0, r=3;
            for(int i=l;i<r;i++)
            {
                count++;
                ans.add(matrix[t][i]);
            }
            t++;
            //top->down
            for(int i=t;i<b;i++)
            {
                count++;
                ans.add(matrix[i][r-1]);
            }
            r--;
            if(!(l<r && t<b))
            {
                
                break;
            }
            for(int i=r-1;i>l-1;i--)
            {
                count++;
                ans.add(matrix[b-1][i]);
            }
            b--;
            for(int i=b-1;i>t-1;i--)
            {
                count++;
                ans.add(matrix[i][l]);
            }
            l++;
        }
        return ans;
    }
}