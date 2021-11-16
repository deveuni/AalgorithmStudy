package _3;

import java.util.Scanner;

/*
 * - 가장 많이 출현한 수를 출력하시오.
 * - 1 2 2 3 1 4 2 2 4 3 5 3 2
 * - 정답 : 2 (5회)
 * 
 * Tag >>> 배열, for
 * 
 * 
 * */

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		// 사용자 input 
		
		// 1 2 2 3 1 4 2 2 4 3 
		
		// 1: 2
		// 2: 4 --> 최변수
		// 3: 2
		// 4: 2
		
		int []mode = new int[10];
		
		//index -> 출현한 수 
		// index 값 -> index(출현한 수)가 몇번 나왔는지 저장하는 용도 
		
		// "mode[3] = 5 => 3번 숫자가, 5번 출현했다"
		
		// inputNum => 1 2 2 3 1 4 2 2 4 3 
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		// mode[1] == 2
		// mode[2] == 4
		// mode[3] == 2
		// mode[4] == 2
		
		int modeNum = 0; // 최변수 
		int modeCnt = 0; // 최변수가 나온 횟수 
		
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최변수는:"+modeNum+" cnt:"+modeCnt);
	}

}
