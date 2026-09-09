package com.basics.loop.star.pattren;

public class FiveStars{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=5;
		int value=0;
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<=n;j++) {
				if(value==10) {
					value=0;
				}
				System.out.print(value+" ");
				value++;
			}
			
			System.out.println();
		}
		

	}

}
