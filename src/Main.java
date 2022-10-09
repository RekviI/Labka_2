import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Виберіть пункт меню: ");
        System.out.println("1. Створити пусту матрицю");
        System.out.println("2. Створити матрицю заданого розміру");
        System.out.println("3. Створити діагональну матрицю за вектором");
        System.out.println("4. Перетворити матрицю в трикутну");
        System.out.println("0. Вихід");
        Scanner input = new Scanner(System.in);
        do
        {
            int Menu = input.nextInt();
            switch (Menu) {
                case (1):
                    Matrix empty = new Matrix();
                    System.out.println("Створили пусту матрицю");
                    int[][] arr = {};
                    System.out.println(Arrays.toString(arr));
                    break;
                case (2):
                    Matrix matrix = new Matrix();
                    System.out.println("Виберіть метод заповнення матриці");
                    System.out.println("1. Самостійно");
                    System.out.println("2. Автоматично");
                    int fill = input.nextInt();
                    if (fill == 1)
                    {
                        matrix.MatrixCreate();
                        System.out.println("Виберіть дії з матрицею: ");
                        System.out.println("1. Повернути розмірність матриці");
                        System.out.println("2. Вивести елемент");
                        System.out.println("3. Вивести рядок");
                        System.out.println("4. Вивести стовпчик");
                        System.out.println("5. Переглянути матрицю");
                        System.out.println("6. Створити копію матриці");
                        System.out.println("7. Повернутися назад");
                        int opt = input.nextInt();
                        boolean bool = true;
                        while(bool == true)
                        {
                            switch (opt)
                            {
                                case (1):
                                    System.out.println(String.format("Розмірність матриці: [%d]x[%d] ", matrix.matrix.length, matrix.matrix[0].length));
                                    break;
                                case (2):
                                    matrix.GetElement(matrix.matrix);
                                    break;
                                case (3):
                                    matrix.GetRow(matrix.matrix, matrix.matrix.length);
                                    break;
                                case (4):
                                    matrix.GetColumn(matrix.matrix, matrix.matrix[0].length);
                                    break;
                                case (5):
                                    matrix.printMatrix(matrix.matrix);
                                    break;
                                case(6):
                                    Matrix CopyMatrix = new Matrix(matrix.matrix);
                                    CopyMatrix.printMatrix(CopyMatrix.matrix);
                                    break;
                                case(7):
                                    bool = false;
                                    break;
                            }
                            int opt1 = input.nextInt();
                            opt = opt1;
                        }
                        break;
                    }
                    else if (fill == 2)
                    {
                        matrix.MatrixAuto(-9, 9);
                        System.out.println("Виберіть дії з матрицею: ");
                        System.out.println("1. Повернути розмірність матриці");
                        System.out.println("2. Вивести елемент");
                        System.out.println("3. Вивести рядок");
                        System.out.println("4. Вивести стовпчик");
                        System.out.println("5. Переглянути матрицю");
                        System.out.println("6. Створити копію матриці");
                        System.out.println("7. Повернутися назад");
                        int opt = input.nextInt();
                        boolean bool = true;
                        while(bool == true)
                        {
                            switch (opt)
                            {
                                case (1):
                                    System.out.println(String.format("Розмірність матриці: [%d]x[%d] ", matrix.matrix.length, matrix.matrix[0].length));
                                    break;
                                case (2):
                                    matrix.GetElement(matrix.matrix);
                                    break;
                                case (3):
                                    matrix.GetRow(matrix.matrix, matrix.matrix.length);
                                    break;
                                case (4):
                                    matrix.GetColumn(matrix.matrix, matrix.matrix[0].length);
                                    break;
                                case (5):
                                    matrix.printMatrix(matrix.matrix);
                                    break;
                                case(6):
                                    Matrix CopyMatrix = new Matrix(matrix.matrix);
                                    CopyMatrix.printMatrix(CopyMatrix.matrix);
                                    break;
                                case(7):
                                    bool = false;
                                    break;
                            }
                            int opt1 = input.nextInt();
                            opt = opt1;
                        }
                        break;
                    }
                    break;
                case (3):
                    System.out.println("Введіть вектор діагоналі: ");
                    Scanner user_input = new Scanner(System.in);
                    String vector = user_input.nextLine();
                    String[] numbersStr = vector.split(",");
                    int[] numbers = new int[numbersStr.length];
                    for (int i=0; i<numbersStr.length; i++)
                    {
                        numbers[i] = Integer.parseInt(numbersStr[i]);
                    }
                    Matrix diagonal = new Matrix();
                    diagonal.DiagonalMatrix(numbers);
                    break;
                case(4):
                    System.out.println("Введіть тип трикутної матриці");
                    System.out.println("1. Верхня трикутна матриця");
                    System.out.println("2. Нижня трикутна матриця");
                    int triangle = input.nextInt();
                    if (triangle == 1)
                    {

                    }
                    else if (triangle ==2)
                    {

                    }
                    break;
                case (0):
                    System.exit(0);
                default:
                    System.out.println("Неправильний пункт меню, спробуйте ще раз");
            }
        } while (true);
    }

}