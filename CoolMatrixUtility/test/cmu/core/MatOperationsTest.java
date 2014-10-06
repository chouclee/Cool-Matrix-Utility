package cmu.core;

import org.junit.Test;

import cmu.core.Mat;
import cmu.core.MatOp.NormType;

public class MatOperationsTest {
	// L2 norm test on empty matrix
    @Test
    public void TestL2_Norm_EmptyMatrix() {
    	double[] data = {};
    	Mat mat = new Mat(0, 0, data);
    	double m = MatOp.norm(mat, NormType.NORM_L2);
    	double expected = 0;
    	org.junit.Assert.assertEquals("Norm L2 failure on empty matrix", expected, m, 0.0000000001);
    }	

    // L2 norm test on vector
	@Test
    public void TestL2_Norm_1by4() {
    	double[] data = {1,2,3,4};
    	Mat mat = new Mat(1, 4, data);
       	double m = MatOp.norm(mat, NormType.NORM_L2);
    	double expected = 5.477225575051661134569697828008;
    	org.junit.Assert.assertEquals("Norm L2 failure on empty matrix", expected, m, 0.00001);
    }	
	
    @Test
    public void TestL2_Norm_4by1() {
    	double[] data = {1,2,3,4};
    	Mat mat = new Mat(4, 1, data);
       	double m = MatOp.norm(mat, NormType.NORM_L2);
    	double expected = 5.477225575051661134569697828008;;
    	org.junit.Assert.assertEquals("Norm L2 failure on empty matrix", expected, m, 0.00001);
    }
    
    @Test
    public void TestL2_Norm_5by5() {
    	double[] data = new double[25];
    	for (int i = 0; i < 25; i++) {
    		data[i] = i + 1;
    	}
    	Mat mat = new Mat(5, 5, data);
    	double m = MatOp.norm(mat, NormType.NORM_L2);
    	double expected = 74.3303;
    	org.junit.Assert.assertEquals("Norm L2 failure on empty matrix", expected, m, 0.0001);
    }
}

