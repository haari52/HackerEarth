package exp;

import java.util.Scanner;

public class ShinoCoinTry1 {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		char[] str = sc.next().toCharArray();
		int len = str.length;
		boolean[] counts = new boolean[26];
		long res = 0;
		
		for(int i=0;i<len;i++){
			//To iterate through the each substring
			int end = i+k-1;
			if(end>=len)
				break;
			
			for(int j=0;j<counts.length;j++){
				counts[j] = false;
			}
			
			int count = 0;
			//Calculates Occurrences of each character in a substring i to end which will be of length K-1 
			for(int j=i;j<end;j++){
				char now = str[j];
				if(!(counts[now - 'a'])){
					count =count+1;
					counts[now - 'a'] = true;
				}
			}
			//Calculates Occurrences of each character from end variable to end of the string
			//so that it can completely iterate through each substring
			for(int j=end;j<len;j++){
				char now = str[j];
				if(!(counts[now - 'a'])){
					count = count + 1;
					counts[now - 'a'] = true;
					if(count > k){
						break;
					}
				}
				if(count == k){
					res = res +1;
				}
			}
		}
		System.out.println(res);
	}

}
