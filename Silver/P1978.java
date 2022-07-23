import java.util.Scanner;

public class P1978 { // 소수(prime num) 개수를 출력하는 문제.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int count = N;
		
		for (int i = 0; i < N; i++) { // N에 따라 몇 개를 입력 받을지 결정.
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			
			if(arr[i] == 1) { // 만약 1이라면 소수가 아니므로 count를 1빼고 컨티뉴
				count--;
				continue;
			}
			
			for(int j = 2; j < arr[i]; j++) { // 2부터 그 수보다 작은 수까지 반복하여 나눈다.
				if(arr[i] % j == 0) { // 만약 j로 나누어서 떨어진다면 소수가 아니므로 count를 1빼주고 계속 실행.
					count--;
					break;
				}
			}
		}
		
		System.out.println(count); // 소수 개수를 출력.
		sc.close();

	}

}
