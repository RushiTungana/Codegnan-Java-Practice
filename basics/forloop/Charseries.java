package com.basics.forloop;

public class Charseries {
	public static void main(String args[]) {
//		char ch = 'A';
//		int num=1;
//		while(num<=6) {
//			System.out.println(""+ch+""+num);
//			ch++;
//			num++;
		//}
//		char ch='a';
//		for (int i=0;i<=6;i++) {
//			System.out.println(ch+""+i);
//			ch++;
		//}
		char ch='A';
		int i=1;
		char j='D';
		int k=4;
		while (i<5) {
			System.out.println(" "+ch+i+" "+j+k);
			ch++;
			i++;
			--j;
			--k;
		}
	}

}
