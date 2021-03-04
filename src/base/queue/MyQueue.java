package base.queue;

/**
 * Create By chengming on 2020/3/24 17:34
 */
public class MyQueue {
    private Object[] elements;

    public MyQueue() {
        elements = new Object[0];
    }
    // 入队
    public void add(Object element){
        Object[] newArr = new Object[elements.length + 1];

        for (int i=0;i<elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;

        elements = newArr;
    }

    // 出队
    public Object poll(){
        if (elements.length==0){
            throw new RuntimeException("queue is empty");
        }
        Object element = elements[0];
        Object[] newArr = new Object[elements.length - 1];
        for (int i=0;i<newArr.length;i++){
            newArr[i]=elements[i+1];
        }
        elements = newArr;
        return element;
    }
    // 判断是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }
}
