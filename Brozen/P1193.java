import java.util.*;

public class P1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, i = 1, show=0;

		while (true) {
			sum += i;
			if (sum >= n) { // n이 sum보다 작아지면 멈춘다.
				System.out.println(i); //가로 몇 번째 줄에 있는지 확인
				System.out.println(n - (sum - i)); //대각선 위에서부터 어떤 위치에 있는지 확인
				break;
			}
			i++;
		}

		for (int j = 0; j < n - (sum - i); j++) {
			show++;
		}
		
		if(i%2!=0) { // 지그재그로 가야하는데 실수로 대각선 오른쪽에서 왼쪽으로 내려오게
					 // 설정했다 그래서 i를 %2해서 방향을 다시 설정함.
			System.out.println((i-show+1)+"/"+show);
		}
		else {
			System.out.println(show+"/"+(i-show+1));
		}
		

	}

}
