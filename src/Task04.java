public class Task04 {
    public static void main(String[] args) {
        System.out.println("Совершенные числа в диапазоне от 0 до 1000000:");
        for (int i = 0;i<=1_000_000;i++){
            int limit = i/2;
            int sum=0;
            for (int j=1; j<=limit;j++){
                if (i%j==0){
                    sum += j;
                }
            }
            if (sum==i) System.out.println(i);
        }
    }



    /*public static void main(String[] args) {
        int [] marsennaNumber = new int []{2, 3, 5, 7, 13, 17, 19, 41, 47, 61, 89, 107, 127};
        for(int i =0; i < 10; i++)
            System.out.println(findIdealNumber(marsennaNumber[i]));
    }

    public static long findIdealNumber(int count){
        return (long)( Math.pow(2, count-1)*(Math.pow(2, count)-1));
    }*/

}
