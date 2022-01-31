package baekjoon;

import java.io.IOException;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1157
// 단어 공부

// 해설 참고
// https://st-lab.tistory.com/64

public class _1157 {

	public static void main(String[] args) throws IOException {

		// 방법 1 
		
		Scanner in = new Scanner(System.in);
		
		// 1. 각 문자들의 빈도수를 나타내기 위한 배열을 선언
		int[] arr = new int[26]; // 영문자의 개수는 26개
	
		// 2. 문자열 입력
		String s = in.next();
		
		// 3. 문자열 s에 대하여 첫번째 문자부터 마지막 문자까지 검사하기 위한 반복문
		for (int i=0; i < s.length(); i++) {
			
			// 3-1. 반복문을 돌면서 해당 문자가 어떤 문자냐에 따라 해당 배열 원소를 증가해주어야함
			
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				arr[s.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가
			}
			else { // 소문자 범위
				arr[s.charAt(i) - 'a']++;
			}
		}
		
		// 4. 배열의  원소들의 값을 비교하여 가장 큰 값을 갖고 있는 인덱스의 문자를 출력해야한다.
		// 최댓값 max, 출력할 문자 ch 선언
		
		int max = -1;
		char ch = '?';
		
		// 5. 배열들을 순회하기 위한 반복문 작성
		for(int i=0; i<26; i++) {
			
			// 6. 해당 배열 원소 값이 max보다 클 경우 원소값을 max로 대치해주고
			// ch의 문자를 해당 인덱스에 대응하는 문자로 대치해야 한다.
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
		
		// 방법 2 
		// 문자열 변수를 만들지 않고 입력과 동시에 byte 값으로 반환하여 배열의 원소를 증가시키는 방법
		
		int[] arr2 = new int[26]; 
		
		// 문자열만 입력받기 때문에 BufferedReader 필요 X
		int c = System.in.read();
		
		while(c > 64) { // 공백을 입력받는 순간 종료됨
			
			if(c < 91) {
				arr[c - 65]++;
			} else {
				arr[c - 97]++;
			}
			c = System.in.read();
		}
	
		int max2 = -1;
		int ch2 = -2; // ?는 63이다 
		
		for(int i=0; i < 26; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) i;
			} else if(arr[i] == max) {
				ch = (char) -2;
			}
		}
		System.out.println((char)(ch+65));
	}

}
