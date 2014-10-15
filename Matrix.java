public class Matrix {
    
    private int[][] twoDIntArray;
    
    public Matrix(int col, int row) {
        this.twoDIntArray = new int[col][row];
        
        for (int colCount = 0; colCount < twoDIntArray[0].length; colCount++) {
            for (int rowCount = 0; rowCount < twoDIntArray.length; rowCount++) {
                twoDIntArray[colCount][rowCount] = 1;
            }
        }
    }
    
    public int[][] getMatrix() {
        return twoDIntArray;
    }
    
    public void setElement(int col, int row, int modify) {
        if (col > twoDIntArray[0].length-1) {
            return;
        }
        if (row > twoDIntArray.length-1) {
            return;
        }
        else {
            twoDIntArray[col][row] = modify;
        }
    }
    
}