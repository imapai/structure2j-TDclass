package base.array;

/**
 * Create By chengming on 2020/3/24 15:21
 */
public class TestMyArray {
    public static void main(String[] args) {
        // 创建一个MyArray的对象
        MyArray myArray = new MyArray();
        myArray.show();
        System.out.println(myArray.size());

        myArray.add(28);
        myArray.add(22);
        myArray.add(27);
        myArray.show();
        System.out.println(myArray.size());
        //删除
//        myArray.delete(100);
        System.out.println(myArray.get(0));
        myArray.show();
        // 添加
        myArray.insert(11,1);
        myArray.show();
        // 替换指定下标的元素，为指定值
        myArray.set(1,1);
        myArray.show();
    }
}
