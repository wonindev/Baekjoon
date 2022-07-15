import java.util.Arrays;
import java.util.Scanner;

public class P13560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int team[] = new int[n];
		int sum = 0, count = 0, zero = 0, temp = 0;

		for (int i = 0; i < n; i++) {
			team[i] = sc.nextInt();
		}
		Arrays.sort(team);
		

		for (int i = 0; i < n; i++) {
			sum += team[i];
			if (sum < i * (i + 1) / 2) {
				System.out.println(-1);
				System.exit(0);
			}
		}

		if (sum == n * (n - 1) / 2) {
			System.out.println(1);
		}
		else System.out.println(-1);

	}

}
