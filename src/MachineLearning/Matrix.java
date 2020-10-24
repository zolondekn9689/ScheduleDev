package MachineLearning;

import javafx.scene.control.Alert;

public class Matrix {

    private Matrix()
    {

    }




    /**
     * Returns the addition of a matrix.
     * @param matrixA MAtrix a to add.
     * @param matrixB MAtrix b to add.
     * @return
     */
    public static double[][] MatrixAdd(double matrixA[][], double matrixB[][])
    {

        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB.length)
        {

        }


        double result[][] = new double[matrixA.length][matrixB[0].length];

        for (int x = 0; x < matrixA.length; x++)
        {
            for (int y = 0; y < matrixA[0].length; y++)
            {
                result[x][y] = matrixA[x][y] + matrixB[x][y];
            }
        }


        return result;
    }










}
