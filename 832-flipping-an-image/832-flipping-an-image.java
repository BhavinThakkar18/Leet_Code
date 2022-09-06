class Solution {
    public void swap(int[][] arr,  int a, int b, int c){
       int temp = arr[c][b];
        arr[c][b] = arr[c][a];
        arr[c][a] = temp;
    }
    public int[][] flipAndInvertImage(int[][] images) {
        for(int i=0;i<images.length;i++)
        {
            int start=0;
            int end=images[0].length-1;
            
            //reversing 
            while(start<end)
            {
                swap(images, start, end , i);
                start++;
                end--;
            }
            
            //complement
            for(int j = 0; j < images[0].length; j++){
                images[i][j] = images[i][j] ^ 1;
            }
        }
        return images;
    }
}