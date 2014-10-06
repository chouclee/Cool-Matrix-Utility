package cmu.core;

public class Mat {
	
	private int dims; // number of dimensions
	private int rows, cols; // the number of rows and columns
	public double[] data; // matrix data	
	
	
	
	/**
	 * 
	 * @param rows
	 * @param cols
	 */
	public Mat(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}
	
	/**
	 * 
	 * @param rows
	 * @param cols
	 * @param src
	 */
	public Mat(int rows, int cols, double[] src) {
		this.rows = rows;
		this.cols = cols;
		assert(rows*cols == src.length);
		this.create(2, this.rows, this.cols, src);
	}
	
	
	/**
	 * Allocate memory for matrix
	 * @param dims
	 * @param rows
	 * @param cols
	 */
	public void create(int dims, int rows, int cols) {
		this.data = new double[rows * cols];
		this.dims = dims;
	}
	
	
	/**
	 * Allocate memory for matrix
	 * @param dims
	 * @param rows
	 * @param cols
	 */
	public void create(int dims, int rows, int cols, double[] src) {
		this.data = new double[rows * cols];
		assert(data.length == src.length);
		for (int i = 0; i < src.length; i++)
			this.data[i] = src[i];
		this.dims = dims;
	}

	/**
	 * Transpose a matrix.
	 * This method performs matrix transposition not in the original matrix but
	 * returns a temporary matrix transposition object. 
	 * @return
	 */
	public Mat t() {
		/*
		 * Slow version, no optimization
		 */
		Mat t = new Mat(this.cols, this.rows);
		t.create(2, t.rows, t.cols);
		int idx = 0;
		int colIdx, rowIdx;
		for (int i = 0; i < data.length; i++) {
			rowIdx = i / t.cols;
			colIdx = i % t.cols;
			idx = colIdx * t.rows + rowIdx;
			t.data[idx] = this.data[i];
		}
		return t;
	}
	
	
	/**
	 * Performs an element-wise multiplication or division of the two matrices.
	 * @param InputMat
	 * @return
	 */
	//public Mat<T> mul(Mat<T> m) {
		
	//}
	
	/**
	 * Computes a dot-product of two vectors.
	 * @param m
	 * @return
	 */
	//public Mat<T> dot(Mat<T> m) {
		
	//}
	
	/**
	 * Returns true if the matrix has no elements
	 * @return
	 */
	//public boolean empty() {
		
	//}
	
	/**
	 * Returns a reference to the specified matrix element.
	 * @return
	 */
	//public T at() {
		
	//}
}
