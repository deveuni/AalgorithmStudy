package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1546
// 평균

public class _1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 방법 1 - 배열 사용
		/*
		// a. 배열의 모든 원소를 입력 받아 저장
		Scanner in = new Scanner(System.in);
 
		double arr[] = new double[in.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
		}
		in.close();
		
		// sort()를 사용하여 오름차순으로 정렬이 되고 최댓값은 배열의 마지막 원소가 된다.
		// => 최댓값 M = arr[arr.length-1]
		
		// 오차범위가 있기 때문에 반드시 연산 할 대 최소한 자료형 1개 이상은 double형으로 써야한다.
		// 자동 형변환이 되어 int에서 double로 변환되기 때문에 
		// 배열과 sum을 double형을 해준다.
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
		*/
		
		// 방법2 - 배열 X
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 입력 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1;
		double sum = 0.0;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > max) {
				max = value;
			}
			
			sum += value;
		}
		
		System.out.println(((sum / max) * 100.0) / N);
		
	}

}
