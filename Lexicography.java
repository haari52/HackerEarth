package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexicography {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List<String> li = new ArrayList<String>();
		int length = input.length();
		li.add(input);
		for(int i =1;i<length;i++){
			String str = "";			
			str = input.substring(i)+input.substring(0,i);
			li.add(str);
		}
		int val = 0;
		String str = "";
		for(String s:li){
			int ascii = (int) s.charAt(0);
			 if(val<ascii){
				 val = ascii;
				 str = s;
			 }
		}
		 System.out.println(str);
	}

}
