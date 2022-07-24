import java.util.Scanner;

public class P2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M, N, sum = 0, min = Integer.MAX_VALUE, check;
		
		// M ~ N 까지의 소수들의 합을 출력하고 최소값 소수를 출력한다.
		// 만약 M ~ N 까지 소수가 없다면 -1을 출력하는 문제.
		
		M = sc.nextInt();
		N = sc.nextInt();
		sc.close();
		
		for (int i = M; i <= N; i++) {
			check = 0; // 소수인지 아닌지 판별하는 변수.
			for (int j = 2; j < i; j++) { // 제일 작은 소수인 2부터 자기 자신보다 작은 수 까지 증가하면서 소수인지 판별.
				if (i % j == 0) { // 만약 소수가 아니라면 check를 1 증가 후 break.
					check++;
					break;
				}
			}
			if(i == 1) { // 1은 소수가 아니므로 1을 만나면 check를 1 올려준다.
				check++;
			}

			if (check == 0) { // check가 0 이란 소리는 소수라는 소리이므로 합 변수인 sum에 누적하여 값을 더한다.
				sum += i;
				if (i < min) { // 최소값 변수 min 보다 작다면 min = i 로 min을 재정의한다.
					min = i;
				}
			}
		}
		
		if (sum == 0) { // sum이 0 이라는 소리는 소수가 하나도 더해지지 않았다는 소리 즉 M ~ N 사이 소수가 없다는 소리. -1을 출력한다.
			System.out.println(-1);
		}
		
		else { // 그 외 경우 M ~ N 까지의 소수들의 합을 출력하고 최소값도 출력한다.
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
