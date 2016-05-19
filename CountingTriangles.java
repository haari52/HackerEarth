package practice;

import java.util.Scanner;

public class CountingTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
			long n = sc.nextLong();
			System.out.println(14*n - 6);
		}
		
	}

}
