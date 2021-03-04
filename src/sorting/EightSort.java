package sorting;

import java.util.Arrays;

/**
 * Create By chengming on 2020/3/25 11:02
 * 八大排序算法，冒泡，快速，插入，希尔，选择，归并，基数，队列
 */
public class EightSort {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,1,5,3,7,6};
//        int[] array = new int[]{1,2,3,4,5};
//        int[] array = new int[]{5,4,3,2,1};
        showArray(array);
//        bubbleSort(array);
//        selectSort(array);
//        insertSort(array);
//        quickSort(array,0,array.length-1);
//        shellSort(array);
//        merge(array,0,1,array.length-1);
//        mergeSort(array,0,array.length-1);
        showArray(array);

    }
    /**
     * 冒泡排序
     * 核心：两两交换，大的放后面，需要n-1次排序
     * @param array
     */
    public static void bubbleSort(int [] array){
        int number=0;
        for (int i=0;i<array.length-1;i++){
            int isChange=0;
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isChange = 1;
                }
                number++;
            }
            // 某一次冒泡未交换位置，则已经有序
            if (isChange == 0){
                break;
            }
        }
        System.out.println("循环次数是："+number);
    }

    /**
     * 选择排序
     * n-1次数排序
     * @param array
     */
    public static void selectSort(int[] array){
        // 外层循环控制次数
        for (int i=0;i<array.length-1;i++){
            int pos = 0;
            // 遍历未选择，找出最大值的下标
            for (int j=0;j<array.length-i;j++){
                if (array[j]>array[pos]){
                    pos = j;
                }
            }
            // 交换数据
            int temp = array[pos];
            array[pos] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }

    /**
     * 插入排序
     * 把以第一个元素当做是有序的，依次向前比较
     * @param array
     */
    public static void insertSort(int[] array){
        // 控制外层循环
        int temp;
        for (int i=1;i<array.length;i++){
            temp = array[i];
            int j=i;
            // 如果前面的以为大，那么把前一位赋值给自己，自己下标往前移动一位
            while (j>=1 && array[j-1]>temp){
                array[j] = array[j-1];
                j--;
            }
            // 找到合适的位置，将值插入
            array[j] = temp;
        }
    }

    /**
     * 希尔排序
     * @param array
     */
    public static void shellSort(int[] array){
        // 遍历所有步长
        for (int d= array.length/2;d>0;d/=2){
            // 遍历所有元素
            for (int i = d;i<array.length;i++){
                // 遍历本组中所有的元素
                for (int j=i-d;j>=0;j-=d){
                    // 如果当前元素大于所加步长后的那个元素
                    if (array[j]>array[j+d]){
                        int temp = array[j];
                        array[j] = array[j+d];
                        array[j+d] = temp;
                    }
                }
            }
        }
    }

    /**
     * 快速排序
     * @param array
     * @param start
     * @param end
     */
    public static void quickSort(int[] array,int start,int end){
        if (start<end){
            // 基准数
            int stard = array[start];
            // 记录下标
            int low = start;
            int high = end;
            while (low<high){
                // 右边的数比基准数大
                while (low<high && array[high]>= stard){
                    high--;
                }
                // 使用右边的数字替换左边的数
                array[low] = array[high];
                // 左边的数小于基准数
                while (low<high && array[low]<= stard){
                    low++;
                }
                array[high] = array[low];
            }
            // 把基准数赋值给重合位置
            array[low] = stard;
            // 递归处理
            // 处理小的部分
            quickSort(array,start,low);
            // 处理大的部分
            quickSort(array,low+1,end);
        }

    }

    // 显示数组顺序
    public static void showArray(int[] array){
        for (int i:array){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

}
