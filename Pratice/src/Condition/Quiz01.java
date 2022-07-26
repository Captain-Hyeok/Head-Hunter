package Condition;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		  System.out.println("출력할 층수를 입력하세요!");
	      Scanner scan =  new Scanner(System.in);
	        int n = scan.nextInt();
	        
	        for (int i = 1; i <= n; i++) {
	            for (int k = n; k > i; k--) {
	                System.out.print(" ");                
	            }
	            for (int j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	 
	        scan.close();
	    }
	}


