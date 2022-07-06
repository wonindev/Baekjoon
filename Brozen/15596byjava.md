![image](https://user-images.githubusercontent.com/100292629/177519490-59e90087-68e3-4d48-be56-a76202619277.png)

```java
public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i=0; i<a.length; i++) {
			ans += a[i];
		}
        return ans;
    }
}
```