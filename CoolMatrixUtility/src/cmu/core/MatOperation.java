package cmu.core;

public class MatOperation {
	/**
	 * Generalized matrix multiplication
	 * @param src1
	 * @param src2
	 * @return
	 */
	public static<T extends Number> Mat<T> gemm(Mat<T> src1, Mat<T> src2) {
		Mat<T> result = new Mat<T>();
		return result;
	}
	
	/**
	 * Per-element sum of two matrix 
	 * @param src1
	 * @param src2
	 * @return
	 */	
	public static<T extends Number> Mat<T> add(Mat<T> src1, Mat<T> src2) {
		
	}
	
	/*
	 * Enumerate supported norm operation type
	 */
	private static enum NormType {NORM_L1, NORM_L2};
	
	/**
	 * Calculates a matrix norm, norm type is specified by NormType 
	 * @param src
	 * @param normType
	 * @return
	 */
	public static <T extends Number> double norm(Mat<T> src, NormType normType) {
		return 0.0;
	}
}
