![image](https://user-images.githubusercontent.com/100292629/178224337-dd98590f-d8c6-4999-83aa-70b1d5c9b6e5.png)
---
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		str = str.toLowerCase();
		int arr[] = new int[26];
	
    	
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a'] += 1;
		}

		int max = Arrays.stream(arr).max().getAsInt();
		
		int cnt=0, m=0;
		for (int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				cnt++;
				m = i;
				if (cnt>=2) {
					System.out.println("?");
					System.exit(0);
				}
			}
		}
		
		System.out.printf("%c", m+65);
		

		scanner.close();
	}
}

```