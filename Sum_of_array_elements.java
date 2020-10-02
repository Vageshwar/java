/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sum_of_array_elements{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int loop=sc.nextInt();
		for(int i=0;i<loop;i++){
        	int sum=0,n=sc.nextInt();
		    for(int j=0;j<n;j++)
		        sum+=sc.nextInt();
		    System.out.println(sum);
		    
		}
	}
}