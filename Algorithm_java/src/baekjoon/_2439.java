package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2439
// 별 찍기 - 2

public class _2439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// 공백이 1행에 4개, 2행헤 3개 출력,
		// 즉, n번째 행에는 N-n개의 공백이 출력되고, 별은 n번째 행에 n개 출력되어야 한다.
		
		/*for (int i=1; i <= N; i++) {
			for(int j=1; j<=N-i;j++) {
				System.out.print(" ");
			}
			
			for (int k=1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();
		System.out.println(sb);
		
	}

}
