package base.recursive;

/**
 * Create By chengming on 2020/3/24 23:34
 */
public class TestHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    /**
     *
     * @param n 共有n个盘子
     * @param from 开始位置的柱子
     * @param in   中间柱子
     * @param to   目标柱子
     */
    public static void hanoi(int n,char from,char in,char to) {

        if (n == 1){
            System.out.println("第1个盘子从"+from+"移动到"+to);
            // 无论多少盘子都只认为只有两个，上面所有盘子和下面一个盘子
        }else {
            // 移动上面盘子到中间位置
            hanoi(n-1,from,to,in);
            System.out.println("将第"+n+"个盘子从"+from+"移动到"+to);
            // 移动中间位置到目标位置
            hanoi(n-1,in,from,to);


        }
    }
}
