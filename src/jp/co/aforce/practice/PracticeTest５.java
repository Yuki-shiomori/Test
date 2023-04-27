package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest５ {
	 public static void main(String args[]) {
//問題１
		
		 Random random = new Random();
		  int fortune = random.nextInt();
		 		
	        switch (fortune) {
	        case 1:
	         System.out.println("吉です");
	        break;
	        case 2:
	        System.out.println("中吉です");
	         break;      
	         case 3:
	        	 System.out.println("大吉です");
		          break;
		      default:
		    	  System.out.println("凶です");
		    	 break;
	        }
		 
//問題２
		  int count = 1;
		   while(count <= 100) {
		  if(count % 7 == 0 ) {
			  System.out.print( count + ",");
			  
		  }
		   count++;
		 	 
		 

		 
		   }
		 
		 
		 System.out.println();
		 
		 
// 問題３
	        for(int i = 1; i <= 9; i++) {
	            for(int j = 1; j <= 9; j++) {
	              
			int m = i * j;
			    
			System.out.print(" ");

			if(10 > m) {
	                    System.out.print( " " );
			}

			System.out.print(m);
		    }
		   
		    System.out.println();
	        }
	    }
	 }


