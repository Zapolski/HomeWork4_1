import java.math.BigInteger;

public class Task10 {
    public static void main(String[] args) {
        //реализиуем алгоритм наименьшего общего кратного
        //НОК(a, b) = a * b / НОД(a, b).
        BigInteger res = BigInteger.ONE;
        for(int i = 1; i <= 20; i++)
        {
            BigInteger x = BigInteger.valueOf(i);
            res = res.multiply(x).divide(res.gcd(x));
        }
        System.out.println(res);
    }
}
