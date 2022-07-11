![image](https://user-images.githubusercontent.com/100292629/178254294-a0d938ac-7aa5-4853-ac78-97834155e318.png)
---
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String str = scanner.next();
		String num[] = new String[10];
		num[0] = "123";
		num[1] = "456";
		num[2] = "ABC";
		num[3] = "DEF";
		num[4] = "GHI";
		num[5] = "JKL";
		num[6] = "MNO";
		num[7] = "PQRS";
		num[8] = "TUV";
		num[9] = "WXYZ";

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			String strTemp = String.valueOf(temp);
			
			for (int j = 0; j < num.length; j++) {
				if (num[j].contains(strTemp)) {
					sum += j+1;
				} else continue;

			}

		}
		System.out.println(sum);

		scanner.close();

	}
}

```