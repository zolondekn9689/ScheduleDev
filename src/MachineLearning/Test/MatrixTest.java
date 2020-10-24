package MachineLearning.Test;

import MachineLearning.Matrix;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {

    }

    @org.junit.jupiter.api.Test
    void matrixAddTest1()
    {
        // First matrix.
        double x[][] = { {1, 2}, {3, 9}, {4, 9}
        };

        // second matrix.
        double y[][] = {
                {2, 4}, {5, 5}, {0, 0}
        };

        double result[][] = {{3, 6}, {8, 14}, {4, 9}
        };

        double[][] r = Matrix.MatrixAdd(x, y);
        assertArrayEquals(result, r);

    }
}