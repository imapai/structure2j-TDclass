package base.recursive;

/**
 * Create By chengming on 2020/3/24 23:00
 */
public class TestRecursive {
    public static void main(String[] args) {
        // 多次循环StackOverflowError栈溢出
        print(10);
    }
    public static void print(int i){
        System.out.println(i);
        print(i-1);
    }
}
