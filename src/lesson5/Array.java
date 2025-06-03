package lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        x = 10;
        System.out.println(x);
        System.out.println(y);


        int[] array = {x, y};
        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));




        char[] answer = {'Д','o','x','a'};



    }
}