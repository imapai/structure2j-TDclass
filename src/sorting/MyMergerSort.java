package sorting;

import java.util.Arrays;

/**
 * Create By chengming on 2020/4/21 16:25
 */
public class MyMergerSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(array));
//        merge(array,0,2,array.length-1);
//        mergeSort(array,0,array.length-1);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int []arr){
        int []temp = new int[arr.length];//在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
        mergeSort(arr,0,arr.length-1,temp);
    }
    public static void mergeSort(int[] array,int low,int hight,int[] temp){

        System.out.println("low:"+low+",hight:"+hight);
        if (low<hight){
            int middle = (hight+low)/2;
            System.out.println(middle);
            // 处理左边
            mergeSort(array,low,middle,temp);
            // 处理右边
            mergeSort(array,middle+1,hight,temp);
            // 归并，递归
            merge(array,low,middle,hight,temp);
        }
    }
    public static void merge(int[] array,int low,int middle,int hight,int[] temp){
        // 记录第一个数据中需要遍历的下标
        int i = low;
        // 记录第二个数据中需要遍历的下标
        int j = middle+1;
        // 用于记录在临时数组中存放下标
        int index = 0;
        // 遍历连个数据取出小的数字，放入临时数组中
        while (i<=middle && j<=hight){
            // 把小的数字放入临时数组中
            if (array[i]<=array[j]){
                temp[index++] = array[i++];
            }else {
                temp[index++] = array[j++];
            }
        }
        // 处理多余的数据
        while (i<=middle){
            temp[index++] = array[i++];
        }
        while (j<=hight){
            temp[index++] = array[j++];
        }

        // 把临时数组中的数据重新放回原数组
        index = 0;
        while (low <= hight){
            array[low++] = temp[index++];
        }
    }

}
