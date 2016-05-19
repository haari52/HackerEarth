package practice;

import java.util.Scanner;

public class XsquareTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long Q = sc.nextLong();
		long[] A = new long[(int) N];
		long[] B = new long[(int) N];
		for(int i=0;i<N;i++){
			A[i] = sc.nextLong();
		}
		for(int i=0;i<N;i++){
			B[i] = sc.nextLong();
		}
		for(int i=0;i<Q;i++){
			int index=sc.nextInt();
			int start=(sc.nextInt());
			int end=(sc.nextInt());
			int count=0;
			if(index == 1){
				for(int k=(start-1); k < end; k = k+2) {
	        		count += A[k];
	        	}
	        	for(int k=(int) start; k < end; k = k+2) {
	        		count += B[k];
	        	}
			}
			else {
				for(int k=(int) (start-1); k < end; k = k+2) {
	        		count += B[k];
	        	}
	        	for(int k=(int) start; k < end; k = k+2) {
	        		count += A[k];
	        	}
			}
			System.out.println(count);
		}
		
	}

}
