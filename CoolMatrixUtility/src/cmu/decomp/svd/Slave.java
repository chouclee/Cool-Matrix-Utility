package cmu.decomp.svd;

import cmu.core.Mat;

/**
 * Slave Class is used to identify different slaves.
 * 
 * @param SlaveId
 *          id of Slave
 * @param SlaveMatrix
 * 			matrix after computing svd
 * @param workspan
 * 		    time between return and send 
 */
public class Slave {
	public int SlaveId;
	public Mat SlaveMatrix;
	public double workspan = Double.MAX_VALUE;
	
	public Slave (int SlaveId, Mat SlaveMatrix) {
		this.SlaveId = SlaveId;
		this.SlaveMatrix = SlaveMatrix;		
	}
	public Slave (int SlaveId, Mat SlaveMatrix, double workspan) {
		this.SlaveId = SlaveId;
		this.SlaveMatrix = SlaveMatrix;		
		this.workspan = workspan;
	}
}
