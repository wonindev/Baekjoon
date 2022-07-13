import java.util.Scanner;

public class P2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alph = sc.nextLine();
		int count = 0;
		for (int i = 0; i < alph.length(); i++) {
			char ch = alph.charAt(i);

			if (ch == 'c') {
				if (i < alph.length() - 1) {
					if (alph.charAt(i + 1) == '=') {
						i++;
					} 
					else if (alph.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			if (ch == 'd') {
				if (i < alph.length() - 1) {
					if (alph.charAt(i + 1) == 'z') {
						if (i < alph.length() - 2) {
							if (alph.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					}

					else if (alph.charAt(i + 1) == '-') {
						i++;
					}

				}

			}

			if (ch == 'l') {
				if (i < alph.length() - 1) {
					if (alph.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			if (ch == 'n') {
				if (i < alph.length() - 1) {
					if (alph.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}

			if (ch == 's') {
				if (i < alph.length() - 1) {
					if (alph.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			if (ch == 'z') {
				if (i < alph.length() - 1) {
					if (alph.charAt(i + 1) == '=') {
						i++;
					}
				}
			}

			count++;
		}

		System.out.println(count);

		sc.close();

	}

}
