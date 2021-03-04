package base.recursive;

/**
 * Create By chengming on 2020/3/25 10:44
 */
public class MyHanoi {
    public static void main(String[] args) {
        hanoi(2,'A','B','C');
    }

    /**
     *
     * @param n 汉诺塔的盘子的数量
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标柱子
     * @return 主要分三步，第一把n-1看做整体移动到中间柱子，第二步移动最下面的盘子到目标柱子，第三步把中间的n-1盘子移动到目标柱子
     */
    public static void hanoi(int n,char from,char in,char to){
        if (n == 1){
            System.out.println("把第"+n+"个盘子从"+from+"移动到"+to);
        }else {
            // 把n-1个盘子移动到中间柱子
            hanoi(n-1,from,to,in);
            // 把n从开始柱子移动到目标柱子
            System.out.println("把第"+n+"个盘子从"+from+"移动到"+to);
            // 把中间柱子的盘子移动到目标柱子
            hanoi(n-1,in,from,to);
        }
    }
}
