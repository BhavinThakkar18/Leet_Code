class Solution {
    List<List<Integer>> ans= new ArrayList<List<Integer>>();
    public void rightRotate(int arr[], int d, int n)
    {
 
        // If arr is rotated n times then
        // you get the same array
        while (d > n) {
            d = d - n;
        }
 
        // Creating a temporary array of size d
        int temp[] = new int[n - d];
 
        // Now copying first N-D element in array temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];
 
        // Moving the rest element to index zero to D
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }
 
        // Copying the temp array element
        // in original array
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        //System.out.println(m+" "+n);
        int index=0;
        int[] temp = new int[m*n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[index]=grid[i][j];
                index++;
            }
        }
        rightRotate(temp,k,m*n);
        for(int j=0;j<m*n;j+=n){
        List<Integer> my=new ArrayList<>();
        for(int p=j;p<j+n;p++){
            my.add(temp[p]);
        }
        ans.add(my);
        }
        return ans;
    }
}