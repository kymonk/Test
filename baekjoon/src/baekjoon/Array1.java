package baekjoon;

import java.util.Arrays;
import java.util.Scanner;



public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for (int i=0; i<a;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.printf("%d %d",arr[0] ,arr[arr.length-1]);
	
	}
}
