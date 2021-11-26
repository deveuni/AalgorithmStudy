package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1000
// A+B
// 입력에 대한 방법 2가지
// Scanner 클래스 , BufferedReader

public class _1000 {

	public static void main(String[] args) throws IOException {
		
		// 방법1
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		
		sc.close();
		
		System.out.println("-------------------");
		
		// 방법 2-1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
		
		// 방법 2-2
		String[] str2 = br.readLine().split(" ");
		int c = Integer.parseInt(str2[0]);
		int d = Integer.parseInt(str2[1]);
		
		System.out.println(c+d);
		
	}

}
