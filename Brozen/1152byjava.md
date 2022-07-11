![image](https://user-images.githubusercontent.com/100292629/178233701-8a277a9b-b14b-47af-a534-808eb55a2c30.png)
---
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println(st.countTokens());
		

		scanner.close();
	}
}

```