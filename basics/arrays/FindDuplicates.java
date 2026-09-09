package com.basics.arrays;

//public class FindDuplicates {
//
//	public static void main(String[] args) {
//		int[] arr= {4,3,2,6,5,3,9,4};
//		for(int i=0;i<arr.length;i++) {
//			int target=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				if(target==arr[j]) {
//					System.out.println("The duplicate numbers: "+ arr[j]);
//					break;
//				}
//				
//			}
//			
//		}
//		
//
//	}
//
//}

  
public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6, 5, 3, 9, 4,9,5};
        int[] duplicates = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates[count] = arr[i];
                    count++;
                    break;
                }
            }
        }
        System.out.print("Duplicate numbers: " );
        for (int i = 0; i < count; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}
