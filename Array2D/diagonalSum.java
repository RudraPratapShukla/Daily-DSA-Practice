package Array2D;

public class diagonalSum {
    public static int diagSum(int matrix[][]) {
        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) { //Tc=O(n^2)
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) { // Tc=O(n)
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) { // i+j=n-1 so j=n-i-1; mtlb center wala element do baar na add ho jaye
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagSum(matrix));
    }

}
