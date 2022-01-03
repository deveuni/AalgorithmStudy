package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1110
// 더하기 사이클
// 문제 해설 출처 : https://st-lab.tistory.com/42

/*
 * 1. 주어진 수 N, 새로운 수 T
 * 2. N의 일의 자릿수는 새로운 수(T)의 십의 자릿수로 간다 
 *    => T = (N % 10) * 10 // T의 십의 자릿수
 * 3. 각 자릿수의 합은? 
 *    => N의 십의 자릿수는 나누기 10을 하면 N의 한 자릿수이면 0, 그 외에는 십의 자릿수는 그대로 반환
 *    => 그리고 N의 일의 자릿수는 나머지인 %을 쓰면 된다.
 * 4. 이 두개를 더한 뒤 10으로 나눈 나머지가 N의 각 자릿수의 합의 일의 자릿수가 T의 일의 자릿수가 된다.
 *    => T = ((N / 10) + (N % 10)) % 10 // T의 일의 자릿수
 * 5. T = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10)
 * 6. 단, 주의할 점은 실제로는 반복문에서 N 값을 계속 새로운 값으로 대체해주어야함
 * 7. 처음 입력값을 복사한 변수 copy
 * 8. 반복문이 몇 번 반복되었는지 세어주는 변수 count
 * 9. 처음 입력값과 새로운 변수가 같을 경우 반복문을 종료하기 위한 조건문
 *      
 * 
 * 
 * 
 * */

public class _1110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
		
		
		
	}

}
