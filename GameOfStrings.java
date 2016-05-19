package practice;

import java.util.Scanner;

public class GameOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
	
		for(int i=0;i<tc;i++){
			String input = sc.next();
			int k = sc.nextInt();
			char start = input.charAt(0);
			char end = input.charAt(input.length()-1);
			int index = 1;
			int endindex = k-1;
			String output = "";
			String finalOutput = "";
			 
			while( index<endindex){
				if(input.charAt(index)== start){
						int temp = index;
					while(index<endindex){
						index++;
						if(input.charAt(index) == end){
							output = input.substring(temp,index+1);
							if(output.length()>finalOutput.length()){
								finalOutput = output;
							}
						}
					 	 if(index == endindex && input.charAt(index) == start){
							output = input.substring(temp,index);
							if(output.length()>finalOutput.length()){
								finalOutput = output;
							}
						} 
					 
					}
				}
				index++;
			}
			 if( index<input.length() && input.charAt(index) == start ){
					output = input.substring(index,index+1);
					if(output.length()>finalOutput.length()){
						finalOutput = output;
					}
				} 
			if(finalOutput == ""){
				System.out.println("Puchi is a cheat!");
			}
			else
			System.out.println(finalOutput);
		}
	}
}
