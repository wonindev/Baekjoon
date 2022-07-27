import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// M N을 입력 받아서 M ~ N까지의 소수를 전부 출력하는 문제.
		
		int M, N, check = 0, p;
		M = sc.nextInt();
		N = sc.nextInt();
		sc.close();
		boolean arr [] = new boolean[N]; // 크기가 N인 boolean배열을 선언.
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i < N; i++) { // 2부터 시작해, 2를 제외하고 2의 배수들을 모두 제외시킨다, 3부터 시작해, 3을 제외하고 3의 배수들을 모두 제외시킨다.
			if(arr[i]==false) { // 4는 이미 제외되었으므로, 5부터 시작하고 5를 제외하고 5의 배수들을 모두 제외시킨다.
				for(int j = 2; i*j < N; j++) { 
					arr[i*j] = true; // 2부터 시작해, 2를 제외하고 2의 배수들을 모두 제외시킨다, 3부터 시작해, 3을 제외하고 3의 배수들을 모두 제외시킨다.
									 // 인덱스번호 i*j를 true로 바꾼다. true는 합성수라는 뜻
				}
			}
		}
		
		for(int k = M; k < N; k++) {
			if(arr[k] == false) { // false에 한해서 그 인덱스 번호를 출력한다 그것이 소수이다.
				System.out.println(k);
			}
		}
		
		for(p = 2; p < N; p++) {
			if(N % p == 0) {
				check++;
				break;
			}
		}
		
		if(check == 0) {
			System.out.println(N);
		}

	}
}
