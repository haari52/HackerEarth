package practice;

import java.util.Scanner;

public class SherifBombs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int[1001][1001];
		int count = 0;
		for(int i =0 ;i<n;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int r = sc.nextInt();
			r *= r;
			for(int j=1;j<=1000;j++){
				for(int k = 1;k<1001;k++){
					if((x-j)*(x-j) + (y-k)*(y-k) <= r){
						arr[j][k]++;
					}
				}
			}
		}
		for(int j=0;j<=1000;j++){
			for(int k=0;k<=1000;k++){
				if(arr[j][k]>1){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
