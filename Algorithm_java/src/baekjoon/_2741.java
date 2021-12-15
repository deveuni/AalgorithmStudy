package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2741
// N 찍기

public class _2741 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		/*
		for(int i=1; i <= N; i++) {
			System.out.println(i);
		}
		*/
		int i =1;
		
		while(i<=N) {
			bw.write(i+"\n");
			i++;
		}
		bw.flush();
		bw.close();
		
		
	}

}
