package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10950
// A+B-3

public class _10950 {

	public static void main(String[] args) {

		// 방법1 
		Scanner sc = new Scanner(System.in);
		
		int c =  sc.nextInt();
		int arr[] = new int[c];
		
		for(int i=0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
		
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
