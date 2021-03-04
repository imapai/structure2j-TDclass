package base.linkted;

/**
 * Create By chengming on 2020/3/24 17:48
 */
public class Node {
    // 节点内容
    Object data;
    // 下一个节点
    Node next;

    public Node(Object data){
        this.data = data;
    }

    // 追加节点
    public Node append(Node node){
//        this.next  = node;
        // 记录当前节点
        Node currentNode = this;
        //
        while(true){
            // 取出下一个节点
            Node nextNode = currentNode.next;
            // 为最后一个节点
            if (nextNode==null){
                break;
            }
            // 下一个节点赋值给下一个节点
            currentNode = nextNode;
        }
        currentNode.next = node;
        return currentNode;
    }
    // 获取节点数据
    public Object getData(){
        return this.data;
    }
    // 打印节点信息
    public void show() {
        Node currentNode = this;
        while (currentNode != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
        }
    }

    // 删除下一个节点
    public void removeNode() {
        Node nextNext = this.next.next;
        this.next = nextNext;
    }

    // 插入一个节点
    public void insert(Node node){
        // 获取当前节点的下一个节点
        Node next = this.next;
        // 赋值给新的节点作为下一个节点
        node.next = next;
        this.next = node;
    }
    // 当前节点是否为最后节点
    public boolean isLast() {
        return next==null;
    }

}
