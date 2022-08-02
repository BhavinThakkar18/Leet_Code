class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0], max = matrix[n - 1][n - 1];
        
        while(min != max){
            int mid = min + (max - min) / 2;
            int count = countLessOrEqual(matrix, mid);
            if(count < k){
                min = mid + 1;
            }else{
                max = mid;
            }
        }
        return min;
    }
    
    public int countLessOrEqual(int[][] matrix, int mid){
        int count = 0;
        int col = matrix.length - 1;
        int row = 0;
        
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] <= mid){
                count += col + 1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }
}