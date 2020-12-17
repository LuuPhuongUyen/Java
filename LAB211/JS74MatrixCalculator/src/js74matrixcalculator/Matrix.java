/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js74matrixcalculator;

/**
 *
 * @author PC
 */
public class Matrix {

    public int[][] matrix;
    int x, y;
    Validation v = new Validation();

    public Matrix(int x, int y) {
        this.matrix = new int[x][y];
        this.x = x;
        this.y = y;
    }

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.x = matrix.length;
        this.y = matrix[0].length;
    }

    public Matrix() {
        this.matrix = inputMatrix();
        this.x = matrix.length;
        this.y = matrix[0].length;
    }

    private int[][] inputMatrix() {
        System.out.print("Enter Row Matrix: ");
        int row = v.checkInputInt();
        System.out.print("Enter Colum Matrix: ");
        int col = v.checkInputInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix[" + i + "]" + "[" + j + "]:");
                matrix[i][j] = v.checkInputInt();
            }
            System.out.println("");
        }
        System.out.println("------ Input done------");
        return matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void Display() {
        System.out.println("-----matrix-----");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println("");
        }
        System.out.println("----------------");
    }

    public int[][] additionMatrix(Matrix matrix2) {
        if (matrix2.getX() == x && matrix2.getY() == y) {
            int[][] result = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    result[i][j] = matrix[i][j] + matrix2.getMatrix()[i][j];
                }
            }
            return result;
        }
        return null;
    }

    public int[][] subtractionMatrix(Matrix matrix2) {
        if (matrix2.getX() == x && matrix2.getY() == y) {
            int[][] result = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    result[i][j] = matrix[i][j] - matrix2.getMatrix()[i][j];
                }
            }
            return result;
        }
        return null;
    }

    public int[][] multiplicationMatrix(Matrix matrix2) {
        if (y != matrix2.getX()) {
            return null;
        }
        int[][] matrixResult = new int[x][matrix2.getY()];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < matrix2.getY(); j++) {
                matrixResult[i][j] = 0;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < matrix2.getY(); j++) {
                for (int k = 0; k < y; k++) {
                    matrixResult[i][j] += matrix[i][k] * matrix2.getMatrix()[k][j];
                }
            }
        }
        return matrixResult;
    }
}
