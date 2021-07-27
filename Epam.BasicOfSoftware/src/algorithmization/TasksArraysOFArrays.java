package algorithmization;

import java.util.*;

public class TasksArraysOFArrays {
    public static void task1(int[][] arrays) {
        for (int i = 1; i < arrays.length; i += 2) {
            if (arrays[i][0] > arrays[i][arrays[i].length - 1]) {
                System.out.println("Column\t" + i);
                for (int j = 0; j < arrays[i].length; j++) {
                    System.out.print(arrays[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void task2(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i][i]);
        }
    }

    public static void task3(int[][] arrays, int column, int string) {
        if (!(column > arrays.length - 1)) {
            System.out.printf("Column %d has:\t", column);
            for (int[] array : arrays) {
                System.out.print(array[column] + "\t");
            }
            System.out.println();
        } else {
            System.err.println("This matrix has long is\t" + arrays.length);
        }
        if (!(string > arrays.length - 1)) {
            System.out.printf("String %d has:\t", string);
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[string][i] + "\t");
            }
            System.out.println();
        } else {
            System.err.println("This matrix has long is\t" + arrays.length);
        }
    }

    public static void task4(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = array.length - j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task5(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j][i] = j + 1;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = array[i].length - 1; j >= 0; j--) {
                if (n - j - i - 1 < 0) {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task6(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array.length / 2; j++) {
                if (i - j <= 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = array.length / 2; j < array.length; j++) {
                if (i - j <= 0) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = array.length - 1; j >= array.length / 2; j--) {
                if (n - j - i - 1 <= 0) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array.length / 2; j++) {
                if (n - j - i - 1 >= 0) {
                    array[j][i] = 1;
                } else {
                    array[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void task7(int n) {
        double[][] matrix = new double[n][n];
        int amountPositiveNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n));
                if (matrix[i][j] > 0) amountPositiveNumber++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%.2f \t", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("this matrix contains %d positive number", amountPositiveNumber);
    }

    public static void task8(int[][] matrix, int number1, int number2) {
        int[][] newMatrix = new int[0][];
        if (number1 > matrix.length && number2 > matrix.length) {
            System.err.println("You entered incorrect value");
        } else {

            newMatrix = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
            for (int i = 0; i < matrix.length; i++) {
                newMatrix[i][number1] = matrix[i][number2];
                newMatrix[i][number2] = matrix[i][number1];
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task9(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int amount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                amount += matrix[j][i];
            }
            if (amount > max) {
                max = amount;
            }
            System.out.printf("Amount number %d column is %d\n", i, amount);
        }
        System.out.printf("This matrix has max is %d\n", max);
    }

    public static void task10(int[][] matrix) {
        List<Integer> positiveNumber = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                positiveNumber.add(matrix[i][i]);
            }
        }
        for (int n : positiveNumber) {
            System.out.print(n + "\t");
        }
        System.out.println();
    }

    public static void task11() {
        Random random = new Random();
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            int count5 = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
                if (matrix[i][j] == 5) {
                    count5++;
                }
            }
            if (count5 > 2) {
                System.out.printf("String %d has number five %d times\n", i, count5);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task12(int[][] matrix) {
        int[][] matrixSortAscending = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < matrixSortAscending.length; i++) {
            Arrays.sort(matrixSortAscending[i]);
        }
        System.out.println("Matrix's string sorted ascending order");
        for (int i = 0; i < matrixSortAscending.length; i++) {
            for (int j = 0; j < matrixSortAscending[i].length; j++) {
                System.out.print(matrixSortAscending[i][j] + "\t");
            }
            System.out.println();
        }
        Integer[][] matrixSortDescending = copyMatrix(matrix);
        for (int i = 0; i < matrixSortDescending.length; i++) {
            Arrays.sort(matrixSortDescending[i], Collections.reverseOrder());
        }
        System.out.println("Matrix's string sorted descending order");
        for (int i = 0; i < matrixSortDescending.length; i++) {
            for (int j = 0; j < matrixSortDescending[i].length; j++) {
                System.out.print(matrixSortDescending[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void task13(int[][] matrix) {
        int matrixColumnLengths = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrixColumnLengths = matrix[i].length;
        }
        Integer[][] matrixSortAscending = new Integer[matrix.length][matrixColumnLengths];
        for (int i = 0; i < matrixSortAscending.length; i++) {
            Integer[] column = new Integer[matrixSortAscending.length];
            for (int j = 0; j < matrixSortAscending[i].length; j++) {
                column[j] = matrix[j][i];
            }
            Arrays.sort(column);
            for (int j = 0; j < column.length; j++) {
                matrixSortAscending[j][i] = column[j];
            }
        }
        System.out.println("Matrix's string sorted ascending order");
        for (int i = 0; i < matrixSortAscending.length; i++) {
            for (int j = 0; j < matrixSortAscending[i].length; j++) {
                System.out.print(matrixSortAscending[i][j] + "\t");
            }
            System.out.println();
        }
        Integer[][] matrixSortDescending = new Integer[matrix.length][matrixColumnLengths];
        for (int i = 0; i < matrixSortDescending.length; i++) {
            Integer[] column = new Integer[matrixSortDescending.length];
            for (int j = 0; j < matrixSortDescending[i].length; j++) {
                column[j] = matrix[j][i];
            }
            Arrays.sort(column, Collections.reverseOrder());
            for (int j = 0; j < column.length; j++) {
                matrixSortDescending[j][i] = column[j];
            }
        }
        System.out.println("Matrix's string sorted descending order");
        for (int i = 0; i < matrixSortDescending.length; i++) {
            for (int j = 0; j < matrixSortDescending[i].length; j++) {
                System.out.print(matrixSortDescending[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task14(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], 0);
        }
        for (int i = 0; i < matrix.length; i++) {
            int count = i;
            for (int j = 0; j < matrix[i].length; j++) {
                if (count > 0 && i < matrix[i].length) {
                    matrix[j][i] = 1;
                }
                count--;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task15(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] = max;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task16(int n) {
        int[][] magicMatrix = new int[n][n];
        if (n % 4 == 0) {
            linear(magicMatrix, n);
            for (int i = 0; i < n >> 1; i++)
                for (int j = (i + 1) & 1; j < n >> 1; j += 2) {
                    reflect(magicMatrix, i, j, n);
                    reflect(magicMatrix, i, n - j - 1, n);
                }
        } else if (n % 2 != 0) {
            int c = 1;
            long next = n;
            long last = next * next;
            int i = 0;
            int j = (int) (next >> 1);
            while (c <= last) {
                magicMatrix[i][j] = c++;
                if (c > next) {
                    next += n;
                    i++;
                } else {
                    if (--i < 0) i += n;
                    if (++j >= n) j -= n;
                }
            }
        } else {
            n -= 2;
            linear(magicMatrix, n);
            for (int i = 0; i < n >> 1; i++)
                for (int j = (i + 1) & 1; j < n >> 1; j += 2) {
                    reflect(magicMatrix, i, j, n);
                    reflect(magicMatrix, i, n - j - 1, n);
                }
            int delta = (n + 1) << 1;
            for (int i = n; i > 0; i--)
                for (int j = n; j > 0; j--)
                    magicMatrix[i][j] = magicMatrix[i - 1][j - 1] + delta;
            n += 2;
            final int LAST = n - 1;
            int d = n * n + 1;
            int m = n >> 1;
            magicMatrix[0][0] = (m << 1) + m - 1;
            magicMatrix[0][LAST] = 1;
            magicMatrix[LAST][0] = d - 1;
            magicMatrix[LAST][LAST] = d + 1 - m - (m << 1);
            int c = 1;
            for (int i = 1; i < m - 1; i++) {
                int t = (i << 1) + 1;
                magicMatrix[0][c] = t;
                magicMatrix[LAST][c++] = d - t;
            }
            for (int j = 1; j <= m; j++) {
                int t = j << 1;
                magicMatrix[LAST][c] = t;
                magicMatrix[0][c++] = d - t;
            }
            c = 2;
            magicMatrix[1][0] = (m << 1) - 1;
            magicMatrix[1][LAST] = d - (m << 1) + 1;
            for (int i = 1; i <= m >> 1; i++) {
                int t = m + (m << 1) - i - 1;
                magicMatrix[c][0] = t;
                magicMatrix[c++][LAST] = d - t;
            }
            for (int j = 1; j <= (m >> 1) + 1; j++) {
                int t = (m << 2) - j - 1;
                magicMatrix[c][LAST] = t;
                magicMatrix[c++][0] = d - t;
            }
            for (int q = 1; q < m >> 1; q++) {
                int t = (m << 1) + m + q - 1;
                magicMatrix[c][0] = t;
                magicMatrix[c++][LAST] = d - t;
                t = (m << 1) + q;
                magicMatrix[c][LAST] = t;
                magicMatrix[c++][0] = d - t;
            }
        }
        for (int k = 0; k < magicMatrix.length; k++) {
            for (int l = 0; l < magicMatrix[k].length; l++) {
                System.out.print(magicMatrix[k][l] + "\t");
            }
            System.out.println();
        }
    }

    private static void linear(int[][] matrix, int n) {
        int c = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = c++;
    }

    private static void reflect(int[][] matrix, int i, int j, int n) {
        int t = matrix[i][j];
        matrix[i][j] = matrix[n - i - 1][n - j - 1];
        matrix[n - i - 1][n - j - 1] = t;
    }

    private static Integer[][] copyMatrix(int[][] matrix) {
        int matrixColumnLengths = 0;
        for (int i = 0; i < matrix.length; i++) {
            matrixColumnLengths = matrix[i].length;
        }
        Integer[][] matrixSortDescending = new Integer[matrix.length][matrixColumnLengths];
        for (int i = 0; i < matrixSortDescending.length; i++) {
            for (int j = 0; j < matrixSortDescending[i].length; j++) {
                matrixSortDescending[i][j] = matrix[i][j];
            }
        }
        return matrixSortDescending;
    }
}

