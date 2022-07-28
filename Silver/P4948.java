import java.util.Scanner;

public class P4948 {

	public static void main(String[] args) {
		// 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력하는 문제이다.
		// 예를 들어 n에 10이 주어졌을 때, 10 보다는 크고 20 보다는 작거나 같은 소수는 4개이다 (11,13,17,19) 소수 개수인 4를 출력하면 된다.
		// 입력에 0이 주어지면 종료한다.
		
		Scanner sc = new Scanner(System.in);
		int n, cnt;
		while (true) { // 무한루프
			n = sc.nextInt();
			if (n == 0) break; // 0이 들어오면 종료하는 조건문.
			
			if(n == 1) { // n이 1이면 0이 출력되므로 1일 때는 무조건 1을 출력하게 한다.
				System.out.println(1);
				continue;
			}

			boolean arr[] = new boolean[n * 2 + 1]; // 2n+1 크기의 불리언 배열 선언.
			cnt = 0; // 소수 개수를 계산할 카운트 변수.

			for (int i = 2; i < n * 2 + 1; i++) { // 제일 작은 소수인 2부터 올라가면서 2n+1 보다 작은 수까지 범위 지정.
				if (arr[i] == false) { // 제외시킨 수의 배수들을 제외하고 다음 소수일 때 반복문 시작.
					for (int j = 2; i * j < n * 2; j++) { // 2부터 시작해, 2를 제외하고 2의 배수들을 모두 제외시킨다, 마찬가지로 계속 올라가면서 반복.
						arr[i * j] = true; // j의 배수들을 true로 변경한다. 
					}
				}
			}
			
			for(int i = n + 1; i < 2 * n; i++) { // n 보다 큰 수 부터 2n보다 작은 수 이면서 false(소수 인덱스)의 개수를 ++ 한다.
				if(arr[i] == false) {
					cnt++;
				}
			}
			
			System.out.println(cnt); // 소수 개수 출력.
			
		}
		sc.close();

	}

}
