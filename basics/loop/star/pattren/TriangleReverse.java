package com.basics.loop.star.pattren;
import java.util.*;
public class TriangleReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int space=-1;
		int star=n+1;
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
				space++;
				star--;
			}else {
				space--;
				star++;
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");			
				}
			int value=(i<=n)?i:2*n-i;
			for(int j=1;j<=star;j++) {
				System.out.print(value+" "
						
						);
				value++;
			}
			System.out.println();
		}
//		for(int i=1;i<=n;i++) {
//			space++;
//			star--;
//			for(int j=1;j<=space;j++) {
//			System.out.print(" ");
//		}
//			int v=i;
//		for(int j=1;j<=star;j++) {
//			System.out.print(v+" ");
//			v++;
//		}
//		System.out.println();
//		}
//		space=n-2;
//		star=2;
//		for(int i=n-1;i>=1;i--) {
//			star++;
//			space--;
//			for(int j=1;j<=space;j++) {
//				System.out.print(" ");
//			}
//			int v=i;
//			for(int j=1;j<=star;j++) {
//				System.out.print(v+" ");
//				v++;
//			}
//			System.out.println();
//			
//			
//		}

	}

}

/*_*_*_*_*
  *_*_*_*
   *_*_*
    *_*
     */
