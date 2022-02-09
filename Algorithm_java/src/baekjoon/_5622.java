package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/5622
// 다이얼

public class _5622 {

	public static void main(String[] args) {
		
		// 숫자 1을 걸면 총 2초가 걸린다.
		// A,B,C는 숫자 2부터 시작하므로 3초가 걸린다.
		
		// charAt()은 문자열의  문자를 갖고 오기 때문에 ""가 아닌 ''으로 해준다.

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int time = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			switch(str.charAt(i)) {
			
			case 'A': case 'B':case 'C':
				time += 3;
				break;
			
			case 'D': case 'E':case 'F':
				time += 4;
				break;
				
			case 'G': case 'H':case 'I':
				time += 5;
				break;
				
			case 'J': case 'K':case 'L':
				time += 6;
				break;
			
			case 'M': case 'N':case 'O':
				time += 7;
				break;
				
			case 'P': case 'Q':case 'R':case 'S':
				time += 8;
				break;
				
			case 'T': case 'U':case 'V':
				time += 9;
				break;
				
			case 'W': case 'X':case 'Y':case 'Z':
				time += 10;
				break;
			}
		}
		System.out.println(time);
	}
	

}
