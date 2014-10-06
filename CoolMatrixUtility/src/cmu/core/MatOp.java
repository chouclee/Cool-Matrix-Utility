package cmu.core;

public class MatOp {
	/**
	 * Generalized matrix multiplication
	 * 
	 * @param src1
	 * @param src2
	 * @return
	 */
	//public static Mat gemm(Mat src1, Mat src2) {
	//	Mat result = new Mat();
	//	return result;
	//}

	/**
	 * Per-element sum of two matrix
	 * 
	 * @param src1
	 * @param src2
	 * @return
	 */
	//public static Mat add(Mat src1, Mat src2) {

	//}

	/*
	 * Enumerate supported norm operation type
	 */
	public static enum NormType {
		NORM_L1, NORM_L2
	};

	/**
	 * Calculates a matrix norm, norm type is specified by NormType
	 * 
	 * @param src
	 * @param normType
	 * @return
	 */
	public static double norm(Mat src, NormType normType) {
		if (src.isEmpty()) {
			return 0.0;
		}
		else {
			double sum = 0.0;
			switch (normType) {
			// L2 norm, get sum of squared of all elements, return the squared root of sum 
			case NORM_L1: {
					for (int i = 0; i < src.data.length; i++) {
						sum += (src.data[i] < 0) ? -src.data[i] : src.data[i];
					}
					break;
				}
			
			// L2 norm, get sum of squared of all elements, return the squared root of sum 
			case NORM_L2: {
					for (int i = 0; i < src.data.length; i++) {
						sum += src.data[i] * src.data[i];
					}
					sum = Math.sqrt(sum);
					break;
				}
			
			default: {
				break;
				}
			}
			return sum;
		}
	}
}
