![image](https://user-images.githubusercontent.com/100292629/178209786-6a259113-b1a4-4df2-b92d-fed5af8b0bc7.png)
---
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int repeat;
		String str;
		for(int i = 0; i < n; i++) {
			repeat = scanner.nextInt();
			str = scanner.next();
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < repeat; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
		scanner.close();
	}
}

```
