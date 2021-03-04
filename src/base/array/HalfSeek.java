package base.array;

/**
 * Create By chengming on 2020/3/24 16:31
 */
public class HalfSeek {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        // 目标元素
        int target = 8;
        // 开始位置
        int begin = 0;
        // 结束位置
        int end = array.length-1;
        // 记录中间位置
        int mid = (begin+end)/2;
        // 记录目标下标
        int index = -1;
        // 记录查找次数
        int num=0;
        while (begin<=end){
            num++;
            if (target == array[mid]){
                index = mid;
                break;
            }else {
                // 目标元素比中间值小
                if (target<array[mid]){
                    end = mid-1;
                // 目标元素比中间值大
                }else {
                    begin = mid+1;
                }
                mid = (begin+end)/2;
            }
        }
        System.out.println("目标元素"+target+"的下标是"+index);
        System.out.println("查找次数："+num);
    }
}
