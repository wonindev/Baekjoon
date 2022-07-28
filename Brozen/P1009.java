import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		// a의 b승 개의 데이터에 대하여 10개의 컴퓨터가 분산처리를 한다 예를 들어, 1번 데이터는 1번 컴퓨터, 2번 데이터는 2번 컴퓨터, 3번 데이터는 3번 컴퓨터, ... ,
        // 10번 데이터는 10번 컴퓨터, 11번 데이터는 1번 컴퓨터, 12번 데이터는 2번 컴퓨터 ... 
		// 즉 그 수의 1의 자리만 구하면 된다.

		Scanner sc = new Scanner(System.in);
		int result;
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result = 1;
			for (int j = 1; j <= b; j++) {
				result = (a * result) % 10; // b번 동안 반복하고 result에 a * result % 10을 넣어주므로 다음 반복 때 또 1의 자리만 구할 수 있게 된다.
			}
			
			if (result == 0) { // 0이면 10을 출력한다.
				System.out.println(10);
			} 
			
			else System.out.println(result); // 나머지는 그대로 출력한다.
		}
		sc.close();

	}

}
