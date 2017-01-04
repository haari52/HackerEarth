package exp;

import java.util.Scanner;

public class RecursiveSum {
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long tc = sc.nextLong();

		for(int i=0;i<tc;i++){
			long M = sc.nextLong();
			long result = 0;
			for(int j=0;j<M;j++){
				long len = sc.nextLong();
				long num = sc.nextLong();
				result += sumDigits(len * num);
			}
			while(result>9){
				result = sumDigits(result);
			}
			System.out.println(result);
		}
	}

	public static long sumDigits(long result) {
		//Base Case
		if(result % 9 == 0 && result!=0){
			return 9;
		}
		else if(result > 9){
			return result % 9;
		}
		else if (result <9){
			return result;
		}
		return 0;
		}
	}

