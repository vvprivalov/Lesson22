import java.util.Arrays;

public class ArrayReform {

    public int[] arrayInOfOut(int[] arrayIn) {
        int count = -1;

        for (int i = arrayIn.length - 1; i >= 0; i--) {
            if (arrayIn[i] == 4) {
                count = i;
                break;
            }
        }

        if (count == -1) {
            throw new RuntimeException("В массиве нет ни одной четверки!!!");
        }

        int[] arrayOut = Arrays.copyOfRange(arrayIn, count + 1, arrayIn.length);

        return arrayOut;
    }

    public boolean arrayOneFour(int[] arrayIn) {
        int b1 = 0;
        int b2 = 0;

        for (int i = 0; i < arrayIn.length; i++) {
            if(arrayIn[i] != 1 & arrayIn[i] != 4) {
                return false;
            }
            if (arrayIn[i] == 1) {
                b1 = 1;
            }
            if (arrayIn[i] == 4) {
                b2 = 1;
            }
        }

        return b1 == b2;
    }
}
