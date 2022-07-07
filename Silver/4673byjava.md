![image](https://user-images.githubusercontent.com/100292629/177763239-fc99131e-8042-4f03-a342-2013aa5153d7.png)
---

```java

public class Main {

	public static void main(String[] args) {
		
		boolean selfnum[] = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			selfnum[i] = false;
		}

		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			if (n < 10001) {
				selfnum[n] = true;
			}
		}
		for (int i = 1; i < 10001; i++) {
			if(selfnum[i] == false) {
				System.out.println(i);
			}
		}

	}

	static int d(int num) {
		int sum = num;

		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}

		return sum;
	}

}

```