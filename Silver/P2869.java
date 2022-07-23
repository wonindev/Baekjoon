import java.util.Scanner;

public class P2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, V;
		A = sc.nextDouble();
		B = sc.nextDouble();
		V = sc.nextDouble();

		System.out.println((int) Math.ceil((V - A) / (A - B) + 1));
		sc.close();

	}

}
