class Solution {
    public void colorFill(int image[][], int i, int j, int color1, int color){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j] != color1){
            return;
        }
        image[i][j]=color;
        colorFill(image,i+1,j,color1,color);
        colorFill(image,i-1,j,color1,color);
        colorFill(image,i,j+1,color1,color);
        colorFill(image,i,j-1,color1,color);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int color1=image[sr][sc];
        if(color1 != color){
            colorFill(image,sr,sc,color1,color);
        }
        return image;
        
    }
}
