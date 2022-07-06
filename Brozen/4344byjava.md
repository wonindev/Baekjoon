![image](https://user-images.githubusercontent.com/100292629/177517066-95aec004-d08a-479c-893f-344b0d7a2c62.png)
```java
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, people, avg = 0, sum = 0, count = 0;
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			people = scanner.nextInt();
			int score[] = new int[people];
			for (int j = 0; j < people; j++) {
				score[j] = scanner.nextInt();
				sum += score[j];
			}
			avg = sum / people;
			for (int k = 0; k < people; k++) {
				if (score[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f",count/(double)people*100);
			System.out.println("%");
			sum=0;
			avg=0;
			count=0;
		}
		scanner.close();

	}
}
```