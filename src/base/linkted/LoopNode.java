package base.linkted;

/**
 * Create By chengming on 2020/3/24 20:18
 */
public class LoopNode {
    // 节点内容
    Object data;
    // 下一个节点
    LoopNode next=this;

    public LoopNode(Object data){
        this.data = data;
    }

    // 追加节点
    public LoopNode append(LoopNode node){
//        this.next  = node;
        // 记录当前节点
        LoopNode currentNode = this;
        //
        while(true){
            // 取出下一个节点
            LoopNode nextNode = currentNode.next;
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

    // 删除下一个节点
    public void removeNode() {
        LoopNode nextNext = this.next.next;
        this.next = nextNext;
    }

    // 插入一个节点
    public void after(LoopNode node){
        // 获取当前节点的下一个节点
        LoopNode next = this.next;
        // 赋值给新的节点作为下一个节点
        node.next = next;
        // 把新节点设置为下一个节点
        this.next = node;
    }
}
