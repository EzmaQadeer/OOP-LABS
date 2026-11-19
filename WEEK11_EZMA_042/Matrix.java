import java.util.Objects;
import java.util.Arrays;
class Matrix {
private int rows;
private int columns;
private int[] data;

// Row-major index:
// index = row * columns + column

public Matrix(int rows, int columns, int[] source) {
    if (rows <= 0 || columns <= 0 || source == null 
        || source.length != rows * columns)
        throw new IllegalArgumentException("Invalid matrix input.");
    this.rows = rows;
    this.columns = columns;
    this.data = source.clone(); // defensive copy (deep)
}

// Version 1: reference-sharing (shallow)
/*public Matrix(Matrix other) {
    this.rows = other.rows;
    this.columns = other.columns;
    this.data = other.data;
}*/

// Version 2: independent int[] array
public Matrix(Matrix other) {
    this.rows = other.rows;
    this.columns = other.columns;
    this.data = other.data.clone();
}

public int get(int row, int column) {
    int index = row * this.columns + column;
    return this.data[index];
}

public void set(int row, int column, int value) {
    int index = row * this.columns + column;
    this.data[index] = value;
}

public Matrix deepCopy() {
    return new Matrix(this.rows, this.columns, this.data);
}

@Override
public int hashCode() {
    return Objects.hash(this.rows, this.columns, Arrays.hashCode(this.data) );
}

public void swapRows(int row1, int row2) {
    for (int c = 0; c < this.columns; c++) {
        int temp = get(row1, c);
        set(row1, c, get(row2, c));
        set(row2, c, temp);
    }
}

public void swapCols(int col1, int col2) {
    for (int r = 0; r < this.rows; r++) {
        int temp = get(r, col1);
        set(r, col1, get(r, col2));
        set(r, col2, temp);
    }
}

public int hashCode(boolean deep) {
    int a=0;
    for(int i=0; i<this.data.length; i++) {
        a+= Objects.hash(this.data[i]);
    }
    return Objects.hash(this.rows, this.columns, a );
}

public boolean equals(Object other) {
    if (this == other) { return true; }
    if (other == null) { return false; }
    if (!(other instanceof Matrix)) { return false; }
    Matrix that = (Matrix) other;
    return this.rows == that.rows && this.columns == that.columns && 
           Arrays.equals(this.data, that.data);
}

@Override
public String toString() {
    String result = "";
    for (int r = 0; r < rows; r++) {
        result += "[ ";
        for (int c = 0; c < columns; c++) {
            result += get(r, c) + " ";
        }
        result += "]\n";
    }
    return result;
}

}