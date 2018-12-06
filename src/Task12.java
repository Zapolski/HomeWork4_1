import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество километров за первый день (x): ");
        String xStr = sc.nextLine();
        System.out.print("Введите километраж для расчета (y): ");
        String yStr = sc.nextLine();

        int x = Integer.parseInt(xStr);
        int y = Integer.parseInt(yStr);

        int count = 1;
        float sum = x;
        while (sum<y){
            sum *= 1.1f;
            count++;
        }
        System.out.println("Количество дней для достижения требуемого километрожа: "+count);
    }

}
