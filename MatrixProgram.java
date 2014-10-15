import java.util.Arrays;

public class MatrixProgram {
    public static void main(String[] args) {
        
        Matrix userMatrix = new Matrix(5,5);
        
        userMatrix.setElement(0,5,5);
        
        userMatrix.setRow(0, "1,2,3,4,5");
        
        System.out.print(Arrays.deepToString(userMatrix.getMatrix()));
        
    }
}