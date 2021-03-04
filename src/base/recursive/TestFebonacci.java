package base.recursive;

/**
 * Create By chengming on 2020/3/24 23:05
 */
public class TestFebonacci {
    public static void main(String[] args) {
        int num=100;
        for (int j=1;j<num;j++){
            System.out.println("第"+j+"次打印："+febonacci(j));
        }


    }
    public static int febonacci(int i) {
        if (i==1 || i==2){
            return 1;
        }else {
            return febonacci(i-1)+febonacci(i-2);
        }

    }
}
