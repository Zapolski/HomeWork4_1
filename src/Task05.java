import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String str = sc.nextLine();
        int number = Integer.parseInt(str);

        int tmp = number;
        int n1 = 0;
        while(tmp != 0){
            n1 = n1*10 + tmp%10;
            tmp /= 10;
        }
        System.out.println( number==n1 ? "YES":"NO" );
    }
}
