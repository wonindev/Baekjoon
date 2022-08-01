import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
		/* 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다.
		c는 1로, d는 2로, ..., C를 8로 바꾼다.
		1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
		연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.*/


		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[8]; // 숫자를 받을 크기 8의 int 배열 생성.
		boolean check = false;  // 숫자의 순서를 확인하는 boolean 변수 check 생성.
		for (int i = 0; i < arr.length; i++) { // 숫자를 입력 받음.
			arr[i] = sc.nextInt();
		}
		sc.close();

		if (arr[0] == 1) { // arr[0]이 1일 때
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == i + 1) { // index 번호보다 1 더 큰 숫자가 담겨져 있다면 false
					check = false;
				}
				
				else { // 그렇지 않다면 check를 true로 바꾸고 break.
					check = true;
					break;
				}
			}
		}

		else if (arr[arr.length-1] == 1) { // arr[7]이 1일 때.
			for (int i = 0; i < arr.length; i++) {
				if (arr[arr.length - i - 1] == i + 1) { // 배열의 끝 쪽 부터 1이 있는지 확인.
					check = false; // 맞다면 check를 false하고 계속 진행.
				}

				else{ // 그렇지 않다면 check를 true로 변경 후 break.
					check = true;
					break;
				}
			}
		}

		else { // 처음부터 1 or 8이 들어오지 않았다면 mixed이므로, check를 true로 설정.
			check = true;
		}

		

		if (check == false & arr[0] == 1) { // check가 false이고, arr[0]이 1이면 ascending를 출력.
			System.out.println("ascending");
		}

		else if (check == false & arr[0] == 8) { // check가 false이고, arr[0]이 8이면 descending를 출력.
			System.out.println("descending");
		}

		else if (check == true) { // check가 true면 mixed를 출력.
			System.out.println("mixed");
		}

	}

}
