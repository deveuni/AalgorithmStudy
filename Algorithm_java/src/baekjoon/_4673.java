package baekjoon;

// https://www.acmicpc.net/problem/4673
// 셀프 넘버

// 해설참조
// https://st-lab.tistory.com/53

public class _4673 {
	
	public static void main(String[] args) {
		
		// return된 수는 생성자가 있는 수, 즉 출력하면 안되는 수이므로 boolean 배열을 통해 true로 바꾼다.
		boolean[] check = new boolean[10001]; // 1부터 10000이므로
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) { // 10000이  넘는 수는 필요 없음
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i < 10001; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	
	
	public static int d(int number) {
		int sum = number;
		// 1. number라는 수를 받게되면 number을 생성자로 하는 수를 리턴시킬 것이기 때문에
		// sum이란 변수를 생성. 초기값은 number
		
		// 셀프넘버를 찾기 위한 반복문
		// 2. 각 자리수를 더해주기 위해 나머지 연산자와 나눗셈 연사자로 10 단위씩 number을 줄여 간다.
		// 3. number가 0이 아닐 때까지 계속 반복해준다.
		while(number != 0) {
			
			// 4. number의 첫번째 자리수를 구하기 위해 %연산자를 사용하여 sum에 더한다.
			// 5. 그 다음 /로 10을 줄인다.
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10; // 10을 나누어  첫 째 자리를 없앤다
		}
		
		
		return sum;
	}

}
