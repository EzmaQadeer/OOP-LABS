public class Main {
    public static void main(String[] args) {
        // Creating a 2x3 matrix using an array of 6 elements (row-major order)
        // [10, 20, 30] -> Row 0
        // [40, 50, 60] -> Row 1
        int[] sourceData = {10, 20, 30, 40, 50, 60};
        Matrix matrix = new Matrix(2, 3, sourceData);

        System.out.println("--- Initial Matrix (2x3) ---");
        System.out.print(matrix);

        // Test get() and set() methods
        System.out.println("Element at row 0, col 1: " + matrix.get(0, 1)); // Should be 20
        matrix.set(0, 1, 99);
        System.out.println("After setting row 0, col 1 to 99:");
        System.out.print(matrix);

        // Test swapRows() method (swap Row 0 and Row 1)
        matrix.swapRows(0, 1);
        System.out.println("--- After Swapping Row 0 and Row 1 ---");
        System.out.print(matrix);

        matrix.swapCols(1, 2);
        System.out.println("--- After Swapping Coulmn 1 and Row 2 ---");
        System.out.print(matrix);

        // Test hashCode()
        System.out.println("Matrix hashCode: " + matrix.hashCode());
        System.out.println("Matrix hashCode without Arrays.hashCode method: " + matrix.hashCode(true));

    int[] data= {40, 55, 67, 80, 85, 90};
    Matrix matrix2 = new Matrix(2, 3, data);

    System.out.println("--- Matrix 2: ---");
    System.out.print(matrix2);
    System.out.println("Checking if matrix 1 is equal to matrix 2: " + matrix.equals(matrix2));

    }
}