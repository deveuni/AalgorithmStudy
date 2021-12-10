package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2884
// 알람 시계

public class _2884 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1-1 단계 : 45분보다 작은지 여부 - if(min < 45)
		 * 	2-1 단계 : 시(hour)가 0보다 작은지 여부 - if(hour < 0)
		 * 1-2 단계 : 1단계 조건의 외 여부 - else
		*/
		
		// 참고로 분 60분이니 만약 입력값이 45보다 작을 경우 (45-입력값)의 차이만큼 60에서 빼주면 된다. 
		// 즉, 60-(45-입력값)이 된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
	/*	
		if(M < 45 ) {
			H--;			// 시(hour) 1 감소
			M = 60- (45 - M); // 분(min) 감소
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
			
*/		
		// 성능 개선 문제 
		// - 출력을 StringBuilder로 바꿔준다.ㅏ
		
		StringBuilder sb = new StringBuilder();
			
		if(M < 45) {
			if(H == 0) {
				H = 23;
				sb.append(H).append(' ');
			}else {
				H--;
				sb.append(H).append(' ');
			}
			sb.append(M = 60 - (45 - M));
		}
		else {
			sb.append(H).append(' ').append(M - 45);
		}
		
		System.out.println(sb);
		
	}
	
	
	
	

}
