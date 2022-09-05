package information;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number = scanner.nextInt();
    static int array[]= new int[number];
    public static long findFibNumber(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i<=1) {
                 array[i] = i;
            }else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array[index];
    }
    public static void main(String[] args) {
        System.out.println(findFibNumber(10));
        //System.out.println(Arrays.toString(array));

    }
}
