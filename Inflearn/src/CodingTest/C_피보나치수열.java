package CodingTest;

import java.util.Scanner;

/*피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하
 * 다음 숫자가 되는 수열이다. 입력은 피보나치 수열의 총 항의 수 이다.
 * 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.*/
public class C_피보나치수열 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0]=1;
		answer[1]=1;
		for (int i = 2; i <n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
		}
		
		return answer;
	}
	public static void main(String[] args) {
		C_피보나치수열 p = new C_피보나치수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int x : p.solution(n)) {
			System.out.print(x + " ");
		}
	}
}
