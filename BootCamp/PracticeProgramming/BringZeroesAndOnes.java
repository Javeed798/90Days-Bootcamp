package BootCamp.PracticeProgramming;

import java.util.Scanner;

public class BringZeroesAndOnes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[sc.nextInt()];
		
		for(int i = 0; i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		int count = 0;
		int i = 0,j=ar.length-1;
		
		while(i < j) {
			while(ar[i] == 1) {
				i++;
				count++;
				
			}
			while(ar[j] == 0) {
				j--;
				count++;
			}
			if(i < j) {
				ar[i] = 1;
				ar[j] = 0;
			}
			i++;
			j--;
		}
			for (int j2 = 0; j2 < ar.length; j2++) {
				System.out.print(ar[j2] + " ");
			}
			System.out.println(count);
		
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-- > 0){
//		    int n = sc.nextInt();
//		    int[] arr = new int[n];
//		    for(int i = 0; i < n; i++){
//		        arr[i] = sc.nextInt();
//		    }
//		    
//		    int i = 0; 
//		    int j = arr.length - 1;
//		    int count = 0;
//		    
//		    while(i < j) {
//		        if(arr[i] == arr[j]) {
//		            i++;
//		            j--;
//		        }else if(arr[i] < arr[j]){
//		            arr[j] = arr[j] - arr[i];
//		            count++;
//		            i++;
//		        }else {
//		            arr[j] = arr[i] - arr[i];
//		            count++;
//		            j--;
//		        }
//		    }
//		    
//		    System.out.println(count);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
//		while(t-->0)
//		{
//		    int n=sc.nextInt();
//		    int[] a=new int[n];
//		    for(int i=0;i<n;i++)
//		    {
//		        a[i]=sc.nextInt();
//		    }
//		    int i=0,c=0;
//		    int j=n-1;
//		    while(i<j)
//		    {
//		        if(a[i]==a[j])
//		        {
//		            i++;
//		            j--;
//		        }
//		        else if(a[i]<a[j])
//		        {
//		            a[j]=a[j]-a[i];
//		            c++;
//		            i++;
//		        }
//		        else{
//		            a[i]=a[i]-a[j];
//		            c++;
//		            j--;
//		        }
//		    }
//		    System.out.println(c);
//		}
//		
	}

}