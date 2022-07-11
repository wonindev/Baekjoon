![image](https://user-images.githubusercontent.com/100292629/178206597-8a660b3b-eb8c-44dc-b00b-d97fa33adc8a.png)
---
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int arr[] = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(arr[ch-'a'] == -1) {
				arr[ch-'a'] = i ;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}
}

```