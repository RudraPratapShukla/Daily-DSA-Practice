package Array2D;

public class spiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0, startCol = 0;
        int endRow = matrix.length - 1, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startCol][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // down
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break; // jo ek baar top p print ho gya wo bottom m dubara na print ho
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break; // jo ek baar right p print ho gya wo left m dubara na print ho
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }

}
