package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyPrime {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ele = Integer.parseInt(br.readLine());
		int arr[] = new int[ele];
		String[] strArr = br.readLine().split(" ");
		for(int i=0;i<strArr.length;i++){
			arr[i] = Integer.parseInt(strArr[i]);
		}
		for(int i=0;i<arr.length;i++){
			int num = arr[i];
			int count = 0;
			for(int j=0;j<arr.length;j++){
				if(num != arr[j] && num > arr[j]){
					if((num % arr[j] == 0)){
						count++;
					}
				}
			}
			if(count == 0)
				System.out.print(num+" ");
		}
	}
}
