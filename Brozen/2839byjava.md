```java
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        int n,count=0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(n>=0){

            if (n%5==0){
                n=-5;
                count++;
            }

            else if(n%3==0){
                n=-3;
                count++;
            }

            else if(n>5){
                n-=5;
                count++;
            }

            else{
                count=-1;
                break;
            }

        }

        System.out.println(count);

    }
}
```

