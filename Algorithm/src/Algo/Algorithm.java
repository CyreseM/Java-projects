package Algo;

import java.util.Scanner;

public class Algorithm  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Algo obj =  new Algo();
         System.out.print("Welcome\nWhich type of Algorithm would you like to run?\n1. Searching Algorithms\n2. Sorting algorithms");
         Scanner sc= new Scanner(System.in);
         int select = sc.nextInt();
         if(select == 1) {
        	 obj.Search();
         }else if(select == 2) {
        	 obj.Sort();
         }else {
        	 System.out.print("Error please try again");
         }
	}

}
