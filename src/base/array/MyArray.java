package base.array;

import java.util.Arrays;

/**
 * Create By chengming on 2020/3/24 15:17
 */
public class MyArray {
    private Object[] elements;

    public MyArray() {
        elements = new Object[0];
    }

    // 获取数组的长度
    public int size() {
        return elements.length;
    }

    // 往数组末尾添加一个元素
    public void add(Object element) {
        // 创建新的数组
        Object[] newArr = new Object[elements.length+1];
        // 把原数组的内容复制到新数组
        for (int i=0;i<elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    // 显示数组的中的元素
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    // 删除数组的元素，传入删除的下标
    public void delete(int index){
        // 判断下标数组越界
        if (index<0 || index>elements.length-1){
            throw new RuntimeException("数组下标越界");
        }
        // 创建新数组
        Object[] newArr = new Object[elements.length - 1];
        for (int i=0;i<newArr.length;i++){ // 遍历新数组，为其赋值
            // 将index删除下标之前的数组赋值给新数组
            if (i<index){
                newArr[i] = elements[i];
            }else { // 将index下标后的值赋值给新数组，完成删除index元素
                newArr[i] = elements[i+1];
            }
        }
        // 将新数组复制给原数组，完成旧元素的删除
        elements = newArr;
    }
    // 获取指定数组下标的值
    public Object get(int index){
        // 判断下标数组越界
        if (index<0 || index>elements.length-1){
            throw new RuntimeException("数组下标越界");
        }
        return elements[index];
    }

    // 插入一个元素到指定位置
    public void insert(Object element,int index){
        Object[] newArr = new Object[elements.length + 1];
        for (int i=0;i<elements.length;i++){
            if (i<index){
                newArr[i] = elements[i];
            } else {
                newArr[i+1] = elements[i];
            }
        }
        newArr[index] = element;
        elements = newArr;
    }
    // 替换指定下标的元素，为指定值
    public void set(Object element,int index){
        // 判断下标数组越界
        if (index<0 || index>elements.length-1){
            throw new RuntimeException("数组下标越界");
        }
        elements[index] = element;
    }
}

