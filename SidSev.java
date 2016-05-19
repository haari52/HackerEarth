package practice;

import java.util.Scanner;

public class SidSev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int a = sc.nextInt();
			int H = sc.nextInt();
			int THETA_MAX = sc.nextInt();
			if(a>=20 && a<=100){
				if(H>0 && H<=a){
					if(THETA_MAX>=0 && THETA_MAX<90){
						double ans=Math.tan(Math.toRadians(THETA_MAX))*a/2;
						 int res=H-(int)ans ;
						System.out.println(res);
					}
				}
			}
			
		}
	}

}
