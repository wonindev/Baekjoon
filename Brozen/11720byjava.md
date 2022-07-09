![image](https://user-images.githubusercontent.com/100292629/178113347-62f8e144-450f-4091-a20e-17e8d09d0a24.png)
---
```java
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		String str = scanner.next();
		
		for (int i = 0; i < n; i++) {
			sum += str.charAt(i)-48;
		}

		System.out.println(sum);
		scanner.close();
	}

}
```