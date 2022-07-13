import java.util.Scanner;

public class P1712 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long A,B,C;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		if(B>=C) { //손익이 발생하지 않는 경
			System.out.println(-1); 
		}
		
		else { // 손익이 발생함, 수익 판매비용 - 가변비용이므로 고정비용/(판매비용-가변비용)의 다음으로
			   // 넘어가는 순간 손익이 발생
			System.out.println(A/(C-B)+1);
		}

	}

}
