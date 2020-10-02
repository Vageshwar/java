import java.util.*;
import java.lang.*;
import java.io.*;

class Subarray_with_given_sum{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int arr[]=new int[a];
	        for(int j=0;j<a;j++)
                arr[j]=sc.nextInt();
            int sum=0,left=0,right=0,check=0;
            while(left<a){
                while(sum<b&&right<a)
                    sum+=arr[right++];
                if(sum==b)
                    break;
                sum-=arr[left++];
            }
            if(left<a)
                System.out.println(++left+" "+right);
            else
                System.out.println(-1);
            
		}
	}
}