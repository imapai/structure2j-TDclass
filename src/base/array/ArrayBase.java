package base.array;

import java.util.Arrays;

/**
 * Create By chengming on 2020/3/24 11:40
 */
public class ArrayBase {

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int length = arr1.length;

        System.out.println("arr1's length:"+length);

        int element0 = arr1[0];
        System.out.println("arr1 element:"+element0);

        arr1[0] = 99;
        arr1[1] = 29;
        arr1[2] = 56;
        for (int a:arr1){
            System.out.println(a);
        }
        System.out.println("=====================");
        int[] arr2 = {1,2,3};
        int[] arr3 = {};
        arr3=arr2;
        System.out.println(Arrays.toString(arr3));
    }
}
