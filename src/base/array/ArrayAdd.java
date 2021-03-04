package base.array;

import java.util.Arrays;

/**
 * 向一个数组添加一个新的元素
 * Create By chengming on 2020/3/24 11:50
 */
public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {23, 78, 10};
        System.out.println("打印数组数据："+ Arrays.toString(arr));
        // 添加目标元素
        int dis = 3;
        // 新建一个数组，长度加1
        int[] newArr = new int[arr.length+1];
        // 把数据放到新数组
        for (int i = 0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        System.out.println("newArr:\t"+Arrays.toString(newArr));
        // 添加新元素到新数组的末尾
        newArr[arr.length] = dis;
        System.out.println("newArr+dis:\t"+Arrays.toString(newArr));
        // 将新数组赋值给数组
        arr = newArr;
        System.out.println("新增后的arr\t"+Arrays.toString(arr));
    }
}
