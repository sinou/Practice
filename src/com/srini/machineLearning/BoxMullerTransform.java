package com.srini.machineLearning;

public class BoxMullerTransform {

	public static void main(String args[]){
		
	}
	
	public static float generateGaussiuanNoise(float mu, float sigma){
		
		float x1, x2, w, y1, y2 = 0F;
		boolean useLast = false;

		if (useLast)		        
		{
			y1 = y2;
			useLast = false;
		}
		else
		{
			do {
				x1 = (float) (2.0 * Math.random() - 1.0);
				x2 = (float) (2.0 * Math.random() - 1.0);
				w = x1 * x1 + x2 * x2;
			} while ( w >= 1.0 );

			w = (float) Math.sqrt( (-2.0 * Math.log( w ) ) / w );
			y1 = x1 * w;
			y2 = x2 * w;
			useLast = true;
		}

		return( mu + y1 * sigma );
		
	}
	
}
