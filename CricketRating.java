package exp;

import java.util.Scanner;

public class CricketRating {

	/*
	 * Kadane's algorithm(max subarray Problem)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rating = new int[N+1];
		int max_ended = 0;
		int max_soFar = 0;
		for(int i=0;i<N;i++){
			rating[i] = sc.nextInt();
			max_ended = Math.max(rating[i], max_ended+rating[i]);
			max_soFar = Math.max(max_soFar, max_ended);
		}
		 
		System.out.println(max_soFar);
	}

}
