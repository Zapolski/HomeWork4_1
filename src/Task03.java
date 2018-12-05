public class Task03 {
    public static void main(String[] args) {

        System.out.println("Числа Амстронга в диапазоне от 10 до 1000000:");
        for (int i = 10; i <= 1_000_000; i++) {
            int countDigit = String.valueOf(i).length();
            int tmp=i;
            int sum=0;
            for (int j = 0; j < countDigit; j++) {
                sum = sum+(int)Math.pow(tmp%10,countDigit);
                tmp = tmp/10;
            }
            if (sum==i) System.out.println(i);
        }
    }
}
