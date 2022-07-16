import java.math.BigInteger;
import java.util.Scanner;

public class P10757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.next()); // BigInteger 객체선언
		BigInteger B = new BigInteger(sc.next());
		A = A.add(B);
		System.out.println(A.toString()); //toString을 사용하여 String형으로 출력
	}

}
