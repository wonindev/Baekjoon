![image](https://user-images.githubusercontent.com/100292629/177499786-24c75d10-1374-4c03-bede-5c6cd43de97b.png)
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, temp = 0, sum = 0;
		n = scanner.nextInt();
		String str[] = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = scanner.next();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].substring(j, j + 1).equals("O")) {
					temp++;
					sum += temp;
				}

				else
					temp = 0;
			}
			System.out.println(sum);
			sum = 0;
			temp=0;
		}

	}

}


```