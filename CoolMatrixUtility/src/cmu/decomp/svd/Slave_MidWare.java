package cmu.decomp.svd;

import cmu.core.Mat;
import cmu.help.Tag;

public class Slave_MidWare {
	
	public boolean push(Mat L) {
		System.out.println("after update");
		L.display();
		return true;
	}
	
	
	public Mat pullL() {
		double[] test = {0.1,0.1,0.1,0.1};
		Mat L = new Mat(4,1,test);
		return L;
	}
	
	public Tag pullTag() {
		Tag tag = new Tag(0,1);
		return tag;
	}
}
