public class Task01 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int current;

        System.out.println("Числа Фибоначи в в диапазоне от 0 до 10000000:");
        System.out.println(n1);
        System.out.println(n2);

        while (true){
            current=n1+n2;
            if (current>=10_000_000) break;
            n1=n2;
            n2=current;
            System.out.println(current);
        }
    }
}

