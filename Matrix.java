import java.util.Scanner;

public class Matrix {
    int rows; //number of rows of matrix
    int cols; //numbers of columns of matrix
    ComplexNum [][] complexMatrix;

    // matrix constructor
    public Matrix(int rows, int cols) {
        complexMatrix = new ComplexNum[rows][cols];
        this.rows = rows;
        this.cols = cols;
    }

    public void CreateMatrix(int rows, int cols){
        double real;
        double img;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Scanner scanner = new Scanner(System.in);
                real = scanner.nextDouble();
                img = scanner.nextDouble();
                complexMatrix[i][j] = new ComplexNum(real, img);
            }
        }
    }

    //representation of matrix
    public void showMatrix(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf(complexMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //transpose matrix
    public Matrix transpose(){
        Matrix transMatrix = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                transMatrix.complexMatrix[j][i] = complexMatrix[i][j];
            }
        }
        return transMatrix;
    }

    //sum of two matrices
    public Matrix addMatrices(Matrix matrix2) throws MatrixExpection {
        Matrix sumMatrix;
        if (!checkSize(this, matrix2, true))
            throw new MatrixExpection("Sizes of matrices are not equal");
        else {
            sumMatrix = new Matrix(rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumMatrix.complexMatrix[i][j] =
                            this.complexMatrix[i][j].sum(matrix2.complexMatrix[i][j]);
                }
            }
        }
        return sumMatrix;
    }

    //multiplication of two matrices
    public Matrix multiplyMatrices(Matrix matrix2) throws MatrixExpection{
        Matrix multMatrix;
        if (!checkSize(this, matrix2, false))
            throw new MatrixExpection("Number of rows of first matrix must be equal to number of columns of second matrix");
        else{
            multMatrix = new Matrix(this.rows, matrix2.cols);
            for (int i = 0; i < this.rows; i++){
                for (int j = 0; j < matrix2.cols; j++){
                    multMatrix.complexMatrix[i][j] = new ComplexNum(0, 0);
                    for (int k = 0; k < this.cols; k++) {
                        ComplexNum elem = this.complexMatrix[i][k].mult(matrix2.complexMatrix[k][j]);
                        multMatrix.complexMatrix[i][j] = multMatrix.complexMatrix[i][j].sum(elem);
                    }
                }
            }
        }

        return multMatrix;
    }

    //check size of matrices for addition and multiplication
    public boolean checkSize(Matrix matrix1, Matrix matrix2, boolean forAddition){
        if (forAddition)
            return (matrix1.rows == matrix2.rows) && (matrix1.cols == matrix2.cols);
        else
            return (matrix1.cols == matrix2.rows);
    }

    class MatrixExpection extends Exception {
        private final String issue;

        MatrixExpection(String issue){ this.issue = issue; }

        public String issue(){ return this.issue; }
    }
}