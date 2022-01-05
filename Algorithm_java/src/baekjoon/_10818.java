package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10818
// 최소,최대 

public class _10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* 방법 1 - Scanner
		 * 
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr); // 배열에 저장된 원소 값을 오름차순으로 정렬
		System.out.print(arr[0] + " " + arr[N - 1]); // 최솟값은 첫번째 원소(index 0), 최댓값은 마지막 원소(arr.length-1)
		
		*/
		
		/* 방법 2 - BufferedReader + 배열
		 * 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		// hasMoreTokens()는 StringTokenizer에 토큰이 남아있으면 true, 비어있으면 false를 반환
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
		
		*/
		
		// 방법 3 - BufferedReader + 배열 X
		// 배열을 쓰면 메모리를 잡아먹고, 불필요한 시간을 낭비할 수 있음
		// => 1. 배열을 사용하지 않는다. 
		// => 2. 입력받은 문자를 즉시 비교한다. (시간복잡도가 N으로 정렬할 필요 없이 시간을 단축시킬 수 있음)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine()); // 첫 줄 N은 안쓰이므로 입력만 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val > max) {
				max = val;
			}
			if(val < min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
		
		// max, min 초기화 이유
		// => 만약 min을 0으로 초기화 시켰다면 입력으로 들어오는 수 중 최솟값을 찾을 수 가 없다.
		// 2 4 5 중 2가 가장 작은데 0보다 크므로 min은 0이됨

	}

}
