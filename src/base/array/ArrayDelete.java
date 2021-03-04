package base.array;

import java.util.Arrays;

/**
 * 删除数组中的元素
 * Create By chengming on 2020/3/24 14:51
 */
public class ArrayDelete {
    public static void main(String[] args) {
        // 需要删除的数组
        int[] arr = new int[] {1,23,47,99};
        // 要删除的下标
        int index = 0;

        int[] newArr = new int[arr.length-1];
        for (int i=0;i<newArr.length;i++){
            if (i<index){
                newArr[i]=arr[i];
            }else {
                newArr[i] = arr[i+1];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
