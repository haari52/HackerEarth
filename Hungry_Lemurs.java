package practice;

import java.util.Scanner;

public class Hungry_Lemurs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = (int) 1e9;
		int i = 0;
		if(N%K == 0)
			System.out.println(0);
		else{
			for(int j=2*K;j>=1;j--){
				i = N - (N % j);
				ans = Math.min(ans, Math.abs(N - i) + Math.abs(K - j));
				i += j;
				ans = Math.min(ans, Math.abs(N - i) + Math.abs(K - j));
			}
			
			System.out.println(ans);
		 
		}
	}

}
