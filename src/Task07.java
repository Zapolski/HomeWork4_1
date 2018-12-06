public class Task07 {
    public static void main(String[] args) {
        int number = 789465;
        //System.out.println(Integer.toBinaryString(number));

        for (int i = 31; i >= 0; i--) {
            int digit = (int)Math.pow(2,i);
            if ((number<0)&&(i==31)){
                System.out.print("1");
            }else{
                int tmp = number & digit;
                tmp = tmp/digit;
                System.out.print(tmp);
            }

        }
    }
}
