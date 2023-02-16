import java.util.Scanner;

public class Input_Output_ComplexMatrix {
    public void buttonChoice(int button) throws Matrix.MatrixExpection {
        Scanner scanner = new Scanner(System.in);
        if (button == 5){
            System.out.println("Enter number of rows and columns of your matrix.");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            Matrix newMatrix = new Matrix(rows, cols);
            System.out.println("Enter elements of your matrix. Each on a separate line.");
            newMatrix.CreateMatrix(rows, cols);
            System.out.println("It's your matrix.");
            newMatrix.showMatrix();
        }
        else if (button == 6){
            System.out.println("Enter number of rows and columns of your first matrix.");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            Matrix first = new Matrix(rows, cols);
            System.out.println("Enter elements of your matrix. Each on a separate line.");
            first.CreateMatrix(rows, cols);
            System.out.println("It's your first matrix.");
            first.showMatrix();
            System.out.println("Enter number of rows and columns of your second matrix.");
            rows = scanner.nextInt();
            cols = scanner.nextInt();
            Matrix second = new Matrix(rows, cols);
            System.out.println("Enter elements of your matrix. Each on a separate line.");
            second.CreateMatrix(rows, cols);
            System.out.println("It's your second matrix.");
            second.showMatrix();
            System.out.println("It's the summary matrix of your two matrices.");
            first.addMatrices(second).showMatrix();
        }
        else if (button == 7){
            System.out.println("Enter number of rows and columns of your first matrix.");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            Matrix first = new Matrix(rows, cols);
            System.out.println("Enter elements of your matrix. Each on a separate line.");
            first.CreateMatrix(rows, cols);
            System.out.println("It's your first matrix.");
            first.showMatrix();
            System.out.println("Enter number of rows and columns of your second matrix.");
            rows = scanner.nextInt();
            cols = scanner.nextInt();
            Matrix second = new Matrix(rows, cols);
            System.out.println("Enter elements of your matrix. Each on a separate line.");
            second.CreateMatrix(rows, cols);
            System.out.println("It's your second matrix");
            second.showMatrix();
            System.out.println("It's the summary matrix of your two matrices.");
            first.multiplyMatrices(second).showMatrix();
        }
        else if (button == 8){
            System.out.println("Enter number of rows and columns of your matrix.");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            Matrix newMatrix = new Matrix(rows, cols);
            System.out.println("Enter elements of your matrix. Each on a separate line.");
            newMatrix.CreateMatrix(rows, cols);
            System.out.println("It's your original matrix.");
            newMatrix.showMatrix();
            System.out.println("It's your transpose matrix.");
            newMatrix.transpose().showMatrix();
        }
    }
}
