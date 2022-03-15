![image](https://user-images.githubusercontent.com/100292629/158568155-57cf0841-af17-48db-8415-fd71a990de3b.png)
---
```java
import java.util.*;
public class Self {
	
	public static int fac(int n) {
		
		if(n==0) {
			return 1;
		}
		
		else{
			return n * fac(n-1);
		}
	}

	public static void main(String[] args) {
		
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		
		System.out.println(fac(n));
		
		

	}

}
```