import java.util.Scanner;

public class P10870 {

	public static void main(String[] args) {
		// 피보나치 수열 Fn = Fn-1 + Fn-2 (n ≥ 2)이고, n이 주어졌을 때 n번째 피보나치 수를 구하는 문제.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n을 입력 받는다.
		sc.close();
		System.out.println(fibo(n)); // fibo의 return을 출력해준다.

	}
	
	static int fibo(int n) { // return이 int인 fibo라는 메소드 선언.
		if(n == 0) return 0; // n이 0이면 0을 return한다.
		else if(n==1) return 1; // n이 1이면 1을 return 한다.
		
		return fibo(n-1) + fibo(n-2); // 일반항에 대해서 재귀적으로 fibo함수를 계속 부른다.
	}

}
