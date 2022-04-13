class Solution {
    public int[][] generateMatrix(int n) {
        int l=0;
        int r=n;
        int t=0;
        int b=n;
        int[][] matrix=new int[n][n];
        int count=0;
        int temp=0;
        while(l<r && t<b)
        {
            //left->right [1,2,3] l=0, r=3;
            for(int i=l;i<r;i++)
            {
                count++;
                matrix[t][i]=count;
            }
            t++;
            //top->down
            for(int i=t;i<b;i++)
            {
                count++;
                matrix[i][r-1]=count;
            }
            r--;
            if(!(l<r && t<b))
            {
                
                break;
            }
            for(int i=r-1;i>l-1;i--)
            {
                count++;
                matrix[b-1][i]=count;
            }
            b--;
            for(int i=b-1;i>t-1;i--)
            {
                count++;
                matrix[i][l]=count;
            }
            l++;
        }
        return matrix;
    }
}