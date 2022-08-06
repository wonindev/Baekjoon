import java.util.Scanner;

public class P3003 {

	public static void main(String[] args) {
		// 체스의 기물 중 개수가  몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 문제.
		// 만약 수가 양수라면 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.
		Scanner sc = new Scanner(System.in);

		// 1 1 2 2 2 8 각 기물의 정상 적인 개수

		int king, queen, rook, bishop, knight, pawn;

		king = sc.nextInt();
		queen = sc.nextInt();
		rook = sc.nextInt();
		bishop = sc.nextInt();
		knight = sc.nextInt();
		pawn = sc.nextInt();
		sc.close();
		
		System.out.println((1 - king) + " " + (1 - queen) + " " + (2 - rook) + " " + (2 - bishop) + " " + (2 - knight)
				+ " " + (8 - pawn)); // 정상적인 기물 개수에서 입력받은 개수만큼을 빼주면 된다.
		
		
	}

}
