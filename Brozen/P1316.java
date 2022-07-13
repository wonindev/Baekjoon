import java.util.Scanner;

public class P1316 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int count=0;

		for (int i = 0; i < t; i++) {
			String str = sc.next();
			if(checkgroup(str)==true) {
				count++;
			}
		}
		
		System.out.println(count);

	}

	static boolean checkgroup(String str) {
		boolean alph[] = new boolean[26];
		int before = 0;
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (before != now) {
				if (alph[now - 'a'] == true) {
					return false;
				}
				
				else {
					alph[now-'a'] = true;
					before = now;
				}
			}

			else {
				continue;
			}
		}
		return true;
	}
}
