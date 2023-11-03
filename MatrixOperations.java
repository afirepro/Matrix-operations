import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MatrixOperations {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("WELCOME THIS PROGRAM IS FOR PERFOROMING MATRIX OPERATION");
        System.out.println();
        System.out.println("Addition:\"add\"");
        System.out.println("Subtraction:\"sub\"");
        System.out.println("Multiplication:\"mul\"");
        System.out.println("Rank:\"rn\"");
        System.out.println("Scalar multiplication:\"sm\"");
        System.out.println("To know type of matrix:\"ty\"");
        System.out.println();
        String status;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("WRITE SHORTFORM GIVEN AFTER OPERATION::--::");
            String operation = scanner.next();
            switch (operation) {
                case "add":
                    MAT_add();
                    break;
                case "sub":
                    MAT_sub();
                    break;
                case "mul":
                    MAT_mul();
                    break;
                case "rn":
                    MAT_rank();
                    break;
                case "sm":
                    MAT_sm();
                    break;
                case "ty":
                    MAT_ty();
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.print("WRITE Stop WHEN YOU WANT TO OVER PROGRAM::--::");
            status = scanner.next();
        } while (!status.equalsIgnoreCase("Stop"));
    }

    public static void MAT_add() {
        System.out.println();
        System.out.println("WELCOME");
        System.out.println("Remember matrix addition will always performed when\norder is same (order is number of rows and coloumn).");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter NO. of rows:");
        int row = scanner.nextInt();
        System.out.print("enter NO. of coloumns:");
        int coloumn = scanner.nextInt();
        if (row != coloumn) {
            System.out.println("please enter value of row and coloumn same");
        } else {
            int[][] a = new int[row][coloumn];
            int[][] b = new int[row][coloumn];
            System.out.println("ENTER MATRIX:1 ELEMENTS:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("ENTER MATRIX:2 ELEMENTS:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            System.out.println();
            System.out.println("FIRST MATRIX:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("SECOND MATRIX:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("ADDITION OF MATRIX IS");
            for (int k = 0; k < row; k++) {
                for (int l = 0; l < coloumn; l++) {
                    System.out.print(a[k][l] + b[k][l] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void MAT_sub() {
        System.out.println();
        System.out.println("WELCOME");
        System.out.println("Remember matrix subtraction will always performed when\norder is same (order is number of rows and coloumn).");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter NO. of rows:");
        int row = scanner.nextInt();
        System.out.print("enter NO. of coloumns:");
        int coloumn = scanner.nextInt();
        if (row != coloumn) {
            System.out.println("please enter value of row and coloumn same");
        } else {
            int[][] a = new int[row][coloumn];
            int[][] b = new int[row][coloumn];
            System.out.println("ENTER MATRIX:1 ELEMENTS:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("ENTER MATRIX:2 ELEMENTS:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            System.out.println();
            System.out.println("FIRST MATRIX:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("SECOND MATRIX:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("SUBTRACTION OF MATRIX IS");
            for (int k = 0; k < row; k++) {
                for (int l = 0; l < coloumn; l++) {
                    System.out.print(a[k][l] - b[k][l] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void MAT_mul() {
        System.out.println();
        System.out.println("WELCOME");
        System.out.println("Remember matrix multiplication is performed when number coloumn of first matrix == number rows of second");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter NO. of rows in A[...][]:::");
        int row_1 = scanner.nextInt();
        System.out.print("Enter NO. of coloumns in A[][...]:::");
        int coloumn_1 = scanner.nextInt();
        System.out.print("Enter NO. of rows in b[...][]:::");
        int row_2 = scanner.nextInt();
        System.out.print("Enter NO. of coloumns in B[][...]:::");
        int coloumn_2 = scanner.nextInt();
        int[][] a = new int[row_1][coloumn_1];
        int[][] b = new int[row_2][coloumn_2];
        if (coloumn_1 != row_2) {
            System.out.println("SORRY NUMBER OF COLOUMN IN a[][] NOT EQUAL TO ROW IN B[][]");
        } else {
            System.out.println("ENTER MATRIX:1 ELEMENTS:");
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < coloumn_1; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println("ENTER MATRIX:2 ELEMENTS:");
            for (int i = 0; i < row_2; i++) {
                for (int j = 0; j < coloumn_2; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            System.out.println();
            System.out.println("FIRST MATRIX:");
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < coloumn_1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("SECOND MATRIX:");
            for (int i = 0; i < row_2; i++) {
                for (int j = 0; j < coloumn_2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("MULTIPLICATION OF MATERIX IS:");
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < coloumn_2; j++) {
                    int sum = 0;
                    for (int k = 0; k < row_2; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void MAT_rank() {
        System.out.println();
        System.out.println("WELCOME");
        System.out.println();
    }

    public static void MAT_sm() {
        System.out.println();
        System.out.println("WELCOME");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER YOU WANT TO MULTIPLY WITH MATRIX:::");
        int number = scanner.nextInt();
        System.out.print("Enter NO. of rows:");
        int row = scanner.nextInt();
        System.out.print("Enter NO. of coloumns:");
        int coloumn = scanner.nextInt();
        int[][] a = new int[row][coloumn];
        System.out.println("ENTER MATRIX:1 ELEMENTS:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("MATRIX:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("AFTER SCALAR MULTIPLICATION MATRIX:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(number * a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void MAT_ty() {
        System.out.println();
        System.out.println("WELCOME");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter NO. of rows:");
        int row = scanner.nextInt();
        System.out.print("Enter NO. of coloumns:");
        int coloumn = scanner.nextInt();
        int[][] a = new int[row][coloumn];
        System.out.println("ENTER MATRIX ELEMENTS:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("MATRIX:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        if (row == 1 && coloumn > 1) {
            System.out.println("ABOVE MATRIX IS ROW MATRIX");
        }
        if (coloumn == 1 && row > 1) {
            System.out.println("ABOVE MATRIX IS COLOUMN MATRIX");
        }
        if (row > 1 && coloumn > 1 && row != coloumn) {
            System.out.println("ABOVE MATRIX IS RECTANGULAR MATRIX");
        }
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count == row * coloumn) {
            System.out.println("ABOVE MATRIX IS NULL OR ZERO MATRIX");
        }
        if (row == coloumn && row > 1 && coloumn > 1) {
            System.out.println("ABOVE MATRIX IS SQUARE MATRIX");
            int count_1 = 0, count_2 = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < coloumn; j++) {
                    if (i == j) {
                        if (a[i][j] == 1) {
                            count_1++;
                        }
                        if (a[i][j] != 1 || a[i][j] != 0) {
                            count_2++;
                        }
                    } else {
                        if (a[i][j] == 0) {
                            count_1--;
                            count_2--;
                        }
                    }
                }
            }
            if (count_1 == (2 * row - row * coloumn)) {
                System.out.println("ABOVE MATRIX IS IDENTITY MATRIX");
            }
            if (count_2 == (2 * row - row * coloumn)) {
                System.out.println("ABOVE MATRIX IS DIAGONAL MATRIX");
                int count_3 = 0, check = a[0][0];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < coloumn; j++) {
                        if (a[i][j] == check) {
                            count_3++;
                        }
                    }
                }
                if (count_3 == row) {
                    System.out.println("ABOVE MATRIX IS SCALAR MATRIX");
                }
            }
        }
    }
}        
    
