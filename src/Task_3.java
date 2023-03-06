import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] newArr = {21, 2, 8, 54, 36, 28, 25, -12, 1, -8, 44, 18, 100, 568};
        System.out.println(Arrays.toString(newArr));

        for (int out = newArr.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (newArr[in] > newArr[in + 1]) {
                    int x = newArr[in];
                    newArr[in] = newArr[in + 1];
                    newArr[in + 1] = x;
                }

            }

        }
        System.out.println(Arrays.toString(newArr) + "- отсортированный массив");


    }
}

