import java.io.IOException;

public class PrePostIncrement {
    public static void main(String[] args) {
        int i  = 8;
        System.out.println(i++); // Value is used before increase. Hence, result 8
        System.out.println(++i); // Value is increased first. Therefore, results 10
        System.out.println(i++ * ++i); // 10 * 12 = 120
    }
}
