import java.util.Scanner;

public class P2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1, sum = 1, i=6;

		while (true) {
			if (num == 1) { // num이 1이면 1을 출력하고 종료
				System.out.println(count);
				break;
			}
			count++; //몇 번째 방에 있는지 확인하는 변수
			sum += i; // 벌집 모양이니까 6의 배수만큼 방의 크기가 증가한다. 1번째는 1 2번째는 6개 3번째는 12개 4번째는 18개
			if(num <= sum) {// 만약 num이 sum보다 작거나 같으면 해당하는 방을 출력한다.
				System.out.println(count);
				break;
			}
			i+=6; // num이 sum보다 크다는 뜻이니까 i를 6 증가시킨다. 
			
			
		}

	}

}
