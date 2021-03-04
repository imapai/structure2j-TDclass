package base.stack;

/**
 * Create By chengming on 2020/3/24 17:10
 */
public class MyStack {
    // 底层使用数组实现
    Object[] elements;

    public MyStack(){
        elements = new Object[0];
    }

    // 压入元素
    public void push(Object element) {
        // 创建新数组就
        Object[] newArr = new Object[elements.length + 1];
        // 循环存入元素到新数组
        for (int i=0;i<elements.length;i++){
            newArr[i] = elements[i];
        }
        // 将新元素添加到数组的最后
        newArr[elements.length] = element;
        elements=newArr;
    }
    // 取出栈顶元素
    public Object pop(){
        if (elements.length==0){
            throw new RuntimeException("stack is empty!");
        }
        // 取出栈顶元素
        Object element = elements[elements.length-1];
        // 修改栈
        Object[] newArr = new Object[elements.length - 1];
        for (int i=0;i<newArr.length;i++){
            newArr[i] = elements[i];
        }
        // 替换原数组
        elements = newArr;
        // 返回栈顶元素
        return element;
    }

    // 查看栈顶元素
    public Object peek(){
        return elements[elements.length-1];
    }

    // 判断栈是否为空
    public boolean isEmpty() {
        return elements.length==0;
    }
}
