package cmu.core;

public class Mat<T extends Number> {
	int dims; // number of dimensions
	
	int rows, cols; // the number of rows and columns
	
	T[] data; // matrix data
	
	/**
	 * Transpose a matrix.
	 * This method performs matrix transposition not in the original matrix but
	 * returns a temporary matrix transposition object. 
	 * @return
	 */
	public Mat<T> t() {
		
	}
	
	/**
	 * Performs an element-wise multiplication or division of the two matrices.
	 * @param InputMat
	 * @return
	 */
	public Mat<T> mul(Mat<T> m) {
		
	}
	
	/**
	 * Computes a dot-product of two vectors.
	 * @param m
	 * @return
	 */
	public Mat<T> dot(Mat<T> m) {
		
	}
	
	/**
	 * Returns true if the matrix has no elements
	 * @return
	 */
	public boolean empty() {
		
	}
	
	/**
	 * Returns a reference to the specified matrix element.
	 * @return
	 */
	public T at() {
		
	}
}
