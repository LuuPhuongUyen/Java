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
public class JS74MatrixCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validation v = new Validation();
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        int[][] matrixResult;
        Matrix result;
        while (true) {
            int choice = v.menu();
            switch (choice) {
                case 1:
                    matrixResult = matrix1.additionMatrix(matrix2);
                    if (matrixResult == null) {
                        System.out.println("Can't be added");
                    } else {
                        result = new Matrix(matrixResult);
                        result.Display();
                    }
                    break;
                case 2:
                    matrixResult = matrix1.subtractionMatrix(matrix2);
                    if (matrixResult == null) {
                        System.out.println("Can't be subtracted");
                    } else {
                        result = new Matrix(matrixResult);
                        result.Display();
                    }
                    break;
                case 3:
                    matrixResult = matrix1.multiplicationMatrix(matrix2);
                    if (matrixResult == null) {
                        System.out.println("Can't be multipled");
                    } else {
                        result = new Matrix(matrixResult);
                        result.Display();
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
