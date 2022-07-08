![image](https://user-images.githubusercontent.com/100292629/178112249-a7cf6810-38d7-48a5-b9f2-aafadc7b3ee2.png)
---
```java
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (yesOrno(i) == true) {
				count++;
			}
			else {
				continue;
			}

		}

		System.out.println(count);
		scanner.close();
	}

	static boolean yesOrno(int num) {
		int ten = (num % 100) / 10;
		int one = (num % 100) % 10; 
		int d = ten - (num / 100);

		if (num > 99 && num <= 1000) {
			if (one - ten == d) {
				return true;
			}
			else {
				return false;
			}
		}
		
		else {
			return true;
		}
	}

}
```