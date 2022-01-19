package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4344
// 평균은 넘겠지 

public class _4344 {
	public static void main(String[] args) throws IOException {
		
		// 방법1 - Scanner
		/*
		Scanner in = new Scanner(System.in);
		
		int[] arr;
		
		int testcase = in.nextInt();
		
		for(int i=0; i<testcase; i++) {
			
			int N = in.nextInt(); // 학생 수 
			arr = new int[N]; // 배열에 성적을 저장
			
			double sum = 0; // 성적 누적 합 변수
			
			// 성적 입력 부분
			for(int j=0; j < N; j++) {
				int val = in.nextInt(); // 성적
				arr[j] = val;
				sum += val; // 성적 누적 합
			}
			
			double mean = (sum / N); // 평균 성적
			double count = 0; // 평균 넘는 학생 수 변수
			
			// 평균 넘는 학생 비율 찾기 
			for(int j=0; j<N; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		in.close();
		*/
		
		// 방법 2 - BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i < testcase; i++) {
			
			st = new StringTokenizer(br.readLine(), " "); // 학생 수 및 성적 입력
			
			int N = Integer.parseInt(st.nextToken()); // 학생 수 
			arr = new int[N];
			
			double sum = 0; // 성적 누적 합 변수
			
			// 성적 입력 부분
			for(int j=0; j<N; j++) {
				int val = Integer.parseInt(st.nextToken()); // 성적 저장
				arr[j] = val;
				sum += val; // 성적 누적 합
			}
			
			double mean = (sum / N) ;
			double count = 0; // 평균 넘는 학생 수 변수 
			
			// 평균 넘는 학생 비율 찾기 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		
		
		
	}
	

}
