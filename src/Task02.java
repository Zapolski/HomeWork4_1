public class Task02 {
    public static void main(String[] args) {
        System.out.println("Простые числа в диапазоне от 2 до 1000000:");
        for (int i = 2;i<=1_000_000;i++){
            int limit = (int)Math.sqrt(i);
            boolean flag = true;
            for (int j=2; j<=limit;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }
    }
}
