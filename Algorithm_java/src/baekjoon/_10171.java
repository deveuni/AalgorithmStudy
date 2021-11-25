package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10171
// 고양이

public class _10171 {

	public static void main(String[] args) throws IOException {
		
		// 방법 1
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");    
 
		System.out.println("--------------------");
		
		// 방법 2
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine();	// 줄 구분자
		
		bw.write(" )  ( ')");
		bw.newLine();	
        
		bw.write("(  /  )");
		bw.newLine();
        
		bw.write(" \\(__)|");
        
		bw.flush();
		bw.close();

		
		System.out.println("--------------------");
		
		// 방법 3
		
		StringBuilder sb = new StringBuilder();
		sb.append("\\    /\\\n");
		sb.append(" )  ( ')\n");
		sb.append("(  /  )\n");
 		sb.append(" \\(__)|\n");
		
		System.out.println(sb);
		
		
		
		
		
		
		
	}

}
