package lab1;

import java.util.Scanner;

public class ClassLab1 {
    public static final int MAX_DIMENSION = 20;
    public static final int MIN_DIMENSION = 1;
    public static final int MAX_VALUE = 17;
    public static final int MIN_VALUE = 9;

    public static void main(String[] args) {
        String manual = "m", random = "r";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter x: ");
        int x = enterMatrixDimensions(in);
        System.out.println("Enter y: ");
        int y = enterMatrixDimensions(in);
        System.out.println("Choose type of filling in the matrix:");
        System.out.println("m - manual");
        System.out.println("r - random");
        String fillInMethod = in.next();
        if (fillInMethod.equals(manual)) {
            createManual(x, y, in);
        }
        if (fillInMethod.equals(random)) {
            createRandom(x, y, in);
        }
    }

    public static int enterMatrixDimensions(Scanner in) {
        int number;
        number = in.nextInt();
        while (number > MAX_DIMENSION || number < MIN_DIMENSION) {
            System.out.println("number must be between " + MIN_DIMENSION + " and "
                    + MAX_DIMENSION + "\n Please enter other number:");
            number = in.nextInt();
        }
        return number;
    }

    public static int[][] createRandom(int sizeX, int sizeY, Scanner in) {
        int[][] matrix = new int[sizeX][sizeY];
        int amountOfNumber = MAX_VALUE + MIN_VALUE + 1;
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * amountOfNumber - MIN_VALUE);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        calculateAndShow(matrix);
        return matrix;
    }

    public static int[][] createManual(int sizeX, int sizeY, Scanner in) {
        int[][] matrix = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print("Enter next number: ");
                matrix[i][j] = in.nextInt();
                System.out.print(" ");
            }
        }
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        calculateAndShow(matrix);
        return matrix;

    }

    private static void calculateAndShow(int[][] matrix) {
        findMax(matrix);
        findMin(matrix);
        findAverage(matrix);
    }

    private static int findMin(int[][] matrix) {
        int minNumber = matrix[1][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minNumber >= matrix[i][j])
                    minNumber = matrix[i][j];
            }
        }
        System.out.println("Matrix minimum " + minNumber);
        return minNumber;
    }

    private static int findMax(int[][] matrix) {
        int maxNumber = matrix[1][1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maxNumber <= matrix[i][j])
                    maxNumber = matrix[i][j];
            }
        }
        System.out.println("Matrix maximum " + maxNumber);
        return maxNumber;
    }

    private static double findAverage(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        double aver = (1.0 * sum) / (matrix.length * matrix[0].length);
        System.out.println("Matrix average " + aver);
        return aver;
    }
}