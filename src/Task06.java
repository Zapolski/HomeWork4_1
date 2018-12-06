public class Task06 {
    public static void main(String[] args) {

        int firstResult = 811;//минимальный множитель для 12345, чтобы получить восьмизначное число
        int diveder = 12345;
        int count = 0;
        int number;

        while (true){
            number=firstResult*diveder;
            if (number>=100_000_000){
                break;
            }
            else{
                if (checkNumber(number)){
                    System.out.println(number);
                    count++;
                }
                firstResult++;
            }
        }
        System.out.println(count);

    }

    public static boolean checkNumber(int num){

        boolean notHaveRepeat = true;
        int array[] = new int[(int)Math.log10(num)+1];//количество разрядов в числе
        //заполняем массив цифрами из числа
        for(int i = 0; i < array.length; i++) {
            array[i] = num%10;
            num/=10;
        }

        //проверяем каждую цифру с каждой
        for(int i = 0; i < array.length-1; i++) {
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]) {
                    notHaveRepeat = false;
                    break;
                }
            }
            if (!notHaveRepeat) break;
        }
        return notHaveRepeat;
    }
}
