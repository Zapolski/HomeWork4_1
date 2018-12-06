public class Task08 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 9; l++) {
                        if ((i==l)&&(j==k)){
                            System.out.println(""+i+j+":"+k+l);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
