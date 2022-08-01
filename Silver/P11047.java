import java.util.Scanner;

public class P11047 {

	public static void main(String[] args) {
		//동전은 총 N종류이고,동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 문제.
		Scanner sc = new Scanner(System.in);

		int N, K, max = 0, count = 0;

		N = sc.nextInt(); // 가진 동전 종류의 개수.
		K = sc.nextInt(); // 총 돈.
		
		int money[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			money[i] = sc.nextInt();
		}
		
		sc.close();
		
		while(true) {
			if(K==0) break; // 총 돈이 0이면 break.
	
			for(int i = N - 1; i >= 0; i--) { // 배열의 뒤부터 반복.
				if(money[i] <= K) { // K보다 작거나 같을 때 max가 그 돈을 나눌 수 있는 최대의 돈이 된다.
					max = money[i];
					break;
				}
			}
			
			count += K / max; // count는 돈을 몇 번 나누었는지를 기록.
			K = K % max; // K는 max의 나머지로 다시 초기화.
			
		}
		
		System.out.println(count);

	}

}
