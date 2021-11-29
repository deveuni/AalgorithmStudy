package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1008
// A/B

public class _1008 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 // 방법 1 
		/* String str =  br.readLine();
		 StringTokenizer st = new StringTokenizer(str, " ");
		 
		 double A = Double.parseDouble(st.nextToken());
		 double B = Double.parseDouble(st.nextToken());
		 
		 System.out.println(A/B);*/
		
		// 방법 2
		/*String[] str = br.readLine().split(" ");
		double A = Double.parseDouble(str[0]);
		double B = Double.parseDouble(str[1]);
		
		System.out.println(A/B);*/
		
		// 방법 3
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		sc.close();
		System.out.println(A/B);
		 
		 
		 
		 
	}

}
