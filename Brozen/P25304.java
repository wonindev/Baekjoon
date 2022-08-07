import java.util.Scanner;

public class P25304 {

	public static void main(String[] args) {
		// 총 물건 가격의 합계와 각 물건의 가격과 개수가 입력으로 들어온다.
		// 이때 총 물건 가격과 각 물건의 가격을 더해서 같으면 Yes를 출력 아니면 No를 출력한다.
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int total = sc.nextInt();
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int money = sc.nextInt();
			int num = sc.nextInt();
			sum += (money*num); // 물건 가격과 개수를 입력받고 sum에 누적시킨다.
		}
		
		sc.close();
		
		if(total - sum == 0) { // 가격이 맞다면 Yes를 출력.
			System.out.println("Yes");
		}
		
		else System.out.println("No"); // 그렇지 않다면 No를 출력한다.

	}

}
