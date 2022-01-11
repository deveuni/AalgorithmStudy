package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

// https://www.acmicpc.net/problem/3052
// 나머비

public class _3052 {

	public static void main(String[] args) throws IOException {

		
		// 방법 1
		/*
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
		*/
		
		// 방법 2 - HashSet
		
		/*
		 * HashSet
		 * 1. 중복되는 원소를 넣을 경우 하나만 저장한다. 중복원소를 허용하지 않는다.
		 * 2. 순서 개념이 없다. 따라서 Collections.sort()메소드를 사용할 수 없다. 
		 *    만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야 한다.
		 * 3. HashSet.add() -> HashSet에 저장하는 메소드이다. 
		 * 4. HashSet.size() -> HashSet의 크기(= 저장되어 있는 원소의 개수)를 반환한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i =0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
		// 입력받은 값으이 나머지 값을 add메소드를 통해 HashSet에 저장	
		}
		
		// HasSet.add() 메소드에서 값을 넣을 때 만약 중복되는 값이 없으면 
		// HashSet에 저장되면서 True를 반환하고, 중복되어 저장되지 않으면 False를 반환한다.
		
		sc.close();
		System.out.println(h.size());
		
	}

}
