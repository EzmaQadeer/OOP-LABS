public class Matrix implements Cloneable {
    private int rows;
    private int columns;
    private int[][] data;

    // Constructor
    public Matrix(int rows, int columns, int[][] source) {
        if (source.length != rows ) {
            throw new IllegalArgumentException("Source row count does not match matrix dimensions.");
        }
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
        for (int i = 0; i < source.length; i++) {
            if (source[i].length != columns) {
            throw new IllegalArgumentException("Source column count does not match matrix dimensions.");
        }
            for(int j=0; j< source[i].length; j++) {
                  this.data[i][j] = source[i][j];
            }
        }
    }

    // Get value at specific row and column
    public int get(int row, int col) {
        return data[row * this.columns + col];
    }

    // Set value at specific row and column
    public void set(int row, int col, int value) {
        data[row * this.columns + col] = value;
    }

    // Shallow copy using Object's clone()
    @Override
    public Matrix clone() throws CloneNotSupportedException { 
        return (Matrix) super.clone();
    }

    public Matrix deepCopy() throws CloneNotSupportedException {
        Matrix cloned = (Matrix) super.clone();
        int[] newArray= new int[this.data.length];
        for(int i = 0; i< newArray.length; i++) {
             newArray[i] = this.data[i];
        }
        cloned.data= newArray;
        return cloned;
    }

    @Override
public String toString() {
    int[][] temp2D = new int[rows][columns];
    
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < columns; c++) {
            temp2D[r][c] = data[r * this.columns + c];
        }
    }
    
    return Arrays.deepToString(temp2D);
}
    
}