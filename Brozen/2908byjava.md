![image](https://user-images.githubusercontent.com/100292629/178241130-1313385b-27f5-4e5a-91ab-f02c0652e739.png)
---
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.next();
		String b = scanner.next();
		
		int A = Integer.parseInt(new StringBuilder(a).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(b).reverse().toString());
		
		
		if(A>B) System.out.println(A);
		else System.out.println(B);
		scanner.close();
		
		
	}
}

```