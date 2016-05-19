package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Hanoi {
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int tc = sc.nextInt();
	       for(int i=0;i<tc;i++){
	    	   int n = sc.nextInt();
	    	   List<Disk> li = new ArrayList<Disk>();
	    	   for(int j=0;j<n;j++){
	    		   Disk disk = new Disk();
	    		   disk.radius = sc.nextLong();
	    		   disk.height = sc.nextLong();
	    		   li.add(disk);
	    	   }
	    	   
	    	   Collections.sort(li,new Comparator<Disk>(){
				@Override
				public int compare(Disk o1, Disk o2) {
					if(o1.radius<=o2.radius)
						return 1;
					else
						return -1;
				}
	    	   });
	    	    
	    	   long[] dp = new long[n];
	    	   for(int j=0;j<n;j++){
	    		   dp[j] = li.get(j).height;
	    	   }
	    	   for (int j = 1; j < n; j++) {
	    	        for (int k = 0; k < j; k++) {
	    	          if (li.get(k).height > li.get(j).height && li.get(k).radius > li.get(j).radius) {
	    	              dp[j] = Math.max(dp[j], (dp[k] + li.get(j).height));
	    	          }
	    	        }
	    	      }
	    	   long output = 0;
	    	   for (int j = 0; j < n; j++) {
	    	        output = Math.max(output, dp[j]);
	    	      }
	    	      System.out.println(output);
	       }
	   }
	   
	   static class Disk{
		   public long height;
		   public long radius;
	   }
	}