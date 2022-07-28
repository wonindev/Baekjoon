import java.util.Scanner;

public class P9020 {

	public static void main(String[] args) {
		// 골드바흐의 추측 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
		// 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
		// 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11,
		// 14 = 7 + 7이다.
		// 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
		// 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
		// 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		boolean arr[] = new boolean[10001]; // 10000까지 불리언 배열을 선언 후 합성수는 true로 설정
		arr[0] = true;
		arr[1] = true;
		for (int i = 2; i < 10001; i++) {
			if (arr[i] == false) {
				for (int j = 2; i * j < 10001; j++) {
					arr[i * j] = true;
				}
			}
		}

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt(); // n을 입력 받는다.

			if (arr[n / 2] == false) { // n을 나눠서 그 수가 소수이면 바로 출력.
				System.out.println(n / 2 + " " + n / 2);
			}

			else if (arr[n / 2] == true) { // 그렇지 않다면 n / 2 - j, n / 2 + j 두 수 모두 소수이면서 두 수를 더해서 n이 되는 두 수를 출력.
				int j = 1;

				while (true) {
					if ((arr[n / 2 + j] == false & arr[n / 2 - j] == false)) {
						if (n / 2 - j + n / 2 + j == n) {
							System.out.println((n / 2 - j) + " " + (n / 2 + j));
							break;
						}
					} 
					
					else j++;
				}
			}
		}
		sc.close();
	}
}
