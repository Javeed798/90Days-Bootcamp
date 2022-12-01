package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class TheGreaterRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		while(t-- > 0){
//		    int n = sc.nextInt();
//		    int k = sc.nextInt();
//		    int[] arr = new int[n];
//		    for(int x =0; x<arr.length;x++){
//		        arr[x] = sc.nextInt();
//		    }
//		    
//		    int max=0;
//		    for(int j=0;j<=n-k;j++)
//		    {
//		        int sum=0;
//		        for(int m=j;m<j+k;m++)
//		        {
//		            sum=sum+arr[m];
//		        }
//		        if(sum>max)
//		        max=sum;
//		    }  
//		    System.out.println(max);
//		}
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    String n = sc.nextLine();
		    String s = sc.nextLine();
		    String r = sc.nextLine();
		    int count1 = 0;
		    for(int i = 0; i<s.length()-1;i++){
		        if(s.charAt(i) == '0'){
		            count1++;
		        }
		    }
		    int count2 = 0;
		     for(int i = 0; i<r.length();i++){
		        if(r.charAt(i) == '0'){
		            count2++;
		        }
		    }
		    if(count1 == count2){
		            System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		    

	}
	}
}
