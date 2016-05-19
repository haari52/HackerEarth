package practice;

import java.util.Scanner;

public class RastaTavas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
	    int pr[]=new int[n+2];
	    for(int i=2;i<=n;i++){
	        if(pr[i]==0){
	            for(int j=i;j<=n;j+=i){
	                pr[j]+=i;
	            }
	        }
	    }
	    int count=0;
	    for(int i=0;i<=n;i++){
        if(pr[i]==k)
	            count++;
	    }
	    System.out.println(count);
	}

	}

 
