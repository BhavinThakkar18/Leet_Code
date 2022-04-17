class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        // System.out.println("n:"+n);
        // System.out.println("m:"+m);
        // System.out.println("r:"+r);
        // System.out.println("c:"+c);
        if((n*m)==(r*c))
        {
            int[] arr=new int[n*m];
            int[][] ans=new int[r][c];
            int k=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[k]=mat[i][j];
                    k++;
                }
            }
            int p=0;
            for(int i=0;i<r;i++)
            {
               for(int j=0;j<c;j++)
               {
                   ans[i][j]=arr[p];
                   p++;
               }
            }
            return ans;
        }
        return mat;
    }
}