package cmu.decomp.svd;

import cmu.core.*;

/**
 * Split the whole Score Array into pieces.
 * @param Score
 * 		     Mat type, array to split.
 * @param NumberOfCols
 * 		     Number of columns in splited matrix.
 */
public class Spliter {
	
	public Mat[] Split(Mat Score, int NumberOfCols){
		Mat[] SplitedMatrix = new Mat[(int) Math.floor(Score.cols/NumberOfCols)]; // Heads of each splited matrix.
		while(!Score.isEmpty()){
			for(int i = 0; i < Score.data.length; i += NumberOfCols*Score.rows){
				//Store each piece of splited matrix
				Mat temp = new Mat(Score.rows, NumberOfCols);
				temp.create();
				//The last piece in splited matrix may not be full contained
				if(i + NumberOfCols * Score.rows > Score.data.length){
					for(int j = 0; j < Score.data.length - i; j++){
						temp.data[j] = Score.data[i + j];
					}
				} else {
					for(int j = 0; j < NumberOfCols * Score.rows; j++){
						temp.data[j] = Score.data[i + j];
					}
				}
				SplitedMatrix[i / NumberOfCols] = temp;
			}
		}
		return SplitedMatrix;
	}
}
