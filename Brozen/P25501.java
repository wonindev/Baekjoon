import java.util.Scanner;

public class P25501 { // 팰린드롬인지 아닌지를 판별 한 후, 맞다면 1을 아니라면 0을 반환하고
					  // 재귀함수가 몇 번 호출되는지 횟수를 계산하는 문제.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			System.out.println(isPalindrome(str)[1] + " " + isPalindrome(str)[0]);

		}
		sc.close();
	}

	public static int[] recursion(String s, int l, int r, int count) {
		int v[] = new int[2]; // 횟수와 팰린드롬인지 아닌지를 판별하는 배열을 선언.
		count += 1; // 함수 호출 횟수를 나타내는 변수.
		if (l >= r) { // 팰린드롬 검사가 끝나는 시점으로 여기까지 왔으면 팰린드롬이므로 1을 반환.
			v[0] = count; 
			v[1] = 1;
			return v;
		} else if (s.charAt(l) != s.charAt(r)) { // 두개가 다르다면 팰린드롬이 아니므로 0을 주고 배열을 반환.
			v[0] = count;
			v[1] = 0;
			return v;
		} else
			return recursion(s, l + 1, r - 1, count); // 재귀함수를 호출.
	}

	public static int[] isPalindrome(String s) { 
		return recursion(s, 0, s.length() - 1, 0);
	}

}