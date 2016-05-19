package practice;

import java.util.Scanner;

public class WobblyNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0;t<tc;t++){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int FD,SD,a,b;
			FD=0;
			SD=0;
			a=0;
			b=0;
			
			if( K<10 ){
				a = 0;
				b = K;
			}
			else{
				a = K/10;
				b = K%10;
			}
			SD = (b == 0 || b == 1)? (a+b)-1:((a+b>=10)?((a+b)%10):(a+b));
			FD = (a+b>=10)?a+2:a+1;
			if(FD>=10){
				System.out.println("-1");
			}
			else{
			String rs="";
			for(int i=0;i<N/2;i++){
				rs += ""+FD+SD;
			}
			rs = ((N%2!=0))?rs+""+FD:rs;
			System.out.println(rs);
			}
		}
	}

}
