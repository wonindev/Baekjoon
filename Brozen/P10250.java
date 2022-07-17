import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N, H, W,front,end;

		for (int i = 0; i < T; i++) {
			front = 0; // 층을 나타내는 변수
			end = 0;   // 호수를 나타내는 변수
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			
			if(N <= H) { // N이 H보다 작으면 무조건front=N, end=1이 된다
				front = N;
				end = 1;
			}
			else { // N이 H보다 큰 경우
				if(N % H == 0) { // N이 나누어 떨어지는 경우
					front = H;
					end = N / H;
				}
				else { // N이 나누어 떨어지지 않는 경우
					front = N % H;
					end = N / H + 1;
				}
				
			}	
			
			if(end<10) { // end가 10보다 작으면 0을 포함해서 출력
				System.out.println(front+"0"+end);
			}
			else { // 그렇지 않은 경우 front와 end를 바로 출력
				System.out.println(front+""+end);
			}
			
		}
		
	}

}
