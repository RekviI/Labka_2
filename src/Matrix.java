import java.util.*;

public class Matrix
{
    int[][] matrix;
    private void setMatrix()
    {
        this.matrix = new int[0][0];
    }
    private void setMatrix(int a, int b)
    {
        this.matrix = new int[a][b];
    }
    private void setMatrix(int[][]matrix)
    {
        this.matrix = matrix;
    }
    public Matrix()
    {
        this.setMatrix();
    }
    public Matrix(int a, int b)
    {
        this.setMatrix(a, b);
    }
    public Matrix(int[][] matrix)
    {
        this.setMatrix(matrix);
    }
    public void MatrixCreate()
    {
        System.out.println("Введіть кількість рядків в матриці");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Введіть кількість стовпців в матриці");
        int column = sc.nextInt();
        matrix = new int[row][column];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                System.out.println(String.format("Введіть [%d][%d] елемент", r+1, c+1));
                matrix[r][c] = sc.nextInt();
            }
        }
        System.out.println("Отримана матриця: \n");
        printMatrix(matrix);
    }
    public void MatrixAuto(int min, int max)
    {
        Random random = new Random();
        System.out.println("Введіть кількість рядків в матриці");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Введіть кількість стовпців в матриці");
        int column = sc.nextInt();
        matrix = new int[row][column];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                matrix[r][c] = random.nextInt(max-min) +min;
            }
        }
        System.out.println("Отримана матриця: ");
        printMatrix(matrix);
    }
    /*public int[][] MatrixFullAuto(int size, int max, int min)
    {
        Random random = new Random();
        Random random1 = new Random();
        Random random2 = new Random();
        int row = random1.nextInt(size)+1;
        int column = random2.nextInt(size)+1;
        int[][] first = new int[row][column];
        for (int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                first[r][c] = random.nextInt(max-min)+min;
            }
        }
        System.out.println("Отримана матриця: \n");
        printMatrix(first);
        return first;
    }*/
    public void GetElement(int[][]matrix)
    {
        System.out.println("Введіть номер рядка елементу: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.println("Введіть номер ствопця елементу: ");
        int j = input.nextInt();
        System.out.println(matrix[i-1][j-1]);
        System.out.println("");
    }
    public void GetRow(int[][] matrix, int i)
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
    public void GetColumn(int[][] matrix, int j)
    {
        System.out.println("Введіть номер стовпця: ");
        Scanner input = new Scanner(System.in);
        int specificColumn = input.nextInt();
        for(int column = 0; column < j; column++)
        {
            System.out.println(matrix[column][specificColumn-1]);
        }
    }
    public static void DiagonalMatrix(int[] vector)
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
        printMatrix(diagonal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }

    public static void printMatrix(int[][] matrix)
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