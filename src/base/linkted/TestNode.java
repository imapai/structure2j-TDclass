package base.linkted;

/**
 * Create By chengming on 2020/3/24 17:57
 */
public class TestNode {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.append(n2).append(n3);

//        System.out.println(n1.next.next.getData());
        n1.show();
        n1.removeNode();
        n1.show();
        System.out.println("n1后插入n2");
        n1.insert(n2);
        n1.show();

    }
}
