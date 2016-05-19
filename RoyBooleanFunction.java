package practice;

import java.util.Scanner;

public class RoyBooleanFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0;t<tc;t++){
			int count =0;
			int temp;
			boolean isPrime = true;
			int num = sc.nextInt();
			for(int i=1;i<=num;i++){
				if(findGCD(i,num) == 1){
					count++;
				}
			}
			if(count == 1){
				isPrime = false;
			}
			else{
				for(int j=2;j<=count/2;j++){
					temp = count % j;
					if(temp == 0 ){
						isPrime = false;
						break;
					}
			}
			}
			if(isPrime){
				System.out.println("TRUE");
			}
			else{
				System.out.println("FALSE");
			}
		}
	}
	public static int findGCD(int i, int num) {
		if(num == 0){
			return i;
		}
		return findGCD(num, i%num);
	}
}
