package base.linkted;

/**
 * Create By chengming on 2020/3/24 20:31
 */
public class DoubleNode {
    // 上一个节点
    DoubleNode pre = this;
    // 下一个节点
    DoubleNode next = this;
    // 节点数据
    Object data;

    public DoubleNode(Object data) {
        this.data = data;
    }
    // 插入新的节点
    public void after(DoubleNode node) {
        // 当原来的下一个节点
        DoubleNode nextNext = this.next;
        // 新节点的上一个节点指向原来节点
        node.pre = this;
        // 新节点的下一个节点指向原来节点的下一个节点
        node.next = nextNext;
        // 原来节点的下一个节点指向新节点
        this.next = node;
        // 原来节点的下一个节点的上一个节点指向新节点
        nextNext.pre = node;

    }

    // 获取下一个节点
    public DoubleNode getNext() {
        return this.next;
    }
    // 获取上一个节点
    public DoubleNode getPre() {
        return this.pre;
    }
    // 获取data
    public Object getData() {
        return this.data;
    }
}
