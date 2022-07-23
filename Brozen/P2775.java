import java.util.Scanner;

public class P2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, k, n;
		int info [][] = new int[15][15];
		for(int i = 1; i < info.length; i++) {
			info[0][i] = i; // 0층의 전 호수를 1~14까지 정해준다.
		}
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			k = sc.nextInt(); // 층은 0부터
			n = sc.nextInt(); // 호수는 1부터
			
			for(int j = 1; j < k+1; j++) { 
				for(int l = 1; l <= n; l++) {
					for(int h = 1; h <= l; h++) {
						info[j][l] += info[j-1][h]; // 그 전 층의 모든 호수를 더한 것이 지금 층수의
													// 호수가 된다.
					}
				}
			}
			System.out.println(info[k][n]); //해당 층, 호수를 출력
			for(int q=1; q<15; q++) { // 0층 빼고 전부 초기화 시켜주는 과정 초기화 시키지 않으면	
				for(int w = 0; w<15; w++) { // 앞서 있는 값에 또 다시 더해지기 때문에 초기화 시킨다.	
					info[q][w] = 0;
				}
			}
		}
		
	}

}