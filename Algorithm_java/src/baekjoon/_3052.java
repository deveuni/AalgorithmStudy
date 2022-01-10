package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3052
// 나머비

public class _3052 {

	public static void main(String[] args) throws IOException {

		
		// 방법 1
		
		boolean[] arr = new boolean[42];
		// 나머지가 나올 수 있는 수는 0~41이므로 길이가 42인 boolean 배열을 생성
		// (boolean 배열의 default 값은 false이다.)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		// 입력받은 값의 %42을 통한 나머지 값의 index을 true로 바꾸어 준 뒤,
		
		int count = 0;
		for(boolean value : arr) {
			if(value) { // value가 true라면
				count++;
			}
		}
		// 입력이 종료되면 true값인 배열원소의 개수를 세어준다.
		System.out.println(count);
	}

}
