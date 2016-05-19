package practice;

import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class CubeChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int tc = sc.nextInt();
		
		for(int i=0;i<tc;i++){
			BigDecimal side = sc.nextBigDecimal();
			if(side.compareTo(BigDecimal.ONE) == 0)
				System.out.println(1);
			else
			System.out.println((side.pow(3)).subtract((side.subtract(new BigDecimal(2))).pow(3)));
				
		}
	}
}
