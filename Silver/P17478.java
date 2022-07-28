import java.util.Scanner;
public class P17478 {
	static String underbar = ""; // static으로 전역으로 선언하지 않고 로컬에서 선언하면 언더바가 사라진다.

	public static void main(String[] args) {
		// N에 따라 재귀적으로 문장을 출력한다.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		text(N); // 메소드 호출.
	}
	
	public static void text(int N) {
		String line = underbar; // 로컬변수 line으로 "____"를 늘리면 사라진다.
		
		if(N==0) { // N이 0이면 마지막이므로 return한다.
			System.out.println(line + "\"재귀함수가 뭔가요?\"");
			System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.println(line + "라고 답변하였지.");
			return;
		}
		
		System.out.println(line + "\"재귀함수가 뭔가요?\""); // N이 0 이상일 때.
		System.out.println(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		
		underbar += "____";
	
		text(N-1); // 재귀적으로 메소드 다시 호출.
		
		System.out.println(line + "라고 답변하였지.");
		
		
	}

}
