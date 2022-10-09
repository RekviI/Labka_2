import java.util.*;

public final class MatrixFinale
{
    int[][] ImmutableMatrix;
    MatrixFinale()
    {
        this.ImmutableMatrix = new int[0][0];
    }
    MatrixFinale(int a, int b)
    {
        this.ImmutableMatrix = new int[a][b];
    }
    MatrixFinale(int[][]matrix)
    {
        this.ImmutableMatrix = matrix;
    }

    public void ImmutableMatrixCreate()
    {
        System.out.println("Введіть кількість рядків в матриці");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Введіть кількість стовпців в матриці");
        int column = sc.nextInt();
        ImmutableMatrix = new int[row][column];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                System.out.println(String.format("Введіть [%d][%d] елемент", r+1, c+1));
                ImmutableMatrix[r][c] = sc.nextInt();
            }
        }
        System.out.println("Отримана матриця: \n");
        ImmutablePrintMatrix(ImmutableMatrix);
    }
    public void ImmutableMatrixAuto(int min, int max)
    {
        Random random = new Random();
        System.out.println("Введіть кількість рядків в матриці");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Введіть кількість стовпців в матриці");
        int column = sc.nextInt();
        ImmutableMatrix = new int[row][column];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                ImmutableMatrix[r][c] = random.nextInt(max-min) +min;
            }
        }
        System.out.println("Отримана матриця: ");
        ImmutablePrintMatrix(ImmutableMatrix);
    }
    public void ImmutableGetElement(int[][]matrix)
    {
        System.out.println("Введіть номер рядка елементу: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("Введіть номер ствопця елементу: ");
        int j = input.nextInt();
        System.out.println(matrix[i-1][j-1]);
        System.out.println("");
    }
    public void ImmutableGetRow(int[][] matrix, int i)
    {
        System.out.println("Введіть номер рядка: ");
        Scanner input = new Scanner(System.in);
        int specificRow = input.nextInt();
        for(int row = 0; row < i; row++)
        {
            System.out.print(matrix[specificRow-1][row]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public void ImmutableGetColumn(int[][] matrix, int j)
    {
        System.out.println("Введіть номер стовпця: ");
        Scanner input = new Scanner(System.in);
        int specificColumn = input.nextInt();
        for(int column = 0; column < j; column++)
        {
            System.out.println(matrix[column][specificColumn-1]);
        }
    }
    public static void ImmutableDiagonalMatrix(int[] vector)
    {
        int[][] diagonal;
        int row = vector.length;
        int column = vector.length;
        diagonal = new int[row][column];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                if (r == c)
                {
                    diagonal[r][c] = vector[r];
                } else {
                    diagonal[r][c] = 0;
                }
            }
        }
        System.out.println("Отримана матриця: \n");
        ImmutablePrintMatrix(diagonal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return Arrays.equals(ImmutableMatrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ImmutableMatrix);
    }

    public static void ImmutablePrintMatrix(int[][] matrix)
    {
        for (int r = 0; r < matrix.length; r++)
        {
            for (int c = 0; c < matrix[0].length; c++)
            {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}